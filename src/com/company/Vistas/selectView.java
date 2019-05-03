package com.company.Vistas;
import java.util.Scanner;

public class selectView {
    public static void choose (){
        System.out.println("Escoja que método quiere usar (Escriba el número)");
        System.out.println("1.Cesar");
        System.out.println("2.Vigenere");
        System.out.println("3.Transposicion");
        Scanner lector = new Scanner (System.in);
        int choose = lector.nextInt();
        switch (choose){
            case 1: ViewCesar c = new ViewCesar();
                c.cesar();
                break;
            case 2: VigenereView v = new VigenereView();
                v.vigenere();
                break;
            case 3: TransposicionView t = new TransposicionView();
                t.transposicion();
        }

    }
}
