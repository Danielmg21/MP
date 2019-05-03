package com.company.Model;

public class CifrarTransposicion {
    private static String encryption(String in1, String in2){
        System.out.print("Enter Message: ");
        String plainText = in1.toUpperCase().replace(" ", "");
        StringBuilder msg = new StringBuilder(plainText);

        System.out.print("Enter Keyword: ");
        String keyword = in2.toUpperCase();

        // assigning numbers to keywords
        int[] kywrdNumList = keywordNumAssign(keyword);

        // printing keyword
        for (int i = 0, j = 1; i < keyword.length(); i++, j++) {
            System.out.print(keyword.substring(i, j) + " ");
        }
        System.out.println();

        for (int i: kywrdNumList){
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("-------------------------");

        // in case characters don't fit the entire grid perfectly.
        int extraLetters = msg.length() % keyword.length();
        //System.out.println(extraLetters);
        int dummyCharacters = keyword.length() - extraLetters;
//        System.out.println(dummyCharacters);

        if (extraLetters != 0){
            for (int i = 0; i < dummyCharacters; i++) {
                msg.append(".");
            }
        }

        int numOfRows = msg.length() / keyword.length();

        // Converting message into a grid
        char[][] arr = new char[numOfRows][keyword.length()];

        int z = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < keyword.length(); j++) {
                arr[i][j] = msg.charAt(z);
                z++;
            }

        }

        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < keyword.length(); j++) {
                System.out.print(arr[i][j] + " ");
            } // inner for loop
            System.out.println();
        } // for loop

        // cipher text generation
        StringBuilder cipherText = new StringBuilder();

        System.out.println();
        // getting locations of numbers
        String numLoc = getNumberLocation(keyword, kywrdNumList);
        System.out.println("Location of numbers: " + numLoc);
        System.out.println();

        for (int i = 0, k = 0; i < numOfRows; i++, k++) {
            int d;
            if (k == keyword.length()){
                break;
            } else {
                d = Character.getNumericValue(numLoc.charAt(k));
            }
            for (int j = 0; j < numOfRows; j++) {
                cipherText.append(arr[j][d]);
            }
        }

        System.out.println("Cipher Text: " + cipherText);
        return cipherText.toString();

    }
