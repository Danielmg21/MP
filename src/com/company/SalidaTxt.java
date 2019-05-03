package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalidaTxt {
    public static void exportarAtexto(String msgdescifrado, String clave, String tipodecifrado) {
        switch (tipodecifrado) {
            case ("Código Cesar"):
                try {
                    FileWriter fw = new FileWriter(  "codigocesar.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Mensaje descifrado por " + tipodecifrado + " con desplazamiento " + clave + " : ");
                    pw.println(msgdescifrado);

                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }
                break;

            case ("Código Vigenere"):

                try {
                    FileWriter fw = new FileWriter( "codigovigenere.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Mensaje descifrado por " + tipodecifrado + " con palabra clave " + clave + " : ");
                    pw.println(msgdescifrado);

                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }
                break;

            case ("Transposición"):

                try {
                    FileWriter fw = new FileWriter( "transposicion.txt");
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Mensaje descifrado por " + tipodecifrado + " con clave " + clave + " : ");
                    pw.println(msgdescifrado);

                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}

