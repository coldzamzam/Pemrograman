package Perbankan;

public class DemoTugas {
    public static void main (String[] args){
        PengambilanUang tabungan2 = new PengambilanUang(5000, 1000);

        System.out.println("Uang yang ditabung : " + (tabungan2.totalSaldo));
        System.out.println("Uang yang diproteksi : " + tabungan2.saldoProtected);
        System.out.println("-----------------");
        System.out.println("Uang yang akan diambil : 4500 " + tabungan2.ambilUang(4500));
        System.out.println("Saldo sekarang : " + tabungan2.getSaldo());
        System.out.println("-----------------");
        System.out.println("Uang yang akan diambil : 2500 " + tabungan2.ambilUang(2500));
        System.out.println("Saldo sekarang : " + tabungan2.getSaldo());
    }
}