package Dasar.Pengenalan;
// apa itu inisiasi dan deklrasi variabel? 

public class DDeklarasi_Inisiasi {

    public static void main(String[] args) {
        /*
         * Variabel Adalah sebuah tempat untuk menampung data dimemori dimana tempat
         * tersebut dapat menampung nilai (data) yang dapat berubah-ubah selama proses
         * program. atau variabel juga disebut sebagai sebuah identifier yang mempunyai
         * nilai dinamis, arti kata dinamis disini bermaksud bahwa nilai variabel
         * tersebut dapat kita ubah sesuai kebutuhan dalam program.
         */

        // kita bebas menentukan tipe data dan nama variabel dengan ketentuannya
        // tersendiri.
        // agar lebih jelas dengan ketentuan pembuatan nama variabel silahkan googling.

        int b; // mendeklarasikan variabel a dengan tipe data integer

        // apa itu inisiasi?
        // inisialisasi dapat didefinisikan sebagai proses pengisian nilai awal (nilai
        // default) ke dalam sebuah variabel
        b = 12; // 12 merupakan inisiasi awal dalam sebuah variabel

        System.out.println("Sebelum melakukan Assignment : " + b);
        b = 5; // melakukan Assignment yang memperbaharui nilai dari awal variabel
        System.out.println("Setelah melakukan Assignment : " + b);
    }

}
