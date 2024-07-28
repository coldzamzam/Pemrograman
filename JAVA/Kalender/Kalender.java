package Kalender;

public class Kalender {
    private int tanggal = 1;
    private int bulan = 1;
    private int tahun = 2000;

    public Kalender(int date){
        tanggal = date;
    }
    public Kalender(int month, int year){
        bulan = month;
        tahun = year;
    }
    public Kalender(int date, int month, int year){
        tanggal = date;
        bulan = month;
        tahun = year;
    }
    public int getTanggal(){
        return tanggal;
    }
    public int getBulan(){
        return bulan;
    }
    public int getTahun(){
        return tahun;
    }
    public void setTanggal(int date){
        tanggal = date;
    }
    public void setBulan(int month){
        bulan = month;
    }
    public void setTahun(int year){
       tahun = year;
    }
}
