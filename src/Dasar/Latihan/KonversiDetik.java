package Dasar.Latihan;

import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, menit, detik, konversi;

        System.out.println("Masukan Waktu yang ingin di konversikan :");
        konversi = input.nextInt();

        jam = konversi / 3600;
        menit = (konversi % 3600) / 60;
        detik = (konversi % 3600) % 60;
        System.out.format("Konversi dari : %d detik adalah \n", konversi);
        System.out.println(jam + " jam, " + menit + " Menit, " + detik + " Detik.");

        input.close();
    }
}
