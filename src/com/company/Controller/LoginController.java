package com.company.Controller;

import com.company.Model.Login;
import com.company.Vistas.LoginView;
import com.company.Vistas.selectView;

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
            if(login.checkUserRol(name).equals("VIP")){  //Comprobamos el rol
                System.out.println("Tiene permisos VIP");// Mandamos a la vista del menu del encriptador de rol VIP
                this.rol ="VIP";
            }else{
                this.rol = "normal";
            }
            selectView vista = new selectView();
            vista.choose(rol);//Vamos a la vista del menu prncipal
        }else{//La autentificacion es incorrecta
            System.out.println("Su autentificación ha fallado");
            LoginView loginView = new LoginView();
            loginView.showView();
        }
    }


    public void addUser(String name, String pass) {
        //Recogemos valor de nombre y pass de la vista

        if(!login.addUser(name, pass)){
            LoginView login = new LoginView();
            login.showView();
        }
    }

    public void updateUser(String name, String pass) {
        //Recogemos valor de nombre y pass de la vista
        if (!login.updateByName(name,pass)){
            LoginView login = new LoginView();
            login.showView();
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

