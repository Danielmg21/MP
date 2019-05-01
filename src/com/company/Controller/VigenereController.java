package com.company.controller;


import com.company.Model.CifradorVigenere;
import com.company.Model.DescifradorVigenere;
import com.company.View.TrasposicionView;
import com.company.View.CesarView;


public class VigenereController {
    private String textoCifrado = "";
    private String textoClaro = "";
    CifradorVigenere cifradoVigenere = new CifradorVigenere();
    DescifradorVigenere descifradoVigenere = new DescifradorVigenere();

    public String encriptarTextoClaro(String textoClaro, String clave) {
        String claveCompletada = "";
        int indice = 0;
        for (int i = indice; i < textoClaro.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < textoClaro.length()) {
                    if (textoClaro.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < textoClaro.length(); i++) {
            char charTextoClaro = textoClaro.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoClaro != ' ') {
                textoCifrado += cifradoVigenere.getTextoCifrado(charTextoClaro, charClaveCompletada) + "";
            } else {
                textoCifrado += " ";
            }
        }

        return textoCifrado;
    }

    public String desencriptarTextoCifrado(String textoCifrado, String clave) {
        String claveCompletada = "";
        int indice = 0;
        for (int i = indice; i < textoCifrado.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < textoCifrado.length()) {
                    if (textoCifrado.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < textoCifrado.length(); i++) {
            char charTextoCifrado = textoCifrado.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoCifrado != ' ') {
                textoClaro += descifradoVigenere.getTextoDescifrado(charTextoCifrado, charClaveCompletada) + "";
            } else {
                textoClaro += " ";
            }
        }

        return textoClaro;
    }


    public VigenereController(int boton) {
        switch (boton) {
            case 1:
                cambiarVistaCesar();
                System.out.println("Hola");
                break;
            case 2:
                cambiarVistaTrans();
                break;
            case 3:
                //cifrar();
                break;
            case 4:
                //desCifrar();
                break;

        }
    }

    public static void cambiarVistaCesar (){
        CesarView vV = new CesarView();
    }

    public static void cambiarVistaTrans(){
        TrasposicionView tV = new TrasposicionView();

    }





}