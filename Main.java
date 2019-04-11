package com.company;

public class Main {

    public static void main(String[] args) {
        String tipodecifrado = "Código Cesar";
        String desplazamiento = "cuatro";
        String titulo = "descifradocesar";
        String msgdescifrado = "Estoesuntextodeejemplo Estoesuntextodeejemplo Estoesuntextodeejemplo Estoesuntextodeejemplo";
        SalidaTxt.exportarAtexto(msgdescifrado,desplazamiento,tipodecifrado,titulo);
    }
}
