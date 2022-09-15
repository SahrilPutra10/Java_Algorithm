package Dasar;

import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // agar next int tidak berjalan terus;
        String s = scan.nextLine();

        System.out.println("INT : " + i);
        System.out.println("Double : " + d);
        System.out.println("String : " + s);

        scan.close();
    }
}
