package ManusiaMahasiswa;

public class DemoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa stu = new Mahasiswa();
        stu.umur = 18;
        // System.out.println(super.umur);
        System.out.println("Umur mahasiswa sekarang : " + stu.umur);
        System.out.println("Umur mahasiswa +1 : " + stu.getUmur());
        System.out.println("Umur mahasiswa +5 lagi : " + stu.getUmur(5));
    }
}


