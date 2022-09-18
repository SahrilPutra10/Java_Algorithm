/*
 * Pemrograman Java terdiri dari 3 komponen dasar yaitu Input, Proses dan Output.
 * Input : Nilai yang dimasukkan
 * Proses : Serangkaian langkah yang dilakukan untuk mengelola input yang diberikan
 * Output : Menampilkan hasil olah data.
 */
// jenis input
/*
 * Pada bahasa pemrograman Java, Basic Input-nya 
 * sudah dibekali beberapa library untuk membantu pengambilan Input berbasis teks. Beberapa di antaranya:
    Bufferedreader
    Scanner
 */

//Jenis output
/*
 * Sedangkan untuk menampilkan atau Output dari program adalah: 
 * Print
 * Println
 */

package Dasar.Pengenalan;

import java.util.Scanner;
//#1
//Scanner merupakan kelas yang menyediakan fungsi-fungsi untuk membaca
//dan mengambil input dari pengguna. Scanner memiliki kemudahan yang dapat 
//membaca teks, baik yang memiliki tipe data primitif maupun string.

public class inputOutput {
    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in); // inisiasi awal scanner
        // Kode di atas merupakan inisialisasi awal ketika akan menggunakan Scanner. Di
        // bagian ini kita mencoba untuk menggunakan perintah mengambil input yang
        // diberikan oleh user. Bila program dijalankan, setiap input yang diberikan
        // akan disimpan oleh variabel baca.
        System.out.println("Masukan angka :");
        int value = baca.nextInt();
        // kita akan mengambil data yang telah dimasukkan melalui Scanner.
        // Dengan memanggil Scanner.nextInt() setiap Input dari keyboard akan diberikan
        // ke value.

        /* Catatan Penggunaan Scanner */
        // penggunaan fungsi Scanner.
        // Pengambilan data sangat bergantung pada tipe data yang dimasukan. Ini harus
        // sesuai,
        // misalnya untuk string, panggilah Scanner.next(). Jika data yang diinputkan
        // Integer, panggilah Scanner.nextInt(). Jika input tidak sesuai, program akan
        // menemui eror.

        /* Perintah output */
        System.out.println("Dicetak pakai println()"); // Penggunaan println akan menampilkan teks dan tambahan baris
                                                       // baru.
        System.out.println("Ini juga dicetak pakai println()");
        System.out.print("Ini dicetak dengan print()"); // Sedangkan fungsi print menampilkan output berupa teks
                                                        // sesuai dengan yang dimasukkan.
        System.out.print(" dan ini juga dicetak dengan print()");

    }
}
