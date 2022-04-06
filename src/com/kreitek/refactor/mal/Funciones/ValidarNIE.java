package com.kreitek.refactor.mal.Funciones;

import com.kreitek.refactor.mal.Comprobadores.ComprobadorNIE;

public class ValidarNIE extends ComprobadorNIE {

    public static boolean ValidarASCII() {

        int caracterASCII;
        int i = 1;

        do {
            caracterASCII = nie.codePointAt(i);
            esValido = (caracterASCII > 47 && caracterASCII < 58);
            i++;
        } while (i < nie.length() - 1 && esValido);

        return esValido;
    }

    public static int ValidarLetra(){

        char letra;
        int miNIE;
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        if (esValido) {
            if (nieLetra.equals("X")) {
                nie = "0" + nie.substring(1, 9);
            } else if (nieLetra.equals("Y")) {
                nie = "1" + nie.substring(1, 9);
            } else if (nieLetra.equals("Z")) {
                nie = "2" + nie.substring(1, 9);
            }
        }
            letra = nie.charAt(8);
            miNIE = Integer.parseInt(nie.substring(1, 8)) % 23;

        return letra == asignacionLetra[miNIE] ? 1 : 0;
    }
}

