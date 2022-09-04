package Dasar;

public class expression {
    public static void main(String[] args) {
        // menggunakan expresi dan statment
        // 1
        int a, b; // mendeklarasikan statment
        a = 3;
        b = 4;
        a = a + b; // membuat expresi
        /**
         * Ekspresi
         * a + b adalah sebuah expresi karena menghasilkan nilai dan disimpan dalam
         * variable a;
         */

        // contoh 2
        int i = 12 * 2;
        System.out.println(i);
        /*
         * mendeklarasikan statment dan juga ekspresi
         * i = 12 * 2 ; merupakan eksprsi karena menghasilkan nilai dan menyimpannya
         * kedalam variable i;
         * dan int i merupakan sebuah statment yang mendeklarasikan variable ;
         */

        // kumpulan Ekspresi operator matematika
        a = 0;
        int kali = a * b; // perkalian
        int tambah = a + b; // tamhbah
        int kurang = a - b; // kurang
        int bagi = a / b; // bagi
        int modulus = a % b; // modulus;

        System.out.println(kali);
        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(bagi);
        System.out.println(modulus);

    }
}
