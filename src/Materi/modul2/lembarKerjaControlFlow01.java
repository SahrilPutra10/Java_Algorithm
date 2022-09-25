package Materi.modul2;

import java.util.Scanner;

public class lembarKerjaControlFlow01 {
    public static void main(String[] args) {
        int kali;
        Scanner inp = new Scanner(System.in);
        System.out.println("Program Perkalian");
        System.out.print("Masukan angka yang ingin di kalikan :");
        kali = inp.nextInt();
        System.out.print("Masukan banyaknya Perkalian :");
        int banyak = inp.nextInt();

        for (int i = 0; i <= banyak; i++) {
            int hasil = kali * i;
        }
        inp.close();
    }
}
