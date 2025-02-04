package com.company;

public class Konto {
    String kontoinhaber;
    int bankleitzahl;
    int kontonummer;
    float ueberziehungsrahmen;
    float kontofuehrungsgebuehren;
    float kontostand;
    String kontoart;

    public Konto(String kontoinhaber, int bankleitzahl, int kontonummer, float ueberziehungsrahmen, float kontofuehrungsgebuehren, float kontostand, String kontoart)
    {
        this.kontoinhaber = kontoinhaber;
        this.bankleitzahl = bankleitzahl;
        this.kontonummer = kontonummer;
        this.ueberziehungsrahmen = ueberziehungsrahmen;
        this.kontofuehrungsgebuehren = kontofuehrungsgebuehren;
        this.kontostand = kontostand;
        this.kontoart = kontoart;
    }

    public void einzahlen(float summe)
    {
        kontostand += summe;
    }

    public void abheben(float summe)
    {
        kontostand -= summe;
    }

    public void kontoAuszug()
    {
        System.out.println("Kontoinhaber: " + kontoinhaber);
        System.out.println("BLZ: " + bankleitzahl);
        System.out.println("Kontonummer: " + kontonummer);
    }
}
