package Perbankan;

public class DemoTabungan {
    public static void main(String[] args){
        PenyimpananUang tabungan1 = new PenyimpananUang(5000, 8.5/100);

        System.out.println("Uang yang ditabung = " + tabungan1.saldo);
        System.out.println("Tingkat bunga : " + tabungan1.tingkatBunga + "%");
        tabungan1.simpanUang();
        System.out.println("Total uang sekarang = " + tabungan1.cekUang());
    }
}
