package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

import org.lessons.java.shop.Cuffie.Tipologia;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci prodotti nel carrello. Stai inserendo un televisore, uno smarphone o delle cuffie?");
        String prodotto = input.nextLine();

        if(prodotto != null && !prodotto.equals("")) {
            if(prodotto.toLowerCase().equals("televisore")) {
                System.out.println("Inserisci il nome");
                String nome = input.nextLine();
                System.out.println("Inserisci la marca");
                String marca = input.nextLine();
                System.out.println("Inserisci il prezzo");
                BigDecimal prezzo = input.nextBigDecimal();
                System.out.println("Inserisci l'iva");
                BigDecimal iva = input.nextBigDecimal();
                System.out.println("Inserisci le dimensioni");
                int dimensioni = input.nextInt();
                System.out.println("E' smart?");
                Boolean smart = input.nextBoolean();
                Televisori newTelevisore = new Televisori(nome, marca, prezzo, iva, dimensioni, smart);
                System.out.println(newTelevisore.toString());
            } else if(prodotto.toLowerCase().equals("smarphone")) {
                System.out.println("Inserisci il nome");
                String nome = input.nextLine();
                System.out.println("Inserisci la marca");
                String marca = input.nextLine();
                System.out.println("Inserisci il prezzo");
                BigDecimal prezzo = input.nextBigDecimal();
                System.out.println("Inserisci l'iva");
                BigDecimal iva = input.nextBigDecimal();
                System.out.println("Inserisci il codice IMEI");
                int codiceIMEI = input.nextInt();
                System.out.println("E' smart?");
                int memoria = input.nextInt();
                Smarphone newSmarphone = new Smarphone(nome, marca, prezzo, iva, codiceIMEI, memoria);
                System.out.println(newSmarphone.toString());
            } else if(prodotto.toLowerCase().equals("cuffie")) {
                System.out.println("Inserisci il nome");
                String nome = input.nextLine();
                System.out.println("Inserisci la marca");
                String marca = input.nextLine();
                System.out.println("Inserisci il prezzo");
                BigDecimal prezzo = input.nextBigDecimal();
                System.out.println("Inserisci l'iva");
                BigDecimal iva = input.nextBigDecimal();
                System.out.println("Inserisci il colore");
                String colore = input.nextLine();
                Tipologia tipologia = Tipologia.WIRELESS;
                Cuffie newCuffie = new Cuffie(nome, marca, prezzo, iva, colore, tipologia);
                System.out.println(newCuffie.toString());
            } else {
                System.out.println("Nessuna categoria selezionata");
            }
        } else {
            System.out.println("Sei fuori strada, scrivi del testo");
        }

        input.close();

    }
}
