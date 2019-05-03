package com.company.Controller;


import com.company.Model.CifradorVigenere;
import com.company.Model.DescifradorVigenere;
import com.company.SalidaTxt;


public class VigenereController {
    public String mensajeFinalizado;
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


    public VigenereController(int boton,String mensaje,String clave) {
        switch (boton) {
            case 1: mensajeFinalizado= encriptarTextoClaro(mensaje,clave);
                    System.out.println("Resulatado: "+mensajeFinalizado);
                break;
            case 2: mensajeFinalizado = desencriptarTextoCifrado(mensaje,clave);
                    System.out.println("Resulatado: "+mensajeFinalizado);
                break;

        }
    }

    public static void guardar (String mensaje,String clave){
        SalidaTxt.exportarAtexto(mensaje,clave,"Código Vigenere");
        System.out.println("Mensaje guardao en fichero");
    }





}