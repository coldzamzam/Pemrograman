package Perbankan;

public class PenyimpananUang extends Tabungan {
    double tingkatBunga;

    public PenyimpananUang(int s, double tb){
        saldo = s;
        tingkatBunga = tb;
    }
    public void simpanUang(){
        saldo += saldo*tingkatBunga;
    }
    public double cekUang(){
        return saldo;
    }
    
}
