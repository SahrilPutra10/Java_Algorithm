package Dasar;

// Apa itu ekspresi bagaimana cara menggunakan ekspresi. 

// Bagaimana cara membedakan ekspresi dan statment? 

/*
 * Dalam pemograman terdapat Statment dan juga ekspresi yang berperan sebagai instruksi pemograman.
 * 
 * Membedakan Statment dan ekspresi 
 * STATMENT adalah unit sintaks pada bahasa pemrograman yang menyatakan aksi atau tugas untuk dilakukan.
 * 
 * EKSPRESI adalah entitas sintaks pada bahasa pemrograman yang menghasilkan sebuah nilai.
 */

public class expression {
    public static void main(String[] args) {
        // menggunakan expresi dan statment
        // 1. Penggunaan Statment
        // cth.
        int a, b; // meruapakan statment yang mendeklarasikan instruksi

        a = 3; // merupakan ekspresi karena menghasilkan nilai
        b = 4;
        a = a + b; // membuat expresi
        /**
         * Ekspresi
         * a + b adalah sebuah expresi karena menghasilkan nilai dan disimpan dalam
         * variable a;
         */

        // contoh 2
        int i = 12 * 2;
        System.out.println(i);
        /*
         * mendeklarasikan statment dan juga ekspresi
         * i = 12 * 2 ; merupakan eksprsi karena menghasilkan nilai dan menyimpannya
         * kedalam variable i;
         * dan int i merupakan sebuah statment yang mendeklarasikan variable ;
         */

        // kumpulan Ekspresi operator matematika
        a = 0;
        int kali = a * b; // perkalian
        int tambah = a + b; // tamhbah
        int kurang = a - b; // kurang
        int bagi = a / b; // bagi
        int modulus = a % b; // modulus;

        System.out.println(kali);
        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(bagi);
        System.out.println(modulus);

    }
}
