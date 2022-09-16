package Dasar.Latihan;

import java.util.Scanner;

public class volumeKerucut {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tinggi, jari;
        double phi = 3.14;
        double volume, hasil;
        System.out.print("Masukan Jari :");
        jari = input.nextInt();
        tinggi = 15;
        volume = phi * Math.pow(jari, 2) * tinggi;
        hasil = volume * 1 / 3;
        System.out.println(hasil);
    }

}
