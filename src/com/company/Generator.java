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


    ArrayList<String> pav = new ArrayList<>();

    ArrayList<String> datumy = new ArrayList<>();

    ArrayList<Integer> actualOsoby = new ArrayList<>();
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
        datumy.add("15.2.2015");
        datumy.add("11.2.2015");
        datumy.add("27.2.2015");
        datumy.add("3.2.2015");
        datumy.add("1.3.2015");
        datumy.add("13.3.2015");
        datumy.add("27.3.2015");
        datumy.add("10.1.2015");
        datumy.add("29.1.2015");
        datumy.add("4.4.2015");
        datumy.add("14.4.2015");
        datumy.add("1.5.2015");
        datumy.add("18.5.2015");
        datumy.add("29.5.2015");
        datumy.add("7.6.2015");
        datumy.add("18.6.2015");
        datumy.add("30.6.2015");
        datumy.add("1.7.2015");
        datumy.add("8.7.2015");
        datumy.add("15.7.2015");
        datumy.add("8.8.2015");
        datumy.add("14.8.2015");
        datumy.add("3.9.2015");
        datumy.add("10.9.2015");
        datumy.add("29.9.2015");
        datumy.add("12.10.2015");
        datumy.add("31.10.2015");
        datumy.add("11.11.2015");
        datumy.add("24.11.2015");
        datumy.add("15.12.2015");
    }

    void nacitajUlice()
    {
        try {
            Scanner u = new Scanner(new File("ulice.txt"));

            while (u.hasNextLine()) { ulice.add(u.nextLine()); }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        kraje.add("Bratislavsky kraj");
        kraje.add("Zilinsky kraj");

        okresyza.add("Zilina");
        okresyza.add("Martin");

        okresyba.add("Bratislava");
        okresyba.add("Pezinok");

        mestaza_za.add("Zilina");
        mestaza_za.add("Rajec");
        mestaza_za.add("Bela");
        mestaza_za.add("Terchova");
        mestaza_za.add("Bytca");

        mestaza_mt.add("Martin");
        mestaza_mt.add("Vrutky");
        mestaza_mt.add("Sucany");
        mestaza_mt.add("Turany");
        mestaza_mt.add("Turcianske Teplice");

        mestaba_ba.add("Bratislava I");
        mestaba_ba.add("Bratislava II");
        mestaba_ba.add("Bratislava III");
        mestaba_ba.add("Bratislava IV");
        mestaba_ba.add("Bratislava V");

        mestaba_pe.add("Pezinok");
        mestaba_pe.add("Modra");
        mestaba_pe.add("Svaty Jur");
        mestaba_pe.add("Senkvice");
        mestaba_pe.add("Budmerice");
    }

    String generujUlicu()
    {
        return (r.nextInt(100) > 70)
                ? (ulice.get(r.nextInt(ulice.size())) + " " + r.nextInt(300) + "/" + r.nextInt(80))
                : (ulice.get(r.nextInt(ulice.size())) + " " + r.nextInt(300));
    }

    String generujKraj()
    {
        return kraje.get(r.nextInt(kraje.size()));
    }

    boolean ff()
    {
        return (r.nextInt(100) > 50);
    }

    String generujDomacnost()
    {
        actualOsoby = new ArrayList<>();
        actualPav = new ArrayList<>();
        String kraj = generujKraj();
        String okres = "";
        String mesto = "";
        id_domacnosti++;

        if (kraj == "Bratislavsky kraj")
        {
            okres = okresyba.get(r.nextInt(2));

            if (okres == "Bratislava")
            {
                mesto = mestaba_ba.get(r.nextInt(5));
            }
            else
            {
                mesto = mestaba_pe.get(r.nextInt(5));
            }
        }
        else if (kraj == "Zilinsky kraj")
        {
            okres = okresyza.get(r.nextInt(2));

            if (okres == "Zilina")
            {
                mesto = mestaza_za.get(r.nextInt(5));
            }
            else
            {
                mesto = mestaza_mt.get(r.nextInt(5));
            }
        }
        return id_domacnosti + ";" + generujUlicu() + ";" + mesto + ";" + okres + ";" + kraj;
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

    String generujZenu() {
        return "RODCISLO;" + id_domacnosti + ";MATKA_RODCISLO;OTEC_RODCISLO;" + mena_zeny.get(r.nextInt(mena_zeny.size())) + ";" + priezviska_zeny.get(r.nextInt(priezviska_zeny.size()));
    }

    String generujMuza() {
        return  "RODCISLO;" + id_domacnosti + ";MATKA_RODCISLO;OTEC_RODCISLO;" + mena_muzi.get(r.nextInt(mena_muzi.size())) + ";"+ priezviska_muzi.get(r.nextInt(priezviska_muzi.size()));
    }


    void nacitajPav() {
        pav.add("Prijem z predaju");
        pav.add("Prijem mzdy");
        pav.add("Prijem z podnikania");
        pav.add("Nakup surovin do domacnosti");
        pav.add("Faktura za telefon");
        pav.add("Kupa hygienickych potrieb");
        pav.add("Nakup PHM");
        pav.add("Faktura za opravu auta");
        pav.add("Kupa kancelarskej stolicky");
        pav.add("Faktura za suciastky do auta");
        pav.add("Platba za plyn");
        pav.add("Platba za elektriku");
        pav.add("Byvanie");
        pav.add("Nakup oblecenia");
        pav.add("Faktura za vedenie bankoveho uctu");
        pav.add("Nakup televizora");
        pav.add("Nakup pracky");
        pav.add("Nakup oblecenia");
        pav.add("Kupa pohovky");
        pav.add("Kupa kobercu");
    }

    String generujPav() {
        id_pav++;
        String pom = id_pav + ";" + id_domacnosti + ";" + "1;1";
        int pohybid = r.nextInt(pav.size());
        boolean flag = true;
        boolean find = false;
        while (flag) {
            find = false;
            for (int i = 0; i < actualPav.size(); i++) {
                if (actualPav.get(i).getKod_pav() == pohybid) {
                    find = true;
                    break;
                }

            }
            if (find) {
                pohybid = r.nextInt(pav.size());
            } else {
                if (pohybid < 3) {
                    pom += ";P;" + pav.get(pohybid);
                    flag = false;
                } else {
                    pom += ";V;" + pav.get(pohybid);
                    flag = false;
                }
            }

        }
        actualPav.add(new Pav(id_domacnosti, id_pav, pohybid));
        return pom;
    }

    String generujSpav() {
        id_spav++;
        boolean flag = true;
        int pohyb = r.nextInt(pav.size());
        String result = "";
        boolean find = false;
        int index = 0;
        while(flag) {
            find = false;
            for (int i = 0; i < actualPav.size(); i++) {
                if (actualPav.get(i).getKod_pav() == pohyb) {
                    find = true;
                    index = i;
                    break;
                }

            }
            if (find) {

                result = id_spav + ";" + "RODCISLO;" + actualPav.get(index).getId_pav() + ";" + r.nextInt(200) + ";";
                if (r.nextInt(15) % 3 == 0) {
                    result += "T";
                } else {
                    result += "F";
                }
                flag = false;
            } else {
                pohyb = r.nextInt(pav.size());
            }
        }
        return result;


    }

    public void nacitajObdobie(){
        obdobie.add(30);
        obdobie.add(60);
        obdobie.add(90);
        obdobie.add(120);
        obdobie.add(180);
        obdobie.add(300);
    }

    public void nacitajNazov(){
        dlhy.add("Úver na auto");
        dlhy.add("Pôžička na nákup chladničky");
        dlhy.add("Úver na bývanie");
        dlhy.add("Pôžička na nákup televízora");
        dlhy.add("Pôžička na nákup šporáka");
        dlhy.add("Úver na zateplenie domu");
        dlhy.add("Pôžička na dovolenku");
        dlhy.add("Pôžička na opravu kúpeľne");
        dlhy.add("Pôžička na nákup pračky");
    }

    String generujDlh() {
        id_typdlhu++;
        return id_typdlhu + ";" + id_domacnosti + ";" + dlhy.get(r.nextInt(dlhy.size())) + ";" + r.nextInt(5000-100+1)+100 + ";" + datumy.get(r.nextInt(datumy.size())) + ";" + obdobie.get(r.nextInt(obdobie.size()));
    }

    String generujTypPP() {
        id_pp++;
        return id_pp + ";1;" + datumy.get(r.nextInt(datumy.size())) + ";" + obdobie.get(r.nextInt(obdobie.size()));
    }
}