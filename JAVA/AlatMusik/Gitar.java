package AlatMusik;

public class Gitar extends AlatMusikPetik {
    public String nama;

    public Gitar(String nama){
        this.nama = nama;
    }
    public void mainkan(){
        System.out.println("");
    }
    public void mainkanNada(){
        System.out.println();
    }
    public String ambilNama(){
        return nama;
    }
}
