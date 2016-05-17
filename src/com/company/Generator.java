package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by gavlak on 16/05/16.
 */
public class Generator {

    Map<String, Map<String, String>> mapa;
    ArrayList<String> ulice;

    ArrayList<String> mestaza_za, mestaza_mt;
    ArrayList<String> mestaba_ba, mestaba_pe;

    ArrayList<String> okresyza;
    ArrayList<String> okresyba;

    ArrayList<String> kraje;

    ArrayList<String> mena_muzi = new ArrayList<>();
    ArrayList<String> priezviska_muzi = new ArrayList<>();
    ArrayList<String> mena_zeny = new ArrayList<>();
    ArrayList<String> priezviska_zeny = new ArrayList<>();


    ArrayList<String> typ_vydaje_osoby = new ArrayList<>();
    ArrayList<String> typ_vydaje_domacnosti = new ArrayList<>();
    ArrayList<String> typ_prijmu_osoba =  new ArrayList<>();
    ArrayList<String> typ_prijmu_domacnost = new ArrayList<>();

    ArrayList<String> datumy = new ArrayList<>();

    ArrayList<String> actualOsoby = new ArrayList<>();
    ArrayList<Pav> actualPav = new ArrayList<>();

    ArrayList<String> dlhy = new ArrayList<>();;
    ArrayList<Integer> obdobie = new ArrayList<>();;

    Random r;

    int id_domacnosti = 0;
    int id_pav = 0;
    int id_dlhu = 0;
    int id_spav = 0;
    int id_typdlhu = 0;
    int id_pp  = 0;
    int id_adresy = 0;
    int id_uctu = 0;
    int id_prijem_osoba = 0;
    int id_prijem_domacnost = 0;
    int id_vydaj_domacnosti = 0;
    int id_vydaj_osoby = 0;

    public Generator()
    {
        r = new Random();
        ulice = new ArrayList<String>();

        kraje = new ArrayList<String>();

        okresyza = new ArrayList<String>();
        okresyba = new ArrayList<String>();

        mestaza_za = new ArrayList<String>();
        mestaza_mt = new ArrayList<String>();
        mestaba_ba = new ArrayList<String>();
        mestaba_pe = new ArrayList<String>();

    }

    void nacitajDatumy() {
        datumy.add("'15-02-2015'");
        datumy.add("'11-02-2015'");
        datumy.add("'27-02-2015'");
        datumy.add("'03-02-2015'");
        datumy.add("'01-03-2015'");
        datumy.add("'13-03-2015'");
        datumy.add("'27-03-2015'");
        datumy.add("'10-01-2015'");
        datumy.add("'29-01-2015'");
        datumy.add("'04-04-2015'");
        datumy.add("'14-04-2015'");
        datumy.add("'01-05-2015'");
        datumy.add("'18-05-2015'");
        datumy.add("'29-05-2015'");
        datumy.add("'07-06-2015'");
        datumy.add("'18-06-2015'");
        datumy.add("'30-06-2015'");
        datumy.add("'01-07-2015'");
        datumy.add("'08-07-2015'");
        datumy.add("'15-07-2015'");
        datumy.add("'08-08-2015'");
        datumy.add("'14-08-2015'");
        datumy.add("'03-09-2015'");
        datumy.add("'10-09-2015'");
        datumy.add("'29-09-2015'");
        datumy.add("'12-10-2015'");
        datumy.add("'31-10-2015'");
        datumy.add("'11-11-2015'");
        datumy.add("'24-11-2015'");
    }

    void nacitajUlice()
    {
        try {
            Scanner u = new Scanner(new File("ulice.txt"));

            while (u.hasNextLine()) {
                ulice.add(u.nextLine());
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        kraje.add("'Bratislavsky kraj'");
        kraje.add("'Zilinsky kraj'");

        okresyza.add("'Zilina'");
        okresyza.add("'Martin'");

        okresyba.add("'Bratislava'");
        okresyba.add("'Pezinok'");

        mestaza_za.add("'Zilina'");
        mestaza_za.add("'Rajec'");
        mestaza_za.add("'Bela'");
        mestaza_za.add("'Terchova'");
        mestaza_za.add("'Bytca'");

        mestaza_mt.add("'Martin'");
        mestaza_mt.add("'Vrutky'");
        mestaza_mt.add("'Sucany'");
        mestaza_mt.add("'Turany'");
        mestaza_mt.add("'Turcianske Teplice'");

        mestaba_ba.add("'Bratislava I'");
        mestaba_ba.add("'Bratislava II'");
        mestaba_ba.add("'Bratislava III'");
        mestaba_ba.add("'Bratislava IV'");
        mestaba_ba.add("'Bratislava V'");

        mestaba_pe.add("'Pezinok'");
        mestaba_pe.add("'Modra'");
        mestaba_pe.add("'Svaty Jur'");
        mestaba_pe.add("'Senkvice'");
        mestaba_pe.add("'Budmerice'");
    }

    String generujUcet() {
        id_uctu++;
        return "execute vloz_ucet(" + id_uctu + "," + id_domacnosti + ");";
    }

    String generujUlicu()
    {
        return (r.nextInt(100) > 70)
                ? (ulice.get(r.nextInt(ulice.size())) + ",'" + Integer.toString(r.nextInt(300))) + "'"
                : (ulice.get(r.nextInt(ulice.size())) + ",'" + Integer.toString(r.nextInt(300))) + "'";
    }

    String generujKraj()
    {
        return kraje.get(r.nextInt(kraje.size()));
    }

    boolean ff()
    {
        return (r.nextInt(100) > 50);
    }

    String generujDomacnost() {
        id_domacnosti++;
        return "execute vloz_domacnost(" + id_domacnosti + "," + id_adresy + ");    ";
    }

    String generujAdresu()
    {
        actualOsoby = new ArrayList<>();
        actualPav = new ArrayList<>();
        String kraj = generujKraj();
        String okres = "";
        String mesto = "";
        id_adresy++;

        if (kraj == "'Bratislavsky kraj'")
        {
            okres = okresyba.get(r.nextInt(2));

            if (okres == "'Bratislava'")
            {
                mesto = mestaba_ba.get(r.nextInt(5));
            }
            else
            {
                mesto = mestaba_pe.get(r.nextInt(5));
            }
        }
        else if (kraj == "'Zilinsky kraj'")
        {
            okres = okresyza.get(r.nextInt(2));

            if (okres == "'Zilina'")
            {
                mesto = mestaza_za.get(r.nextInt(5));
            }
            else
            {
                mesto = mestaza_mt.get(r.nextInt(5));
            }
        }
        return "execute vloz_adresu(" + id_adresy + "," + generujUlicu() + "," + mesto + "," + kraj + ");";
    }

    void nacitajMenaPriezviska() {

        try {
            Scanner m = new Scanner(new File("mp_muzi.txt"));
            Scanner z = new Scanner(new File("mp_zeny.txt"));
            while (m.hasNextLine()) {
                mena_muzi.add(m.nextLine());
                priezviska_muzi.add(m.nextLine());
            }
            while (z.hasNextLine()) {
                mena_zeny.add(z.nextLine());
                priezviska_zeny.add(z.nextLine());
            }

            System.out.println();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    String generujZenu(String rc) {
        String mrc = "NULL";
        String orc = "NULL";
        if (actualOsoby.isEmpty() || actualOsoby.size() == 1) {
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_zeny.get(r.nextInt((mena_zeny.size() - 1)) + 1) + "," + priezviska_zeny.get(r.nextInt(priezviska_zeny.size())) + "," + generujDatum(rc) + "," + "1);";
        } else if (actualOsoby.size() == 2 || actualOsoby.size() == 3) {
            mrc = actualOsoby.get(0);
            orc = actualOsoby.get(1);
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_zeny.get(r.nextInt((mena_zeny.size() - 1)) + 1) + "," + priezviska_zeny.get(r.nextInt(priezviska_zeny.size())) + "," + generujDatum(rc) + "," + "2);";
        } else if (actualOsoby.size() == 4) {
            mrc = actualOsoby.get(2);
            orc = actualOsoby.get(3);
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_zeny.get(r.nextInt((mena_zeny.size() - 1)) + 1) + "," + priezviska_zeny.get(r.nextInt(priezviska_zeny.size())) + "," + generujDatum(rc) + "," + "3);";
        }
        return "Ola";
    }

    String generujMuza(String rc) {
        String mrc = "NULL";
        String orc = "NULL";
        if (actualOsoby.isEmpty() || actualOsoby.size() == 1) {
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_muzi.get(r.nextInt((mena_muzi.size() - 1)) + 1) + ","+ priezviska_muzi.get(r.nextInt(priezviska_muzi.size())) + "," + generujDatum(rc) + "," + "1);";
        } else if (actualOsoby.size() == 2 || actualOsoby.size() == 3) {
            mrc = actualOsoby.get(0);
            orc = actualOsoby.get(1);
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_muzi.get(r.nextInt((mena_muzi.size() - 1)) + 1) + ","+ priezviska_muzi.get(r.nextInt(priezviska_muzi.size())) + "," + generujDatum(rc) + "," + "2);";
        } else if (actualOsoby.size() == 4) {
            mrc = actualOsoby.get(2);
            orc = actualOsoby.get(3);
            actualOsoby.add(rc);
            return "execute vloz_osobu(" + rc + "," + id_domacnosti + "," + mena_muzi.get(r.nextInt((mena_muzi.size() - 1)) + 1) + ","+ priezviska_muzi.get(r.nextInt(priezviska_muzi.size())) + "," + generujDatum(rc) + "," + "3);";
        }
        return "Ola";


    }


    void nacitajPav() {
        typ_vydaje_domacnosti.add("'Tyzdenny nakup potravin'");
        typ_vydaje_domacnosti.add("'Dovolenka'");
        typ_vydaje_domacnosti.add("'Nakup pracky'");
        typ_vydaje_domacnosti.add("'Oprava pracky'");
        typ_vydaje_domacnosti.add("'Zateplenie domu'");
        typ_vydaje_domacnosti.add("'Vymena okien'");
        typ_vydaje_domacnosti.add("'Vymena dveri'");
        typ_vydaje_domacnosti.add("'Vymena vodovodu v dome'");
        typ_vydaje_domacnosti.add("'Narodeninova party'");
        typ_vydaje_domacnosti.add("'Nakup pracky'");
        typ_vydaje_domacnosti.add("'Nakup televizora'");
        typ_vydaje_domacnosti.add("'Oprava chladnicky'");
        typ_vydaje_domacnosti.add("'Oprava televizora'");
        typ_vydaje_domacnosti.add("'Platba za kablovu televiziu'");
        typ_vydaje_domacnosti.add("'Prenajom za byt'");
        typ_vydaje_domacnosti.add("'Prenajom za dom'");
        typ_vydaje_domacnosti.add("'Prenajom za garaz'");
        typ_vydaje_osoby.add("'Nakup auta'");
        typ_vydaje_osoby.add("'Oprava auta'");
        typ_vydaje_osoby.add("'Nakup motorky'");
        typ_vydaje_osoby.add("'Cistenie auta'");
        typ_vydaje_osoby.add("'Cistenie psa'");
        typ_vydaje_osoby.add("'Nakup liekov'");
        typ_vydaje_osoby.add("'Dovolenka'");
        typ_vydaje_osoby.add("'Vylet na Trenciansky hrad'");
        typ_vydaje_osoby.add("'Manikura'");
        typ_vydaje_osoby.add("'Pedikura'");
        typ_vydaje_osoby.add("'Vytrhavanie chlpkov'");
        typ_vydaje_osoby.add("'Platba za telefon'");
        typ_vydaje_osoby.add("'Platba za kadernika'");
        typ_prijmu_osoba.add("'Mzda'");
        typ_prijmu_osoba.add("'Vencenie psa'");
        typ_prijmu_osoba.add("'Plat v praci'");
        typ_prijmu_osoba.add("'Dar od kolegov'");
        typ_prijmu_osoba.add("'Umyvanie auta'");
        typ_prijmu_osoba.add("'Predaj limonady'");
        typ_prijmu_osoba.add("'Strazenie deti'");
        typ_prijmu_osoba.add("'Najdenie penazi na chodniku'");
        typ_prijmu_osoba.add("'Vyhra v loterii'");
        typ_prijmu_osoba.add("'Vyhra v pokri'");
        typ_prijmu_osoba.add("'Vyhra v rulete'");
        typ_prijmu_osoba.add("'Brigada'");
        typ_prijmu_osoba.add("'Predaj sperkov'");
        typ_prijmu_domacnost.add("'Prijem za prenajom domu'");
        typ_prijmu_domacnost.add("'Prijem za prenajom bytu'");
        typ_prijmu_domacnost.add("'Prijem za prenajom auta'");
        typ_prijmu_domacnost.add("'Prijem za prenajom izby'");
        typ_prijmu_domacnost.add("'Garazovy vypredaj'");
        typ_prijmu_domacnost.add("'Predaj auta'");
        typ_prijmu_domacnost.add("'Predaj domu'");
        typ_prijmu_domacnost.add("'Predaj bytu'");
        typ_prijmu_domacnost.add("'Predaj garaze'");
    }

//    String generujPav() {
//        id_pav++;
//        String pom = id_pav + ";" + id_domacnosti + ";" + "1;1";
//        int pohybid = r.nextInt(pav.size());
//        boolean flag = true;
//        boolean find = false;
//        while (flag) {
//            find = false;
//            for (int i = 0; i < actualPav.size(); i++) {
//                if (actualPav.get(i).getKod_pav() == pohybid) {
//                    find = true;
//                    break;
//                }
//
//            }
//            if (find) {
//                pohybid = r.nextInt(pav.size());
//            } else {
//                if (pohybid < 3) {
//                    pom += ";P;" + pav.get(pohybid);
//                    flag = false;
//                } else {
//                    pom += ";V;" + pav.get(pohybid);
//                    flag = false;
//                }
//            }
//
//        }
//        actualPav.add(new Pav(id_domacnosti, id_pav, pohybid));
//        return pom;
//    }

//    String generujSpav() {
//        id_spav++;
//        boolean flag = true;
//        int pohyb = r.nextInt(pav.size());
//        String result = "";
//        boolean find = false;
//        int index = 0;
//        while(flag) {
//            find = false;
//            for (int i = 0; i < actualPav.size(); i++) {
//                if (actualPav.get(i).getKod_pav() == pohyb) {
//                    find = true;
//                    index = i;
//                    break;
//                }
//
//            }
//            if (find) {
//                int indexxx = r.nextInt(actualOsoby.size());
//                String rc = actualOsoby.get(indexxx);
//                result = id_spav + ";" + rc + ";" + actualPav.get(index).getId_pav() + ";" + r.nextInt(200) + ";";
//                if (r.nextInt(15) % 3 == 0) {
//                    result += "T";
//                } else {
//                    result += "F";
//                }
//                flag = false;
//            } else {
//                pohyb = r.nextInt(pav.size());
//            }
//        }
//        return result;
//
//
//    }

    String[] generujPrijemOsoba() {
        id_prijem_osoba++;
        id_prijem_domacnost++;
        String[] result =  new String[2];
        int suma = r.nextInt(1000);
        String typ = typ_prijmu_osoba.get(r.nextInt(typ_prijmu_osoba.size()));
        String datum = datumy.get(r.nextInt(datumy.size()));
        String sql1 = "execute vloz_prijem_domacnosti(" + id_prijem_domacnost + "," + id_uctu + "," + id_domacnosti + "," + suma + "," + typ + "," + datum + ",'');";
        String sql2 = "execute vloz_prijem_osoby(" + id_prijem_osoba + "," + actualOsoby.get(r.nextInt(actualOsoby.size())) + "," + id_prijem_domacnost + "," + datum + "," + suma + "," + typ + ",'');" ;
        result[0] = sql1;
        result[1] = sql2;
        return result;
    }

    String generujPrijemDomacnost() {
        id_prijem_domacnost++;
        int suma = r.nextInt(1000);
        String typ = typ_prijmu_domacnost.get(r.nextInt(typ_prijmu_domacnost.size()));
        String datum = datumy.get(r.nextInt(datumy.size()));
        return "execute vloz_prijem_domacnosti(" + id_prijem_domacnost + "," + id_uctu + "," + id_domacnosti + "," + suma + "," + typ + "," + datum + ",'');";
    }

    String generujVydajDomacnost() {
        id_vydaj_domacnosti++;
        int suma = r.nextInt(1000);
        String typ = typ_vydaje_domacnosti.get(r.nextInt(typ_vydaje_domacnosti.size()));
        String datum = datumy.get(r.nextInt(datumy.size()));
        return "execute vloz_vydaj_domacnosti(" + id_vydaj_domacnosti + "," + id_uctu + "," + id_domacnosti + "," + suma + "," + typ + "," + datum + ",'');";
    }

    String[] generujVydajOsoba() {
        id_vydaj_osoby++;
        id_vydaj_domacnosti++;
        String[] result =  new String[2];
        int suma = r.nextInt(1000);
        String typ = typ_vydaje_osoby.get(r.nextInt(typ_vydaje_osoby.size()));
        String datum = datumy.get(r.nextInt(datumy.size()));
        String sql1 = "execute vloz_vydaj_domacnosti(" + id_vydaj_domacnosti + "," + id_uctu + "," + id_domacnosti + "," + suma + "," + typ + "," + datum + ",'');";
        String sql2 = "execute vloz_vydaje_osoby("+ id_vydaj_osoby + "," + actualOsoby.get(r.nextInt(actualOsoby.size())) + "," + id_vydaj_domacnosti + "," + datum + "," + suma + "," + typ + ",''," + datum + ");";

        result[0] = sql1;
        result[1] = sql2;
        return result;
    }

    String generujDatum(String rc) {
        String year = "";
        String month = "";
        String day = "";
        if (rc.charAt(1) == '0') {
            year = "200" + rc.charAt(2);
        } else {
            year = "19" + rc.charAt(1) + rc.charAt(2);
        }

        if (rc.charAt(3) == '6') {
            month = "1" + rc.charAt(4);
        } else if (rc.charAt(3) == '5') {
            month = "0" + rc.charAt(4);
        } else {
            month = Character.toString(rc.charAt(3)) + Character.toString(rc.charAt(4));
        }

        day = Character.toString(rc.charAt(5)) + Character.toString(rc.charAt(6)) ;
        return "'" + day + "-" + month + "-" + year + "'";
    }

    public void nacitajObdobie(){
        obdobie.add(30);
        obdobie.add(60);
        obdobie.add(90);
        obdobie.add(120);
        obdobie.add(180);
        obdobie.add(300);
    }



    String generujDlh() {
        id_typdlhu++;
        return id_typdlhu + "," + id_domacnosti + "," + dlhy.get(r.nextInt(dlhy.size())) + ";" + r.nextInt(5000-100+1)+100 + ";" + datumy.get(r.nextInt(datumy.size())) + ";" + obdobie.get(r.nextInt(obdobie.size()));
    }

    String generujTypPP() {
        id_pp++;
        return id_pp + ";1;" + datumy.get(r.nextInt(datumy.size())) + ";" + obdobie.get(r.nextInt(obdobie.size()));
    }
}