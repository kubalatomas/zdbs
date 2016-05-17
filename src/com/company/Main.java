package com.company;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {


        Generator g = new Generator();
        Random r = new Random();
        PrintWriter adresa = new PrintWriter("inserty\\Adresa.sql", "UTF-8");
        PrintWriter domacnost = new PrintWriter("inserty\\Domacnost.sql", "UTF-8");
        PrintWriter osoba = new PrintWriter("inserty\\Osoba.sql", "UTF-8");
        PrintWriter prijem_domacnosti = new PrintWriter("inserty\\Prijem_domacnosti.sql", "UTF-8");
        PrintWriter prijem_osoby = new PrintWriter("inserty\\Prijem_osoby.sql", "UTF-8");
        PrintWriter ucet = new PrintWriter("inserty\\Ucet.sql", "UTF-8");
        PrintWriter vydaje_domacnosti = new PrintWriter("inserty\\Vydaje_domacnosti.sql", "UTF-8");
        PrintWriter vydaje_osoby = new PrintWriter("inserty\\Vydaje_osoby.sql", "UTF-8");

        g.nacitajMenaPriezviska();
        g.nacitajPav();
        g.nacitajDatumy();
        g.nacitajObdobie();
        g.nacitajUlice();

        System.out.println("DOMACNOST 1-2");

        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());


        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'965103/8089'"));
        osoba.println(g.generujMuza("'910806/3107'"));


        System.out.println("Generovanie dat - vydaje osoby");

        int interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }

        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 2-5");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());
        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'435208/911'"));
        osoba.println(g.generujMuza("'610407/1028'"));
        osoba.println(g.generujZenu("'905313/3441'"));
        osoba.println(g.generujMuza("'960227/9599'"));
        osoba.println(g.generujMuza("'001210/7887'"));

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 3-2");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());
        System.out.println("Generovanie osob");
        osoba.println(g.generujMuza("'780628/6895'"));
        osoba.println(g.generujZenu("'685114/3156'"));

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }
        System.out.println("DOMACNOST 4-1");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());
        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'805712/8519'"));

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 5-5");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());
        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'495503/618'"));
        osoba.println(g.generujMuza("'510218/721'"));
        osoba.println(g.generujZenu("'645617/0831'"));
        osoba.println(g.generujMuza("'780711/5790'"));
        osoba.println(g.generujMuza("'900515/3883'"));



        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 6-1");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujMuza("'951013/4986'"));

        System.out.println();

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 7-2");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujMuza("'830608/6536'"));
        osoba.println(g.generujZenu("'945521/6969'"));


        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 8-3");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'896219/8949'"));
        osoba.println(g.generujMuza("'950920/5420'"));
        osoba.println(g.generujZenu("'055312/7058'"));


        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }



        System.out.println("DOMACNOST 9-2");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'655903/0378'"));
        osoba.println(g.generujMuza("'781119/5953'"));



        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 10-4");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'476128/4851'"));
        osoba.println(g.generujMuza("'490703/832'"));
        osoba.println(g.generujZenu("'655903/0368'"));
        osoba.println(g.generujZenu("'930820/3652'"));

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }
        System.out.println("DOMACNOST 11-4");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'605903/3618'"));
        osoba.println(g.generujMuza("'500114/228'"));
        osoba.println(g.generujMuza("'790615/5884'"));
        osoba.println(g.generujMuza("'780711/5789'"));


        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 12-5");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'435208/9111'"));
        osoba.println(g.generujMuza("'500114/2281'"));
        osoba.println(g.generujZenu("'775711/1560'"));
        osoba.println(g.generujMuza("'710113/8099'"));
        osoba.println(g.generujZenu("'055312/7158'"));

        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }


        System.out.println("DOMACNOST 13-2");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'636220/4068'"));
        osoba.println(g.generujMuza("'830716/2028'"));


        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 14-3");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'485123/736'"));
        osoba.println(g.generujMuza("'520503/567'"));
        osoba.println(g.generujMuza("'060310/3677'"));



        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }

        System.out.println("DOMACNOST 15-1");
        System.out.println("Generovanie domacnosti");
        adresa.println(g.generujAdresu());
        domacnost.println(g.generujDomacnost());
        ucet.println(g.generujUcet());

        System.out.println("Generovanie osob");
        osoba.println(g.generujZenu("'485206/640'"));


        System.out.println("Generovanie dat - vydaje osoby");

        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujVydajOsoba();
            vydaje_domacnosti.println(result[0]);
            vydaje_osoby.println(result[1]);

        }
        System.out.println("Generovanie dat - vydaj domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            vydaje_domacnosti.println(g.generujVydajDomacnost());
        }

        System.out.println("Generovanie dat - prijem osoby");
        interval = r.nextInt((15 - 5) + 1) + 5;
        for (int i = 0; i < interval; i++) {
            String[] result = g.generujPrijemOsoba();
            prijem_domacnosti.println(result[0]);
            prijem_osoby.println(result[1]);
        }
        System.out.println("Generovanie dat - prijem domacnosti");
        interval = r.nextInt((6 - 3) + 1) + 3;
        for (int i = 0; i < interval; i++) {
            prijem_domacnosti.println(g.generujPrijemDomacnost());
        }
        osoba.close();
        ucet.close();
        domacnost.close();
        prijem_domacnosti.close();
        prijem_osoby.close();
        vydaje_domacnosti.close();
        vydaje_osoby.close();
        adresa.close();

    }
}
