package Dasar.Latihan;

import java.util.Scanner;

public class konversiSuhu {

    public static int kelvin, celcius, reamur, fahrenheit; // Deklarasi Global Variable

    static void reamur() { // Membuat Method Reamur
        reamur = celcius * 4 / 5; // rumus Reamur memasukan hasil rumus ke dalam variable reamur
        System.out.println("\t REAMUR : " + reamur); // menampilkan hasil reamur
    }

    static void kelvin() {
        kelvin = celcius + 273;
        System.out.println("\t KELVIN : " + kelvin);
    }

    static void fahrenheit() {
        fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("\t FAHRENHEIT : " + fahrenheit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membuat variabel input dengan scanner
        System.out.println("=========== Konversi Suhu ==========");
        System.out.println("\nMasukkan Suhu Celcius Yang Akan Di Konversikan : ");
        celcius = input.nextInt(); // user menginput data dan di masukan ke dalam variable celcius
        System.out.println("Hasil Setelah Konversi Celcius Ke- : ");

        reamur(); // memanggil method agar tampil
        kelvin();
        fahrenheit();
        input.close();
    }

}
