package Dasar.Latihan;

import java.util.Scanner;

public class MathLogicImplement {
    public static Scanner input = new Scanner(System.in);
    public static double phi = 3.14;

    static void VolumeBola() {

        int jari;
        double volume, luas, hasilVolume;
        System.out.println("\tVOLUME BOLA");

        System.out.println("Masukan Jari-Jari Bola : ");
        jari = input.nextInt();

        volume = phi * Math.pow(jari, 3);
        hasilVolume = volume * 4 / 7;
        luas = 4 * phi * Math.pow(jari, 2);

        System.out.println("Volume : " + hasilVolume);
        System.out.println("Luas : " + luas);

        inputUser();
    }

    static void kerucut() {

        int jari, tinggi;
        double volume, hasil;
        System.out.println("\tHITUNG VOLUME KERUCUT");

        System.out.println("Masukkan Jari-Jari Alas Kerucut : ");
        jari = input.nextInt();
        System.out.println("Masukan Tinggi Kerucut : ");
        tinggi = input.nextInt();

        volume = phi * Math.pow(jari, 2) * tinggi;
        hasil = volume * 1 / 3;

        System.out.println("Volume kerucut Adalah : " + hasil);

        inputUser();
    }

    static void luasPanjangSegitiaSisi() {
        System.out.println("LUAS SEGITIA PANJANG SISI");
        double luas, s;
        int a, b, c;

        System.out.println("Masukan Panjang Sisi A : ");
        a = input.nextInt();
        System.out.println("Masukan Panjang Sisi B : ");
        b = input.nextInt();
        System.out.println("Masukan Panjang sisi C : ");
        c = input.nextInt();

        s = a + b + c / 2;
        luas = Math.sqrt((s - a) + (s - b) + (s - c));
        System.out.println(s);
        System.out.println("Hasil Luas Segitiga Panjang Sisi Adalah : " + luas);
        inputUser();

    }

    static void HitungJarak() {

        int x1, x2, y1, y2;
        double a, b, jarak;
        System.out.println("\tJARAK ");

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
        inputUser();

    }

    static void hitungLuasSegitiga() {
        int x1, x2, y1, y2, x3, y3;
        double a, b, c;
        double s, luas;
        System.out.println("\nHITUNG LUAS SEGITIGA");

        System.out.println("Masukkan titik Kordinat x1 :");
        x1 = input.nextInt();
        System.out.println("Masukkan titik Kordinat y1 : ");
        y1 = input.nextInt();
        System.out.println("Masukan titik Kordinat x2 : ");
        x2 = input.nextInt();
        System.out.println("Masukkan titik Kordinat y2 : ");
        y2 = input.nextInt();
        System.out.println("Masukan titik Kordinat x3 : ");
        x3 = input.nextInt();
        System.out.println("Masukan titik Kordinat y3 : ");
        y3 = input.nextInt();

        a = (y2 - x2) * (y2 - x2);
        b = (y1 - x1) * (y1 - x1);
        c = (y3 - x3) * (y3 - x3);

        s = a + b + c / 2;
        luas = Math.sqrt((s - a) + (s - b) + (s - c));
        System.out.println("Luas Segitiga adalah : " + luas);

        inputUser();
    }

    static void inputUser() {

        int pilih;

        System.out.println("===========");
        System.out.println("pilih Proggram");
        System.out.println("1. Hitung Volume dan Luas Bola ");
        System.out.println("2. Hitung Volume Kerucut ");
        System.out.println("3. Hitung Panjang Segitiga Sama Sisi ");
        System.out.println("4. Hitung Jarak ");
        System.out.println("5. Hitung Luas Segitiga ");
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
                luasPanjangSegitiaSisi();
                break;
            case 4:
                HitungJarak();
                break;
            case 5:
                hitungLuasSegitiga();
                break;
            default:
                System.out.println("Pilih tidak valid");
                break;
        }

    }

    public static void main(String[] args) {
        inputUser();
    }
}