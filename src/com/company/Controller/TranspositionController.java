package com.company.Controller;

import com.company.Model.CifradorTrasposicion;
import com.company.Model.DescifradorTrasposicion;
import com.company.SalidaTxt;

public class TranspositionController {
    public String texto;
    public String clave;

    public String getMensaje() {
        return mensaje;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String tipoCifrado = "Código Transposicion";

    public String mensaje;

    public void  cifrar() {
        mensaje =  CifradorTrasposicion.cifradoTrasposicion(texto,clave);
    }

    public  void desCifrar() {
        mensaje = DescifradorTrasposicion.descifradoTrasposicion(texto,clave);
    }



    public TranspositionController(int boton){
        switch (boton){
            /*case 1: cambiarVistaVigenere();
                break;
            case 2: cambiarVistaTrans();
                break;
                */

            case 1: cifrar();
                break;
            case 2: desCifrar();
                break;
            case 3: SalidaTxt.exportarAtexto(mensaje,(clave),tipoCifrado);
                break;
        }
    }





}
