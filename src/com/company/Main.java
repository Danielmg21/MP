package com.company;
import com.company.Vistas.selectView;
import com.company.Vistas.LoginView;

public class Main {

    public static void main(String[] args) {
        LoginView login = new LoginView();
        login.showView();
        selectView vista = new selectView();
        vista.choose();
         }

}

