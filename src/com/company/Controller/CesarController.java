package com.company.Controller;

import com.company.Model.CifrarCesar;
import com.company.Model.DescifrarCesar;
import com.company.SalidaTxt;


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

    public void  cifrar() {
        CifrarCesar.cifradoCesar(texto,clave);
    }

    public  void desCifrar() {
        DescifrarCesar.descifradoCesar(texto,clave);
    }
    public CesarController(String mensaje,int clave){
        setTexto(texto);
        setClave(clave);
    }
    public CesarController(int boton){
        switch (boton){

            case 1: cifrar();
                break;
            case 2: desCifrar();
                break;
            case 3: SalidaTxt.exportarAtexto(mensaje,Integer.toString((this.clave)),tipoCifrado);
                break;
        }
    }




}



