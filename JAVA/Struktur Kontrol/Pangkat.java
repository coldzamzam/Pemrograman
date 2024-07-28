import java.util.Scanner;

public class Pangkat {
    public static void main (String[] args){
        System.out.println("MENGHITUNG BILANGAN BERPANGKAT");

        int hasil = 1;

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Input nilai X = ");
        int x = myNumber.nextInt();
        System.out.println("Input nilai Y = ");
        int y = myNumber.nextInt();
        myNumber.close();

        System.out.println("Menghitung " + x + " pangkat " + y + "...");

        if (y == 0){
            return;
        } else{
            while (y != 0){
                hasil *= x;
                y--;
                if (y == 0){
                    break;}
            }
        }    
            
        System.out.println("Hasil  = " + hasil);
    }
}
