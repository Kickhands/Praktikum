//Nama File         : MesinKarH.c
//Deskripsi         : body prototype mesin karakter
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : 31/03/2024

#ifndef MESINKAR_C
#define MESINKAR_C

#include <assert.h>
#include <fcntl.h>
#include <stdio.h>
#include "mesinKarH.h"

/* definisi states */
char CC;
/* definisi Pita */
char Pita_karakter[100]="source.html";
static FILE *FILEKU;



//Body Prototype
void START()
/* I.S. sembarang */
/* F.S. CC adalah karakter pertama pita */
/*      Jika CC==MARK, EOP menyala(true) */
/*      Jika CC!=MARK, EOP padam(false) */


{
   FILEKU=fopen(Pita_karakter,"r");
   CC=fgetc(FILEKU);
}

void ADV()
/* I.S. CC!=MARK */
/* F.S. CC adalah karakter berikutnya CC pada I.S */
/*      Jika CC==MARK, EOP menyala(true) */
{
   CC=fgetc(FILEKU);
   if(CC==EOF){
       fclose(FILEKU);
   }
}

int EOP()
/* mengirimkan true jika CC==MARK */
{
   return (CC==EOF);
}

int CountTag()
/*MENGHITUNG BANYAKNYA TAGAR HTML*/
{
   //Kamus Lokal
   int count = 0;

   //Algoritma
   START();
   while (!EOP())
   {
       ADV();
       if(CC == '<'){
           ADV();
           if(CC =='/'){
                count++;
           }
       }
   }
   return count;
}

void PrintTag()
/* MENAMPILKAN TAGAR HTML */
{
    //Kamus Lokal

    //Algoritma
    START();
    while (!EOP())
    {
        if (CC == '<') {
            ADV();
            if (CC != '/') {
                while (CC != '>' && !EOP()) {
                    printf("%c", CC);
                    ADV();
                    if (CC == '>'){
                        printf(" ");
                    }
                }
           }
       }
       ADV();
   }
}




#endif
