//1.0 Apa itu package?
//package merupakan root folder dari kelas main. 
//bahasa lainya, package merupakan lokasi dari kelas Main.
package Dasar.Pengenalan;

/*# 1.1 Kegunaan package
 * Setiap class di program Java diletakkan dalam sebuah package,
 * yakni mekanisme penempatan/penamaan class agar lebih terstruktur atau modular.
 * 
 * Biasanya pakcage digunakan untuk membedakan class dengan nama yang sama.
 * 
 * #1.2 cara kerja package 
 * Ketika setiap class diletakkan di dalam sebuah package Kita dapat memanggil class tertentu diantara kelas yang lain 
 * caranya dengan memanggil nama package secara lengkap, kemudian diikuti nama class-nya. 
 * cth : latihan.dasar.Main; 
 */

//#2.0 IMPORT
/* Import biasanya digunakan untuk menyederhanakan pemanggilan class yang berbeda package
 * dengan kata lain kita dapat menggunakan syntax atau keyword dari class yang berbeda file
 * atau biasa disebut kita dapat mengakses kata kunci dari file yang berbeda / modul;
 * 
 * cth penggunaan import 
 * import java.util.Scanner;
 */

public class strukturDasar { // sebuah class constructor
    /*
     * #3.0 Constructor
     * Constructor merupakan suatu method yang akan memberikan nilai awal pada saat
     * suatu objek dibuat. Pada saat program dijalankan,
     * constructor akan langsung memberikan nilai awal pada saat perintah new,
     * dan langusng membuat suatu objek.
     */
    public static void main(String[] args) { // method class main
        /*
         ** #4.0 Method
         * adalah kumpulan baris kode yang dikelompokkan untuk menjalankan tugas
         * tertentu. Sebuah method dapat mengembalikan nilai tertentu (memiliki return
         * value), bisa juga tidak (void).
         */
        System.out.println("Hello World");
    }
}
