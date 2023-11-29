package Esercizio2;

import java.util.Arrays;

public class Sim {
    //ATTRIBUTI
    long numeroTelefono;
    double creditoDisponibile;
    int [] ultimeChiamate;
    //COSTRUTTORI
    public Sim(long numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.ultimeChiamate = new int [5];
    }
    //METODI
    public void stampaSim(Sim sim){
        System.out.println("La tua Sim ha il numero " + sim.numeroTelefono + ", credito disponibile di € " + sim.creditoDisponibile + " e questa è la lista delle tue ultime 5 chiamate " + Arrays.toString(sim.ultimeChiamate));
    }
}
