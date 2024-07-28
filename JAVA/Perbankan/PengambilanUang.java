package Perbankan;

public class PengambilanUang extends Tabungan{
    int saldoProtected;
    int totalSaldo;

    public PengambilanUang(int sal, int salpro){
        saldo = sal - salpro;
        saldoProtected = salpro;
        totalSaldo = saldo + saldoProtected;
    }
    public boolean ambilUang(int saldoDiambil){
        if (saldo > saldoDiambil){
            saldo = saldo - saldoDiambil;
            return true;
        }
        else{
            return false;
        }
    }
    public int getSaldo(){
        totalSaldo = saldo + saldoProtected;
        return totalSaldo;
    }
}
