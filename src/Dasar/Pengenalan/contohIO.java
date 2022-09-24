package Dasar.Pengenalan;

import java.util.Scanner;

public class contohIO {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukan data a :");
        int a = s.nextInt();
        System.out.println("Masukan data b : ");
        double b = s.nextDouble();

        System.out.printf("Nilai dari a : %d", a);
        System.out.println("Nilai dari b : " + b);
        double jumlah = a + b;
        System.out.print("jumlah dari a + b : " + jumlah);
    }
}
