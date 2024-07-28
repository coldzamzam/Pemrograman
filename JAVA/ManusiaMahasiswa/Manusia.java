package ManusiaMahasiswa;

public class Manusia {
    private String nama;
    protected int umur;

    public int getUmur(){
        return umur;
    }
    public String getnama(){
        return nama;
    }
    public int getUmur(int tambah){
        umur += tambah;
        return umur;
    }
}


