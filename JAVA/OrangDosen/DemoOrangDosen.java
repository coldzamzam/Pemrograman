package OrangDosen;

public class DemoOrangDosen {
    public static void main(String[] args){
        System.out.println("Masukkan identitas dosen 1: Agus");
        Dosen dosen1 = new Dosen("Agus"); 

        System.out.println("Masukkan identitas dosen 1: Budi, NIP. 12345");
        Dosen dosen2 = new Dosen("Budi", 12345);

        System.out.println("Masukkan identitas dosen 1: Iwan. NIP. 13463, umur 42");
        Dosen dosen3 = new Dosen("Iwan", 13463, 42);

        System.out.println("");
        dosen1.info();
        System.out.println("");
        dosen2.info();
        System.out.println("");
        dosen3.info();
    }
}
