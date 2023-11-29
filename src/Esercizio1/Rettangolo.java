package Esercizio1;

public class Rettangolo{
    //ATTRIBUTI
    double altezza;
    double larghezza;

    //COSTRUTTORI
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    //METODI
    public double calcolaPerimetro(){
        return (altezza *2 + larghezza *2);
    }
    public double calcolaArea(){
        return altezza * larghezza;
    }
}
