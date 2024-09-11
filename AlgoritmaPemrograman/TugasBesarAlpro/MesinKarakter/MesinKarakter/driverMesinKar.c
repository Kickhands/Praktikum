//Nama File         : driverMesinKar.c
//Deskripsi         : driver mesin karakter
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : 31/03/2024


#include <assert.h>
#include <fcntl.h>
#include <stdio.h>
#include "mesinKar.c"

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
   printf("Jumlah Karakter : %d\n", CountChar());
   printf("Jumlah karakter vokal : %d\n", CountVocal());
   printf("Jumlah karakter konsonan : %d\n", CountKonsonan());
   printf("Jumlah kata : %d\n", CountKata());
   printf("Jumlah kata 'LE': %d", CountLe());
   printf("\n=======================END================================\n");
   return 0;
}
