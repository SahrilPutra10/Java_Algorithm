package Dasar;

/*
 *** Sahrilputra
 */
// program dengan operator matematika
import java.util.Scanner;
import java.lang.Math;
// MENGHITUNG RUMUS

public class operator {

    // Hitung Luas Segi
    static void hitungLuasPersegi() {
        System.out.println("Hitung Luas Persegi");
        Scanner input = new Scanner(System.in);
        int luas;
        int sisi;

        System.out.println("masukan Sisi");
        sisi = input.nextInt();

        luas = sisi * sisi;
        System.out.format("luasnya persegi adalah : %d", luas);
        System.out.println("\n\n");
        inputUser();
    }

    // Hitung Segi panjang
    static void hitungSegiPanjang() {
        System.out.println("Hitung Luas Segi Panjang");
        Scanner input = new Scanner(System.in);
        int luas;
        int lebar;

        System.out.println("masukan luas segipanjang :");
        luas = input.nextInt();
        System.out.println("Masukan Lebar : ");
        lebar = input.nextInt();
        int hasil = luas * lebar;
        System.out.format("hasil : %d", hasil);
        System.out.println("\n\n");
        inputUser();

    }

    // HITUNG LUAS LINGKARAN
    static void luasLingkaran() {

        Scanner input = new Scanner(System.in);
        int jari;
        double phi = 3.14, luas;

        System.out.println("Luas Lingkaran");

        System.out.println("Masukan jari-jari lingkaran : ");
        jari = input.nextInt();

        luas = phi * jari * jari;
        System.out.format("Hasil Luas Lingkaran adalah : %f", luas);
        System.out.println("\n\n");
        inputUser();
    }

    // HITUNG VOLUME BALOK
    static void volumeBalok() {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi;
        int volume;
        String dimensi;

        System.out.println("Menghitung Volume Balok ");
        System.out.println("masukan Panjang :");
        panjang = input.nextInt();
        System.out.println("Masukan Lebar :");
        lebar = input.nextInt();
        System.out.println("Masukan Tinggi :");
        tinggi = input.nextInt();

        volume = panjang * lebar * tinggi;
        System.out.println("Masukkan Satuan (mm/cm/m) dimensi balok :");
        dimensi = input.next();

        System.out.format("Volume balok : %d %s", volume, dimensi);
        System.out.println("\n\n");
        inputUser();
    }

    static void sisiMiringSegitigaSiku() {
        Scanner input = new Scanner(System.in);
        float alas, tinggi;
        double miring;

        System.out.println("Hitung miring Segita Siku Siku");
        System.out.println("Masukan Alas :");
        alas = input.nextFloat();
        System.out.println("Masukan Tinggi :");
        tinggi = input.nextFloat();

        miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        System.out.format("Panjang Sisi miring Segitiga siku-siku adalah : %f", miring);
        System.out.println("\n\n");
        inputUser();
    }

    static void inputUser() {
        int inputUser;
        Scanner inputanUser = new Scanner(System.in);
        System.out.println("================= Hello  =================");
        System.out.println("==========================================");
        System.out.println("Daftar Program: ");
        System.out.println("(1). Hitung Luas Persegi ");
        System.out.println("(2). Hitung Segi Panjang ");
        System.out.println("(3). Hitung Luas Lingkaran ");
        System.out.println("(4). Hitung Volume Balok ");
        System.out.println("(5). Hitung Sisi Miring Segitiga ");
        System.out.println("\n\n");
        System.out.println("Masukan = ");
        inputUser = inputanUser.nextInt();
        System.out.println("\n\n");

        switch (inputUser) {
            case 1:
                hitungLuasPersegi();
                break;
            case 2:
                hitungSegiPanjang();
                break;
            case 3:
                luasLingkaran();
                break;
            case 4:
                volumeBalok();
                break;
            case 5:
                sisiMiringSegitigaSiku();
                break;

            default:
                System.out.println("Masukan Salah");
                break;
        }
    }

    public static void main(String[] args) {
        inputUser();

    }

}
