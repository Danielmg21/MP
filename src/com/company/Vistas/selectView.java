package com.company.Vistas;
import com.company.Controller.LoginController;
import com.company.Main;

import javax.management.relation.Role;
import java.util.Scanner;

public class selectView {
    public static void choose (String rol){
        String rolVip = rol;
        System.out.println("/***************************/");
        System.out.println("Escoja que método quiere usar (Escriba el número)");
        System.out.println("/***************************/");
        System.out.println("1.-Cesar");
        System.out.println("2.-Transposicion");
        System.out.println("3.-Vigenere(VIP)");
        System.out.println("4.Salir");
        Scanner lector = new Scanner (System.in);
        try{
            int choose = lector.nextInt();
            LoginController login = new LoginController();
            switch (choose){
                case 1: ViewCesar c = new ViewCesar();
                    c.cesar();
                    selectView.choose(login.getRol());
                    break;
                case 2: TransposicionView t = new TransposicionView();
                    t.transposicion();
                    selectView.choose(login.getRol());
                    break;
                case 3:
                    if(rolVip =="VIP") {
                        VigenereView v = new VigenereView();
                        v.vigenere();
                    }else{
                        System.out.println("No tienes permisos suficientes");
                        selectView.choose(login.getRol());
                    }
                    break;
                case 4:
                    System.out.println("Muchas gracias por usar nuestra aplicacion.");
                    System.exit(0);

            }
        }catch(Exception e){
            System.out.println("Número incorrecto");
            choose(rolVip);
        }


    }
}
