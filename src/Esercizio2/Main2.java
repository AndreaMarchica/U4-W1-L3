package Esercizio2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Sim sim1 = new Sim(346576879);
        stampaSim(sim1);

        }

    public static void stampaSim (Sim sim){
        System.out.println("La tua Sim ha il numero " + sim.numeroTelefono + ", credito disponibile di € " + sim.creditoDisponibile + " e questa è la lista delle tue ultime 5 chiamate " + Arrays.toString(sim.ultimeChiamate));
}}