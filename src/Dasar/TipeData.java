package Dasar;

// Apa itu tipe data, Apa saja jenis tipe data dan bagaimana cara menggunakanya ? 

//  Tipe data adalah sebuah pengklasifikasian data berdasarkan jenis data tersebut. 
// tipe data inilah yang kadang akan mempengaruhi hasil dari pemograman kita
public class TipeData {
    public static void main(String[] args) {

        // tipe data berdasarkan numberik;
        int a = 1; // Int adalah tipe data integer yang menyimpan data bilangan bulat
        float f = 1; // tipe data yang menyimpan bilangan desimal
        double b = 1.2; // tipe data yang menampung dan menyimpan data desimal

        // tipe data berdasarkan Kata/String;
        char c = 'C'; // tipe data yang hanya menampung perhuruf
        // tipe data char bisa juga mengkonversi nilai menjadi simbol karakter dengan
        // mengkonversinya dari ASCII
        String s = "Hello world"; // tipe data String yang menyimpan kata/kalimat panjang;

        // tipe data boolean
        boolean myBolean = true; // tipe data perbandingan, tipe data ini hanya menerima data benar/tidak,.
                                 // True/false;

        System.out.println("int : " + a);
        System.out.println("float : " + f);
        System.out.println("Double : " + b);
        System.out.println("Char : " + c);
        System.out.println("String : " + s);
        System.out.println("Boolean : " + myBolean);

    }

}
