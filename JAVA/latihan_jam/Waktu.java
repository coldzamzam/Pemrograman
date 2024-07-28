package latihan_jam;

public class Waktu {
    private int menitWaktu;
    void waktu (int j, int m){
        menitWaktu = j*60 + m;
    }

    public int getJam(){
        int jam = menitWaktu/60;
        return jam;
    }
    public int getMenit(){
        int menit = menitWaktu%60;
        return menit;
    }
    public void setJam(int j){
        menitWaktu = menitWaktu + j*60;
    }
    public void setMenit(int m){
        menitWaktu = menitWaktu + m;
    }
    public int getTotalMenit(){
        return menitWaktu;
    }
    public void tambahJam(int j){
        menitWaktu = menitWaktu + j*60;
    }
    public void tambahMenit(int m){
        menitWaktu = menitWaktu + m;
    }
    public void tambahWaktu(int j, int m){
        menitWaktu = menitWaktu + j*60 + m;
    }
    public void tampilWaktu(){
        System.out.println("Waktu : "+getJam()+":"+getMenit());
    }
}
