package Tabungan;

public class UjiAkunTabungan {
    public static void main(String[] args) {
        AkunTabungan AkunTabungan1 = new AkunTabungan(1000, "Damian");
        System.out.println("Saldo awal : " + AkunTabungan1.saldo);
        System.out.println("Simpan uang : " + AkunTabungan1.simpanUang(2000));
        System.out.println("Saldo sementara : " + AkunTabungan1.getSaldo());
        System.out.println("Tarik uang : " + AkunTabungan1.ambilUang(500));
        System.out.println("Pemilik : " + AkunTabungan1.displayPemilik());
        AkunTabungan1.hitungSaldoAkhir();
        System.out.println("Bunga : " + AkunTabungan1.rateBunga);
        System.out.println("Saldo sekarang : " + AkunTabungan1.getSaldo());
    }
}
