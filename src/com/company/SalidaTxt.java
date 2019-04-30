package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SalidaTxt {
    public static void exportarAtexto(String msgdescifrado, String clave, String tipodecifrado, String titulo) {
        switch (tipodecifrado) {
            case ("Código Cesar"):
            System.out.println("Voy a imprimir el cesar");
                try {
                    FileWriter fw = new FileWriter(titulo + ".txt");
                    PrintWriter pw = new PrintWriter(fw);

                    pw.println("Mensaje descifrado por " + tipodecifrado + " con desplazamiento " + clave + " : ");
                    pw.println(msgdescifrado);
                    System.out.println("Estoy imprimiendo el cesar");

                    pw.close();
                } catch (
                        IOException e) {
                    e.printStackTrace();
                }
                break;

            case ("Código de VigenereController"):

                try {
                    FileWriter fw = new FileWriter(titulo + ".txt");
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
                    FileWriter fw = new FileWriter(titulo + ".txt");
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

