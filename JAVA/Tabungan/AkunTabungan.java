package Tabungan;

public class AkunTabungan {
    public String nama;
    public double saldo;
    public double rateBunga;

    public AkunTabungan(double initsaldo, String nasabah){
        saldo = initsaldo;
        nama = nasabah;
    }
    public double getSaldo(){
        return saldo;
    }
    public double simpanUang(int jumlah){
        saldo += jumlah;
        return jumlah;
    }
    public double ambilUang(int jumlah){
        saldo -= jumlah;
        return jumlah;
    }
    public String displayPemilik(){
        return nama;
    }
    public double hitungSaldoAkhir(){
        rateBunga = 0.02;
        saldo += (rateBunga*saldo/12);
        return saldo;
    }
}
