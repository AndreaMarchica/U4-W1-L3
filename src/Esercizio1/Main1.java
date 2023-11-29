package Esercizio1;

public class Main1 {

    public static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(23,12.5);
        Rettangolo rett2 = new Rettangolo(11,9.5);
        stampaRettangolo(rett1);
        stampaRettangolo(rett2);
        stampaDueRettangoli(rett1, rett2);
    }
    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("P e A del rettangolo");
        System.out.println("P:" + rettangolo.calcolaPerimetro());
        System.out.println("A:" + rettangolo.calcolaArea());
    }
    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){
        System.out.println("Somma dei P:" + (rett1.calcolaPerimetro() + rett2.calcolaPerimetro()));
        System.out.println("Somma delle A:" + (rett1.calcolaArea() + rett2.calcolaArea()));
    }
}