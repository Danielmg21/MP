package com.company.Romano4;

import java.io.IOException;
import java.util.Scanner;

public class controladorCesar{
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            String texto;
            int codigo;
            char opcion;
            cifrarCesar c = new cifrarCesar();
            desCifrarCesar d = new desCifrarCesar();

            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();

            System.out.print("Introduce el código: ");
            codigo = sc.nextInt();


            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();

            if (Character.toUpperCase(opcion) == 'C') {
                System.out.println("Texto cifrado: " + c.cifradoCesar(texto, codigo));
            } else {
                System.out.println("Texto descifrado: " + d.descifradoCesar(texto, codigo));
            }
        }
    }



