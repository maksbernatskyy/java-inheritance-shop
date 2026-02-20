package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci prodotti nel carrello. Stai inserendo un televisore, uno smarphone o delle cuffie?");
        String prodotto = input.nextLine();

        if(prodotto != null && !prodotto.equals("")) {
            if(prodotto.toLowerCase().equals("televisore")) {

            } else if(prodotto.toLowerCase().equals("smarphone")) {

            } else if(prodotto.toLowerCase().equals("cuffie")) {

            } else {
                System.out.println("Nessuna categoria selezionata");
            }
        } else {
            System.out.println("Sei fuori strada, scrivi del testo");
        }

        input.close();

    }
}
