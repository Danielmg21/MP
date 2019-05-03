package com.company.Controller;

import com.company.Model.Login;
import com.company.Vistas.LoginView;

public class LoginController {

    int opcion;
    String name;
    String pass;
    String rol;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private Login login = new Login();
    public  void authUser(String name, String pass) {
        //Recogemos valor de nombre y pass de la vista

        if(login.authUser(name, pass)){ //Si devuelve true
            if(login.checkUserRol(name) == "VIP"){  //Comprobamos el rol
                //return new viewModel("VIP"); //Mandamos a la vista del menu del encriptador de rol VIP
            }else{
                //return new viewModel("Normal"); //Mandamos a la vista del menu encriptador de rol normal
            }
        }else{//La autentificacion es incorrecta
            //return new viewModel("El usuario y la contraseña no coinciden");
        }
    }


    public void addUser(String name, String pass) {
        //Recogemos valor de nombre y pass de la vista

        if(login.addUser(name, pass)){
            //return new viewModel(name, pass, "Usuario añadido correctamente");
            System.out.println("Usuario añadido correctamente");
        }else{
            //return new viewModel(null, null, "Ha habido un error al añadir al usuario");
            System.out.println("");
        }
    }

    public void updateUser(String name, String pass) {
        //Recogemos valor de nombre y pass de la vista

        if(login.checkUser(name)){//Primero comprobamos que exista el usuario al que se le intenta cambiar la contraseña
            if(login.updateByName(name,pass)){
                //return new viewModel(name, pass, "La contraseña se ha cambiado correctamente");
                System.out.println("La contraseña se ha cambiado correctamente");
            }else{
                //return new viewModel(null, null, "Hubo un problema al cambiar la contraseña");
                System.out.println("Hubo un problema al cambiar la contraseña");
            }

        }else{
            //return new viewModel(null, null, "El usuario no esta registrado");
            System.out.println("El usuario no esta registrado");
        }
    }

    public void controller(){
        //Recogemos valor del boton de la vista

        LoginView loginView = new LoginView();
        switch (this.opcion) {
            case 1: //Caso de boton de login
                loginView.askLogin(opcion);
                break;
            case 2: //Caso de boton añadir usuario
                loginView.askLogin(opcion);
                break;
            case 3: //Caso de boton cambiar contraseña
                loginView.askLogin(opcion);
                break;
            default:
                break;
        }
    }

}

