import java.util.Scanner;

public class TahunKabisat {
    public static void main (String[] args){
        System.out.println("PENGECEKAN TAHUN KABISAT");

        Scanner year = new Scanner(System.in);
        System.err.println("Masukkan tahun (1900-2020) : ");
        int tahun = year.nextInt();
        year.close();

        if ((tahun >= 1900) && (tahun <= 2020)){
            if ((tahun % 4 == 0) && ((tahun % 100 != 0) || (tahun % 400 == 0))) {
            System.out.println(tahun + " merupakan tahun kabisat.");
            } else{
                System.out.println(tahun + " bukan merupakan tahun kabisat.");
            }
        } else if (tahun < 1900){
            System.out.println("Maaf, silakan input tahun di atas 1899.");
        } else{
            System.out.println("Maaf, silakan input tahun di bawah 2021");
        }
    }
}
