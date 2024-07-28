package Truk;
import java.util.Scanner;

public class testTruk {
    public static void main(String[] args) {
        Truk truk1 = new Truk(001, 1000, 2000);
        System.out.println("ID Truk : " + truk1.idTruk);
        System.out.println("Muatan Truk : " + truk1.muatan);
        System.out.println("Muatan maksimal : " + truk1.muatanMaks);

        Scanner number = new Scanner (System.in);
        System.out.println("Berapa muatan yang ingin ditambah? ");
        double angka = number.nextInt();
        number.close();

        System.out.println("Muatan tambahan : " + truk1.tambahMuatan(angka));
        System.out.println("Muatan Sekarang : " + truk1.getMuatan());

        if (angka > truk1.muatanMaks){
            System.out.println("Muatan maksimal adalah " + truk1.muatanMaks + " kg, truk tidak akan bisa berjalan.");
        }
    }
}
