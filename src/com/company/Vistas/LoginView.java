package com.company.Vistas;

import com.company.Controller.LoginController;

import java.util.Scanner;

public class LoginView {

    public LoginView(){
    }


    public void showView() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("/***************************/");
        System.out.println("Bienvenido al ENCRIPTADOR");
        System.out.println("/***************************/");
        System.out.println();

        System.out.println("1.- Iniciar Sesion.");
        System.out.println("2.- Añadir nuevo Usuario.");
        System.out.println("3.- Cambiar contraseña.");
        System.out.print("Introduzca la opcion númerica: ");

        try {
            int opcion = sc.nextInt();
            LoginController login = new LoginController();
            login.setOpcion(opcion);
            login.controller();
        }
        catch (Exception e) {
            System.out.println("Introduzca un número válido.");
            this.showView();
        }
    }

    public void askLogin(int opcion) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su usuario: ");
        String name = sc.nextLine();

        System.out.print("Introduzca su contraseña: ");
        String pass = sc.nextLine();

        LoginController login = new LoginController();
        login.setName(name);
        login.setPass(pass);

        if (opcion == 1){
            login.authUser(login.getName(), login.getPass());
        }else if (opcion == 2){
            login.addUser(login.getName(), login.getPass());
        }else if (opcion == 3){
            login.updateUser(login.getName(), login.getPass());
        }

        login.authUser(name, pass);


        System.out.println("");
        System.out.println("");
    }


}
