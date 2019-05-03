package com.company.Model;

public class DescifradorTrasposicion {
    public static String descifradoTrasposicion(String texto, String codigo) {
        char[] KeyArr = codigo.toCharArray();
        char[] cArray = texto.toCharArray();
        int[] step1 = new int[cArray.length];
        for (int k = 0; k < cArray.length; k++) {
            for (int l = 0; l < KeyArr.length; l++) {
                if (cArray[k] == KeyArr[l])
                    step1[k] = l;
            }
        }
        char[] aplhabet = new char[27];
        aplhabet[0] = ' ';
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++) {
            aplhabet[index++] = c;
        }
        char[] cDecrypted = new char[cArray.length];
        int index1 = 0;
        for (int i = 0; i < step1.length; i++) {
            for (int k = 0; k < aplhabet.length; k++) {
                if (step1[i] == k) {
                    cDecrypted[index1] = aplhabet[k];
                    index1++;
                }
            }
        }
        String decrypted = new String(cDecrypted);
        return decrypted;
    }
}
