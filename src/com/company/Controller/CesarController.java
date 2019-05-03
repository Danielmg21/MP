package com.company.Controller;

import com.company.Model.CifrarCesar;
import com.company.Model.DescifrarCesar;
import com.company.SalidaTxt;


public class CesarController {
    public String mensajeFinalizado;

    public static String cifrar(String texto,int clave) {
        return CifrarCesar.cifradoCesar(texto,clave);
    }

    public  static String desCifrar(String texto, int clave) {
        return DescifrarCesar.descifradoCesar(texto,clave);
    }
    public static void guardar (String mensaje,int clave){
        SalidaTxt.exportarAtexto(mensaje,Integer.toString(clave),"Código Cesar");
        System.out.println("Mensaje guardao en fichero");
    }


    public CesarController(int boton,String mensaje,int clave){
        switch (boton){

            case 1: mensajeFinalizado = cifrar(mensaje,clave);
                     System.out.println(mensajeFinalizado);
                break;
            case 2: mensajeFinalizado =desCifrar(mensaje,clave);
                    System.out.println(mensajeFinalizado);
                break;
        }
    }




}



