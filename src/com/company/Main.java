package com.company;

import com.company.Vistas.VigenereView;
import com.company.Vistas.TransposicionView;
import com.company.Vistas.ViewCesar;


public class Main {

    public static void main(String[] args) {
        VigenereView v = new VigenereView();
        v.vigenere();

        ViewCesar c = new ViewCesar();
        c.cesar();


        TransposicionView t = new TransposicionView();
        t.transposicion();

         }

}

