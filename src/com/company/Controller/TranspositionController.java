package com.company.Controller;

import com.company.Model.CifradorTrasposicion;
import com.company.Model.DescifradorTrasposicion;
import com.company.SalidaTxt;

public class TranspositionController {

    public String mensajeFinalizado;

    public static String cifrar(String texto,String clave) {
        return CifradorTrasposicion.cifradoTrasposicion(texto,clave);
    }

    public  static String desCifrar(String texto,String clave) {

        return DescifradorTrasposicion.descifradoTrasposicion(texto,clave);
    }

    public TranspositionController(int boton,String texto,String clave){
        switch (boton){
            case 1: mensajeFinalizado = cifrar(texto,clave);
                    System.out.println("Resulatado: "+mensajeFinalizado);
                break;
            case 2: mensajeFinalizado = desCifrar(texto,clave);
                    System.out.println("Resulatado: "+mensajeFinalizado);
                break;
        }
    }

    public static void guardar (String mensaje,String clave){
        SalidaTxt.exportarAtexto(mensaje,clave,"Transposición");
        System.out.println("Mensaje guardao en fichero");
    }







}
