package AlatMusik;

public class AlatMusikPetik implements AlatMusik {
    public String nama;

    public void mainkan(){
        System.out.println(nama + " dimainkan.");
    }
    public void mainkanNada(){
        System.out.println("Jreng(DO) Jreng(RE) Jreng(MI) Jreng(FA) Jreng(SOL) Jreng(LA) Jreng(SI) Jreng(DO) ");
    }
    public String ambilNama(){
        return nama;
    }
}
