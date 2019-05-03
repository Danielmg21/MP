/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mplogin;

public class LoginController {
    
    public int boton;
    public String name;
    public String pass;
    public String rol;


    public int getBoton() {
        return boton;
    }

    public void setBoton(int boton) {
        this.boton = boton;
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
    
    private Login login;
    private void authUser() {
        //Recogemos valor de nombre y pass de la vista
        String name = "aa";
        String pass = "a";
        
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
    

    private void addUser() {
     
        //Recogemos valor de nombre y pass de la vista
        String name = "aa";
        String pass = "aa";
        
        if(login.addUser(name, pass)){
            //return new viewModel(name, pass, "Usuario añadido correctamente");
            System.out.println("Usuario añadido correctamente");
        }else{
            //return new viewModel(null, null, "Ha habido un error al añadir al usuario");
            System.out.println("");
        }
    }

    private void updateUser() {
        //Recogemos valor de nombre y pass de la vista
        String name = "aa";
        String pass = "aa";
        
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
    
    public LoginController(){
        //Recogemos valor del boton de la vista
        
        switch (this.boton) {
            case 1: //Caso de boton de login
                this.authUser();
                break;
            case 2: //Caso de boton añadir usuario
                this.addUser();
                break;
            case 3: //Caso de boton cambiar contraseña
                this.updateUser();
                break;
            default:
                break;
        }
    }
    
}
