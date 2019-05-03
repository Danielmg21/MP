package com.company;
import java.util.Scanner;
import com.company.Controller.CesarController;
import com.company.Controller.TranspositionController;
import com.company.Controller.VigenereController;



public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba el modo que quiera");
        String selector = lector.nextLine();
        int opciones;
        switch(selector) {
            case "Cesar":
                System.out.println("introduzca el mensaje");
                String mensaje = lector.nextLine();
                System.out.println("Introduzca la clave");
                int clave = lector.nextInt();
                CesarController cesar = new CesarController(mensaje,clave);
                System.out.println("Escriba la opcion que quiera");
                System.out.println("1.Cifrar");
                System.out.println("2.Descifrar");
                System.out.println("3.Guardar fichero");
                opciones = lector.nextInt();
                CesarController cesar1 = new CesarController(opciones);
                break;
            case "Vigenere":System.out.println("Escriba la opcion que quiera");
                System.out.println("1.Cifrar");
                System.out.println("2.Descifrar");
                System.out.println("3.Guardar fichero");
                opciones = lector.nextInt();
                VigenereController vigenere = new VigenereController(opciones);
                break;
            case "Transposicion":
                System.out.println("Escriba la opcion que quiera");
                System.out.println("1.Cifrar");
                System.out.println("2.Descifrar");
                System.out.println("3.Guardar fichero");
                opciones = lector.nextInt();
                TranspositionController transposition = new TranspositionController(opciones);
        }

    }

}

