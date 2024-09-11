//Nama File         : mesinKar.c
//Deskripsi         : body prototype mesin karakter
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : 31/03/2024

#ifndef MESINKAR_C
#define MESINKAR_C

#include <assert.h>
#include <fcntl.h>
#include <stdio.h>
#include "mesinKar.h"

/* definisi states */
char CC;
/* definisi Pita */
char Pita_karakter[100]="Pita.txt";
static FILE *FILEKU;
static int retval;



/*Body Prototype*/
void START()
/* I.S. sembarang */
/* F.S. CC adalah karakter pertama pita */
/*      Jika CC==MARK, EOP menyala(true) */
/*      Jika CC!=MARK, EOP padam(false) */


{
   FILEKU=fopen(Pita_karakter,"r");
   retval=fscanf(FILEKU,"%c",&CC);
}

void ADV()
/* I.S. CC!=MARK */
/* F.S. CC adalah karakter berikutnya CC pada I.S */
/*      Jika CC==MARK, EOP menyala(true) */
{
   retval=fscanf(FILEKU,"%c",&CC);
   if(CC==MARK)
   {
      fclose(FILEKU);
   }
}

int EOP()
/* mengirimkan true jika CC==MARK */
{
   return(CC==MARK);
}

int CountChar(){
    //Kamus Lokal
    int count=0;

    //Algoritma
    START();
    while (!EOP()){
        ADV();
        if (CC != ' '){
            count++;
        }
    }
    return count;
}

int CountVocal(){
    //Kamus Lokal
    int count=0;

    //Algoritma
    START();
    while (!EOP()){
        ADV();
        if(CC=='A'||CC=='I'||CC=='U'||CC=='E'||CC=='O'||CC=='a'||CC=='i'||CC=='u'||CC=='e'||CC=='o'){
            count++;
        }
    }
    return count;
}

int CountKonsonan(){
    //Kamus Lokal
    int count=0;

    //Algoritma
    START();
    while (!EOP()){
        ADV();
        if(CC!='A'||CC!='I'||CC!='U'||CC!='E'||CC!='O'||CC!='a'||CC!='i'||CC!='u'||CC!='e'||CC!='o'){
            count++;
        }
    }
    return count;
}

int CountKata(){
    //Kamus Lokal
    int count=0;

    //Algoritma
    START();
    while(!EOP()){
        ADV();
        if(CC== MARK || CC==' '){
            count++;
        }
    }
    return count;
}

int CountLe(){
    //Kamus Lokal
    int count=0;

    //Algoritma
    START();
    while(!EOP()){
        ADV();
        if(CC=='L'){
            ADV();
            if(CC=='E'){
                count++;
            }
        }
    }
    return count;
}
#endif
