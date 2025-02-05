package com.company;

public class Main {

    public static void main(String[] args) {
        Girokonto girokonto1 = new Girokonto("Teo", 3476, 88234456, 1500, 27, 1000, "Girokonto");

        System.out.println(girokonto1.kontostand);
        System.out.println(girokonto1.kontofuehrungsgebuehren + 3);
        girokonto1.kontoAuszug();
    }

    public void Menu()
    {
        System.out.println("Willkommen bei SuperBank!");
        System.out.println();
        System.out.println("Welche Aktion moechten Sie durchfuehren?");
        System.out.println("1 - Konto anlegen");
        System.out.println("2 - einzahlen");
        System.out.println("3 - abheben");
        System.out.println("4 - Kontoauszug");
        System.out.println("5 - Konto aufloesen");
        System.out.println("0 - Program beenden");
        System.out.println();
    }
}
