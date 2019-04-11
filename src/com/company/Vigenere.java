import cifrador.vigenere.CifradorVigenere;
import cifrador.vigenere.DescifradorVigenere;


public class Vigenere {
    private String textoCifrado = "";
    private String textoClaro = "";
    CifradorVigenere cifradoVigenere = new CifradorVigenere();
    DescifradorVigenere descifradoVigenere = new DescifradorVigenere();

    public String encriptarTextoClaro(String textoClaro, String clave) {
        String claveCompletada = "";
        int indice = 0;
        for (int i = indice; i < textoClaro.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < textoClaro.length()) {
                    if (textoClaro.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < textoClaro.length(); i++) {
            char charTextoClaro = textoClaro.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoClaro != ' ') {
                textoCifrado += cifradoVigenere.getTextoCifrado(charTextoClaro, charClaveCompletada) + "";
            } else {
                textoCifrado += " ";
            }
        }

        return textoCifrado;
    }

    public String desencriptarTextoCifrado(String textoCifrado, String clave) {
        String claveCompletada = "";
        int indice = 0;
        for (int i = indice; i < textoCifrado.length(); i++) {
            for (int j = 0; j < clave.length(); j++) {
                if (claveCompletada.length() < textoCifrado.length()) {
                    if (textoCifrado.charAt(indice) != ' ') {
                        claveCompletada += clave.charAt(j) + "";
                    } else {
                        claveCompletada += " ";
                        j--;
                    }
                    indice++;
                }
            }
        }

        for (int i = 0; i < textoCifrado.length(); i++) {
            char charTextoCifrado = textoCifrado.charAt(i);
            char charClaveCompletada = claveCompletada.charAt(i);
            if (charTextoCifrado != ' ') {
                textoClaro += descifradoVigenere.getTextoDescifrado(charTextoCifrado, charClaveCompletada) + "";
            } else {
                textoClaro += " ";
            }
        }

        return textoClaro;
    }

}