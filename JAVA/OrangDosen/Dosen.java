package OrangDosen;

public class Dosen extends Orang{
    private int nip;

    public Dosen(String nama) {
        super(nama);
    }
    public Dosen(String nama, int nipDosen){
        super(nama);
        nip = nipDosen;
    }
    public Dosen(String nama, int nipDosen, int umur){
        super(nama, umur);
        nip = nipDosen;
    }
    public void info(){
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Umur:" + umur);
    }
}
