package Dasar.Pengenalan;

//  Tipe data adalah sebuah pengklasifikasian data berdasarkan jenis data tersebut. 
public class TipeData {
    public static void main(String[] args) {

        /*
         * #1.0TIPE DATA
         * Java merupakan bahasa pemrograman yang strongly typed, maka kita tidak bisa
         * mengabaikan tipe data. Kita harus tahu data seperti apa yang disimpan ke
         * dalam variabel. Selain itu, Java juga bersifat statically typed, yang artinya
         * setiap variabel harus dideklarasikan terlebih dahulu sebelum digunakan.
         * 
         * Pada Java Terdapat 2 (dua) jenis tipe data pada Java, yaitu tipe data
         * primitive/primitif dan reference/referensi.
         * 
         * #1.1 Tipe data primitive
         * Tipe data primitif adalah tipe data standar yang tidak diturunkan dari objek
         * manapun. Tipe data primitif telah ditentukan dengan kata kuncinya
         * masing-masing
         */

        /*
         * untuk memudahkan kita memahami tipe data primitive saya membaginya dalam 3
         * bagian
         * yaitu tipe data numberik, kata, dan bolean
         */
        // tipe data berdasarkan numberik;

        // BYTE
        byte mybyte = 10; // Tipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang
                          // kecil. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat
                          // ruang dalam array yang besar.

        // SHORT
        short shorVal = 15000; // Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam
                               // range menengah,bisa digunakan untuk menghemat memori seperti tipe data byte
                               // namun hanya 2 (dua) kali lebih kecil dari tipe data int.

        // INT
        int a = 1; // Int adalah tipe data integer yang menyimpan data bilangan bulat
                   // Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam
                   // range cukup besar.

        // Long
        long longVal = 15000L; // Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe
                               // data int. Ukurannya 64 bit Tipe data long memiliki nilai default 0L.

        // FLOAT
        float f = 3.5f; // Merupakan sebuah tipe data yang
                        // bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.
                        // tipe data yang menampung dan menyimpan data desimal.
        // DOUBLE
        double b = 1.2; // Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki
                        // kapasitas yang lebih besar. Nilai default-nya 0.0d.

        // ** tipe data berdasarkan Kata/String;

        // CHAR
        char c = 'C'; // Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter.
                      // Nilai karakter tersebut dibungkus di dalam tanda ' '.
                      // tipe data char bisa juga mengkonversi nilai menjadi simbol karakter dengan
                      // mengkonversinya dari ASCII
        // STRING
        String s = "Hello world"; // tipe data String yang menyimpan kata/kalimat yang panjang;

        // tipe data boolean
        boolean myBolean = true; // tipe data perbandingan, Merupakan sebuah tipe data yang memiliki 2 (dua)
                                 // macam nilai, yaitu true dan false. Nilai default-nya false.

        System.out.println("byte : " + mybyte);
        System.out.println("short :" + shorVal);
        System.out.println("int : " + a);
        System.out.println("Long :" + longVal);
        System.out.println("float : " + f);
        System.out.println("Double : " + b);
        System.out.println("Char : " + c);
        System.out.println("String : " + s);
        System.out.println("Boolean : " + myBolean);
    }
}
