package com.company;
import com.company.Vistas.selectView;
import com.company.Vistas.LoginView;

public class Main {

    public String rol;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public static void main(String[] args) {
        LoginView login = new LoginView();
        login.showView();
         }

}

