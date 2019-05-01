package com.company.Controller;

import com.company.Model.CifrarCesar;
import com.company.Model.DescifrarCesar;

public class CesarController {


    public static void cifrar(String texto, int clave) {
        CifrarCesar c = new CifrarCesar();
        c.cifradoCesar(texto, clave);
    }

    public static void desCifrar(String texto, int clave) {
        DescifrarCesar d = new DescifrarCesar();
        d.descifradoCesar(texto, clave);
    }

    public CesarController(int boton){
        switch (boton){
            case 1: cambiarVistaVigenere();
                System.out.println("Hola");
                break;
            case 2: cambiarVistaTrans();
                break;
            case 3: cifrar();
                break;
            case 4: desCifrar();
                break;

        }

    }
    public static void cambiarVistaVigenere (){

    }

    public static void cambiarVistaTrans(){

    }


}



