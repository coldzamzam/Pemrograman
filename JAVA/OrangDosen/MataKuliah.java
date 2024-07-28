package OrangDosen;

public class MataKuliah extends Orang{
    String matkul;
    public MataKuliah(String name, String matkul) {
        super(name);
        this.matkul = matkul;
    }
    
    public String getMatkul() {
        return matkul;
    }
}


