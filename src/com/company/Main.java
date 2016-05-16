package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Generator g = new Generator();
        g.nacitajMenaPriezviska();
        g.nacitajPav();
        g.nacitajDatumy();
        g.nacitajNazov();
        g.nacitajObdobie();
        g.nacitajUlice();
        System.out.println("DOMACNOST 1");
        System.out.println(g.generujDomacnost());
        System.out.println(g.generujMuza());
        System.out.println(g.generujZenu());
        System.out.println(g.generujZenu());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println();

        System.out.println("DOMACNOST 2");
        System.out.println(g.generujDomacnost());
        System.out.println(g.generujMuza());
        System.out.println(g.generujZenu());
        System.out.println(g.generujMuza());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());
        System.out.println();
        System.out.println("DOMACNOST 3");
        System.out.println(g.generujDomacnost());
        System.out.println(g.generujMuza());
        System.out.println(g.generujZenu());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujPav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujSpav());
        System.out.println(g.generujDlh());
        System.out.println(g.generujDlh());


    }
}
