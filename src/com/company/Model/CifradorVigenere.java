package com.company.Model;
public class CifradorVigenere {


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

    public char getTextoCifrado(char parTextoClaro, char parTextoClave) {
        int indiceX = 0;
        int indiceY = 0;

        for (int i = 0; i < tablaCesar.length; i++) {
            if (parTextoClaro == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }

        for (int j = 0; j < tablaCesar.length; j++) {
            if (parTextoClave == tablaCesar[j]) {
                indiceY = j;
                break;
            }
        }

        return tablaCesar[(indiceX + indiceY) % 54];
    }
}