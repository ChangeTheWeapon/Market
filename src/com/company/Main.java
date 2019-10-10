package com.company;
public class Main {

    public static void main(String[] args) {

        Market Panda = new Market("Panda", "str.Frumusica", 10, 3);
        System.out.print("\n\n");
        System.out.print("class Market -->Panda");
        System.out.print("\n");
        System.out.println(Panda.getNumeMarket());
        System.out.println(Panda.getLocatia());
        System.out.println(Panda.getNrColectivului());
        System.out.println(Panda.getNrSectii());
        System.out.print("\n\n\n");

        SectiaLactate Alba = new SectiaLactate("Panda", "str.Frumusica", 10, 3,10,25,30,7 );
        System.out.print("\n\n");
        System.out.print("class Market -->Panda-->Alba");
        System.out.print("\n");
        System.out.println(Alba.getNumeMarket());
        System.out.println(Alba.getLocatia());
        System.out.println(Alba.getNrColectivului());
        System.out.println(Alba.getNrSectii());
        System.out.println(Alba.getlLapte());
        System.out.println(Alba.getKgUnt());
        System.out.println(Alba.getKgBrinza());
        System.out.println(Alba.getKgCascaval());
        System.out.print("\n\n\n");
    }
