package com.company.Vistas;


import com.company.Controller.VigenereController;

import java.util.Scanner;

public class VigenereView {
    public static void vigenere (){
        int opciones;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el mensaje");
        String mensaje = lector.nextLine();
        System.out.println("Introduzca la clave");
        String clave = lector.nextLine();
        System.out.println("Escriba la opcion que quiera(Número)");
        System.out.println("1.-Cifrar");
        System.out.println("2.-Descifrar");
        opciones = lector.nextInt();
        VigenereController vigenere = new VigenereController(opciones,mensaje,clave);
        System.out.println("¿Quiere guardar en fichero?[SAVE](Y)");
        char guardar = lector.next().charAt(0);
        if (guardar == 'Y'){
            vigenere.guardar(vigenere.mensajeFinalizado,clave);
        }
    }




}
