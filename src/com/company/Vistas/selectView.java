package com.company.Vistas;
import com.company.Controller.LoginController;

import javax.management.relation.Role;
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
                selectView.choose();
                break;
            case 2: TransposicionView t = new TransposicionView();
                t.transposicion();
                selectView.choose();
                break;
            case 3:
                LoginController login = new LoginController();
                String rol = login.getRol();
                if(rol=="VIP") {
                    VigenereView v = new VigenereView();
                    v.vigenere();
                }else{
                    System.out.println("No tienes permisos suficientes");
                    selectView.choose();
                }
                break;
        }

    }
}
