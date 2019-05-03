package com.company.Model;

public class DescifradorVigenere {


    char tablaCesar[] = {
            'A', 'B', 'C', 'D', 'E',
            'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'Ñ',
            'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c',
            'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm',
            'n', 'ñ', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'
    };

    public char getTextoDescifrado(char parTextoCifrado, char parTextoClave) {
        int indiceCharTextoCifrado = 0;
        int indiceCharTextoClave = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoCifrado == tablaCesar[i]) {
                indiceCharTextoCifrado = i;
                break;
            }
        }

        for (int j = 0; j < tablaCesar.length; j++) {
            if (parTextoClave == tablaCesar[j]) {
                indiceCharTextoClave = j;
                break;
            }
        }
        if(indiceCharTextoCifrado >= indiceCharTextoClave)
            return tablaCesar[(indiceCharTextoCifrado - indiceCharTextoClave) % 54];
        else
            return tablaCesar[27-(indiceCharTextoClave - indiceCharTextoCifrado)];
    }
}
