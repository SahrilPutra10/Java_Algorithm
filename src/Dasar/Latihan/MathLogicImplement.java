package Dasar.Latihan;

import java.util.Scanner;

public class MathLogicImplement {

    static void VolumeBola() {
        Scanner input = new Scanner(System.in);
        int jari;
        double volume, luas;

        System.out.println("Masukan Jari-Jari Bola : ");
        jari = input.nextInt();

        volume = (4 / 7) * (22 / 7) * Math.pow(jari, 3);
        luas = 4 * (22 / 7) * Math.pow(jari, 2);

        System.out.println("Volume : " + volume);
        System.out.println("Luas : " + luas);
        input.close();
        inputUser();
    }

    static void kerucut() {

        // terdapat error pada method ini akan segera diperbaiki
        Scanner input = new Scanner(System.in);
        int jari, tinggi;
        double volume;

        System.out.println("Masukkan Jari-Jari Alas Kerucut : ");
        jari = input.nextInt();
        System.out.println("Masukan Tinggi Kerucut : ");
        tinggi = input.nextInt();

        volume = (1 / 3) * (22 / 7) * Math.pow(jari, 2) * tinggi;

        System.out.println("Volume kerucut Adalah : " + volume);
        input.close();
        inputUser();
    }

    static void HitungJarak() {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        double a, b, jarak;

        System.out.println("Masukkan titik Kordinat x1 :");
        x1 = input.nextInt();
        System.out.println("Masukkan titik Kordinat y1 : ");
        y1 = input.nextInt();
        System.out.println("Masukan titik Kordinat x2 : ");
        x2 = input.nextInt();
        System.out.println("Masukkan titik Kordinat y2 : ");
        y2 = input.nextInt();

        a = (y2 - x2) * (y2 - x2);
        b = (y1 - x1) * (y1 - x1);

        jarak = Math.sqrt(a + b);

        System.out.println("Jaraknya adalah : " + jarak);
        input.close();
        inputUser();

    }

    static void inputUser() {
        Scanner input = new Scanner(System.in);
        int pilih;

        System.out.println("===========");
        System.out.println("pilih Proggram");
        System.out.println("1. Hitung Volume dan Luas Bola ");
        System.out.println("2. Hitung Volume Kerucut ");
        System.out.println("3. Hitung Jarak ");
        System.out.println("\tMasukan Anda : ");

        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                VolumeBola();
                break;
            case 2:
                kerucut();
                break;
            case 3:
                HitungJarak();
                break;
            default:
                System.out.println("Pilih tidak valid");
                break;
        }

        input.close();
    }

    public static void main(String[] args) {
        inputUser();
    }
}