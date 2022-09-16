package Dasar.Latihan;

import java.util.Scanner;

public class LuasSegitigaPanjangSisi {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double luas, s;
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        s = a + b + c / 2;
        luas = Math.sqrt((s - a) + (s - b) + (s - c));
        System.out.println(s);
        System.out.println(luas);

    }
}
