package com.company;

import com.company.Romano4.cifrarCesar;
import com.company.Romano4.desCifrarCesar;

import java.io.IOException;
import java.util.Scanner;

public class controladorCesar {


    public static void cifrar(String texto, int clave) {
        cifrarCesar c = new cifrarCesar();
        c.cifradoCesar(texto, clave);
    }

    public static void desCifrar(String texto, int clave) {
        desCifrarCesar d = new desCifrarCesar();
        d.descifradoCesar(texto, clave);
    }


}



