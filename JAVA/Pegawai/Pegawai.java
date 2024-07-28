package Pegawai;

public abstract class Pegawai{
    private String NIP;
    private String Nama;

    public Pegawai(String nama, String nip){
        Nama = nama;
        NIP = nip;
    }
    public String getNama(){
        return Nama;
    }
    public String getNIP(){
        return NIP;
    }
    public abstract void kirimEmail(String to, String subjek, String isi);
}