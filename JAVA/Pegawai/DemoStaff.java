package Pegawai;

public class DemoStaff {
    public static void main(String[] args) {
        Staff kyw = new Staff("Bentol", "1234567", "Keuangan");
        kyw.kirimEmail("a@test.com", "Demo Abstrak Class", "Ini adalah isi email ini.");
        System.out.println("NIP : " + kyw.getNIP());
        System.out.println("Nama : " + kyw.getNama());
        System.out.println("Departemen : " + kyw.getDept());
    }
}
