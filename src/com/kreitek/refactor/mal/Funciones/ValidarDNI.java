package com.kreitek.refactor.mal.Funciones;

import com.kreitek.refactor.mal.Comprobadores.ComprobadorDNI;

public class ValidarDNI extends ComprobadorDNI {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
