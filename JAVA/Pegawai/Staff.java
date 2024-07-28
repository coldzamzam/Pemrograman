package Pegawai;

public class Staff extends Pegawai {
    private String departemen;

    public Staff(String nama, String nip, String departemen){
        super(nama, nip);
        setDept(departemen);
    }
    public void setDept(String namaDept){
        departemen = namaDept;
    }
    public String getDept(){
        return departemen;
    }
    public void kirimEmail(String to, String subjek, String isi){
        System.out.println(getNama() + " Kirim email ke: " + to);
        System.out.println("Dengan subjek : " + subjek);
        System.out.println("Dengan isi : " + isi);
    }
}
