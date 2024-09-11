//Nama File         : driverMesinKarH.c
//Deskripsi         : driver mesin karakter
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : 31/03/2024

#include <assert.h>
#include <fcntl.h>
#include <stdio.h>
#include "mesinKarH.c"

/* definisi states secara global*/
char CC;

int main(){
   /*kamus*/

   /*algoritma*/
   printf("Awal pita..........\n");
   START();
   while (!EOP())
   {
	   printf("%c",CC);
	   ADV();
   }
   printf("\n............Akhir pita, bye\n");

   printf("\n================Soal latihan dan Penugasan================\n");
   printf("Tag dalam pita ada : %d\n", CountTag());
   printf("Tag nya adalah : ");
   PrintTag();
   printf("\n=======================END================================\n");
   return 0;
}

