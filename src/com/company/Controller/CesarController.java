package com.company.controller;

import com.company.Model.CifrarCesar;
import com.company.Model.DescifrarCesar;
import com.company.View.TrasposicionView;
import com.company.View.VigenereView;

public class CesarController {
    public String texto;
    public int clave;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public  void cifrar() {
        CifrarCesar c = new CifrarCesar();
        c.cifradoCesar(this.texto, this.clave);
    }

    public void desCifrar() {
        DescifrarCesar d = new DescifrarCesar();
        d.descifradoCesar(this.texto,this.clave);
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
        VigenereView vV = new VigenereView();
    }

    public static void cambiarVistaTrans(){
        TrasposicionView tV = new TrasposicionView();

    }


}



