package Dasar.Latihan;

import java.util.Scanner;

/*
 *** sahrilputra
 */
public class HitungBeratIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis_kelamin, hasil;
        float berat, tinggi, meter, bmi;
        double broca;

        System.out.println("Pilih Jenis Kelamin : ");
        System.out.println("\t (1). Laki- Laki");
        System.out.println("\t (2). Perempuan");
        System.out.println("masukan anda :");
        jenis_kelamin = input.nextInt();

        System.out.println("Berat Badan anda : ");
        berat = input.nextFloat();
        System.out.println("Tinggi Badan Anda : ");
        tinggi = input.nextFloat();
        meter = tinggi / 100;

        bmi = (berat / (meter * meter));
        System.out.println("Bmi : " + bmi + " ");
        if (bmi < 18.5) {
            System.out.println("Kurus");
        } else if (bmi <= 22.9) {
            System.out.println("Normal");
        } else if (bmi < 24.9) {
            System.out.println("overWeight");
        } else {
            System.out.println("Obesitas");
        }

        switch (jenis_kelamin) {
            case 1:
                broca = ((tinggi - 100) - (0.10 * (tinggi - 100)));
                break;
            case 2:
                broca = ((tinggi - 100) - (0.15 * (tinggi - 100)));
                break;
            default:
                broca = 0;
        }

        hasil = (int) broca;
        System.out.println("Berat Badan Ideal Anda Menurut Broca " + hasil + " Kg");

        input.close();

    }
}
