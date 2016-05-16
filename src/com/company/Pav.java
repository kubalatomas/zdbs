package com.company;

/**
 * Created by kubal on 16.05.2016.
 */
public class Pav {
    private int id_domacnosti;
    private int id_pav;
    private int kod_pav;

    public Pav(int id_domacnosti, int id_pav, int kod_pav) {
        this.id_domacnosti = id_domacnosti;
        this.id_pav = id_pav;
        this.kod_pav = kod_pav;
    }

    public int getId_domacnosti() {
        return id_domacnosti;
    }

    public int getId_pav() {
        return id_pav;
    }

    public int getKod_pav() {
        return kod_pav;
    }
}
