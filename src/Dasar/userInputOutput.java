package Dasar;

import java.util.Scanner; //memanggil utilities Scanner agar bisa menggunakan Syntax Scanner

public class userInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // mendeklarasikan variabel input agar digunakan untuk menginput;
        String user; // mendeklarasikan variabel user

        System.out.println("Masukan inputan Anda : ");
        user = input.nextLine(); // syntax penggunaan Scanner agar dapat menerima inputan dari keyboard

        System.out.println("Hasil Input User : " + user);

        input.close(); // menutup Syntax inputan agar berhenti setelah program berhasil di jalankan
    }

}
