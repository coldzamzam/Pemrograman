package latihan_jam;

public class WaktuTester {
    public static void main(String[] args){
        Waktu w = new Waktu();
        System.out.println("1. Menit Awal : "+w.getTotalMenit());
        w.setJam(10);
        System.out.println("2. Total Menit : "+w.getTotalMenit());
        w.setMenit(57);
        System.out.println("3. Total Menit : "+w.getTotalMenit());
        w.tampilWaktu();
        w.tambahJam(7);
        System.out.println("4. JAM : "+w.getJam()+" dan MENIT "+w.getMenit());
        w.tambahMenit(40);
        System.out.println("5. JAM : "+w.getJam()+" dan MENIT "+w.getMenit());
        w.tampilWaktu();
    }
}
