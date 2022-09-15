package Dasar.ControlStructure.Percabangan;

import java.util.Scanner;

public class GradeNilai {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.println("Masukan Nilai Anda : ");
        nilai = input.nextInt();
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Grade Anda A");
        } else if (nilai > 60 && nilai <= 80) {
            System.out.println("Grade Anda B");
        } else if (nilai > 50 && nilai <= 60) {
            System.out.println("Grade Anda C");
        } else if (nilai > 40 && nilai <= 50) {
            System.out.println("Grade Anda D");
        } else if (nilai <= 40) {
            System.out.println("Grade Anda E");
        } else {
            System.out.println("Inputan Anda Salah");
        }

        input.close();
    }

}
