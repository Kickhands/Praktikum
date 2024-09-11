//Nama File         : mesinKar.h
//Deskripsi         : prototype mesin karakter
//Nama              : GIGIH HAIDAR FALAH
//Tanggal Pembuatan : 31/03/2024

#ifndef MESINKAR_H
#define MESINKAR_H

#define False 0
#define True 1

#ifndef MARK
#define MARK '.'
#endif

#ifndef ENTER
#define ENTER 10
#endif

/*Prototype*/
void START();
/* I.S. sembarang */
/* F.S. CC adalah karakter pertama pita */
/*      Jika CC==MARK, EOP menyala(true) */
/*      Jika CC!=MARK, EOP padam(false) */

void ADV();
/* I.S. CC!=MARK */
/* F.S. CC adalah karakter berikutnya CC pada I.S */
/*      Jika CC==MARK, EOP menyala(true) */

int EOP();
/* mengirimkan true jika CC==MARK */

int CountVocal();
/* mengirimkan jumlah huruf vokal */

int CountKonsonan();
/* mengirimkan jumlah huruf konsonan */

int CountChar();
/* mengirimkan jumlah karakter */

int CountKata();
/* mengirimkan jumlah kata */

int CountLe();
/* mengirimkan jumlah pasangan huruf 'LE' yang ada dalam kalimat */

#endif // MESINKAR_H_INCLUDED
