package com.company.Model;

public class CifradorTrasposicion {
    public static String cifradoTrasposicion(String texto, String codigo) {
        char[] cArray = texto.toCharArray();
        char[] aplhabet = new char[27];
        aplhabet[0] = ' ';
        int index = 1;
        for (char c = 'a'; c <= 'z'; c++)
        {
            aplhabet[index++] = c;
        }
        int index1 = 0;
        int[] step1 = new int[cArray.length];
        for(int i=0; i<cArray.length;i++)
        {

            for(int k=0; k<aplhabet.length;k++)
            {
                if(cArray[i]==(aplhabet[k]))
                {
                    step1[index1] = k;
                    index1++;
                }
            }
        }
        char[] KeyArr = codigo.toCharArray();
        String encrypted="";
        for(int k=0; k<cArray.length; k++)
        {
            for(int l=0; l<KeyArr.length; l++)
            {
                if(step1[k]==l)
                    encrypted = encrypted + KeyArr[l];
            }
        }
        return encrypted;

    }
}
