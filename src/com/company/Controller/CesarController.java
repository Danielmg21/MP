package com.company.Controller;

import com.company.Model.CifrarCesar;
import com.company.Model.DescifrarCesar;
import com.company.SalidaTxt;

import com.company.View.TrasposicionView;
import com.company.View.VigenereView;


public class CesarController {
    public String texto;
    public int clave;

    public String getMensaje() {
        return mensaje;
    }


    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String tipoCifrado = "Código Cesar";

    public String mensaje;

    public void cifrar() {
        CifrarCesar c = new CifrarCesar();
        mensaje =  c.cifradoCesar(this.texto, this.clave);
    }

    public void desCifrar() {
        DescifrarCesar d = new DescifrarCesar();
        mensaje = d.descifradoCesar(this.texto,this.clave);
    }

    public CesarController(int boton){
        switch (boton){
            case 1: cambiarVistaVigenere();
                break;
            case 2: cambiarVistaTrans();
                break;
            case 3: cifrar();
                break;
            case 4: desCifrar();
                break;
            case 5: SalidaTxt.exportarAtexto(mensaje,Integer.toString((this.clave)),tipoCifrado);
                break;

        }

    }

    public static void cambiarVistaVigenere (){

    }

    public static void cambiarVistaTrans(){
        TrasposicionView tV = new TrasposicionView();

    }


}



