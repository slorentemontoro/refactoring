package com.kreitek.refactor.mal.Comprobadores;

import com.kreitek.refactor.mal.Funciones.ValidarNIE;
import com.kreitek.refactor.mal.Documentos.ID;


public class ComprobadorNIE {

    protected static String nie;
    protected static boolean esValido = false;
    protected static String nieLetra;

    public static int ComprobarNIE(ID id) {

        nie = id.getnumID().toUpperCase();

        nieLetra = nie.substring(0, 1);

        if (nie.length() == 9 && Character.isLetter(nie.charAt(8)) && nieLetra.equals("X") || nieLetra.equals("Y") || nieLetra.equals("Z")) {
            esValido = ValidarNIE.ValidarASCII();
        }
        return esValido ? ValidarNIE.ValidarLetra() : 0;
    }
}