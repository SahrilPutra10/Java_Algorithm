package Dasar.ControlStructure.Perulangan;

public class WhileStatment {
    // make star pattern
    public static void main(String[] args) {
        int i = 0; // mendeklarasikan variable int a = 0 ;

        while (i < 100) { // melakukan variablel i
            // melakukan perulangan jika variabel i lebih kecil sama dengan seratus
            // jika variabel 100< i maka tambah i sebanyak 1X
            i++; // setiap perulangan do dilakaukan maka jalankan i dan di tambah sebanyak 1
            // cth. 1 =0 ; tetapi dengan syntax i++ maka setiap do dijalankan maka i akan di
            // tambah deegnan satu sampai expresi dari while terpenuhi
            System.out.println(i);
        }
    }
}
