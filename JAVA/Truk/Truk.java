package Truk;

public class Truk{
    public int idTruk;
    public double muatan;
    public double muatanMaks;

    public Truk(int id, double load, double loadMax){
        idTruk = id;
        muatan = load;
        muatanMaks = loadMax;
    }
    public int getID(){
        return idTruk;
    }
    public double getMuatan(){
        return muatan;
    }
    public double getMuatanMaks(){
        return muatanMaks;
    }
    public double tambahMuatan(double berat){
        muatan += berat;
        return berat;
    }
}