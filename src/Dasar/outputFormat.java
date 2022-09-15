package Dasar;

import java.util.Scanner;

public class outputFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            /*
             * PENJELASAN
             * format printf %-15s adalah format yang digunakan untuk string
             * menggunakan "-" adalah representasi dari rata kiri untuk string / left
             * Alignment
             * dan 15 adalah jumlah ruang yang kita gunakan untuk string;
             * 
             * %03d adalah format untuk bilangan integer yang ditandai di akhir d
             * menggunakan "03d" adalah format untuk menampilkan 3 angka saja
             * 
             * dan %n adalah format untuk melakukan enter pada baris output
             */
        }
        System.out.println("================================");
        sc.close();
    }
}
/*
 * Output
 * Java 100
 * Pytohn 35
 * Cpp 12
 */
