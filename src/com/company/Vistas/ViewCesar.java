package com.company.Vistas;
import java.util.Scanner;
import com.company.Controller.CesarController;

public class ViewCesar {
    public static void cesar (){
        int opciones;
        Scanner lector = new Scanner(System.in);
        System.out.println("introduzca el mensaje");
        String mensaje = lector.nextLine();
        System.out.println("Introduzca la clave");
        int clave = lector.nextInt();
        System.out.println("Escriba la opcion que quiera");
        System.out.println("1.Cifrar");
        System.out.println("2.Descifrar");
        opciones = lector.nextInt();
        CesarController cesar1 = new CesarController(opciones,mensaje,clave);
        System.out.println("¿Quiere guardar en fichero?");
        char guardar = lector.next().charAt(0);
        if (guardar == 'Y'){
           cesar1.guardar(cesar1.mensajeFinalizado,clave);
        }
    }
}
