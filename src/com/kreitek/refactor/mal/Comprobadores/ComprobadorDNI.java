package com.kreitek.refactor.mal.Comprobadores;


import com.kreitek.refactor.mal.Documentos.ID;

import static com.kreitek.refactor.mal.Funciones.ValidarDNI.*;

public class ComprobadorDNI{

    public static int ComprobarDNI(ID id) {
        String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";
        String intPartDNI = id.getnumID().trim().substring(0, 8);

        char ltrDNI = id.getnumID().charAt(8);
        int valNumDni = Integer.parseInt(intPartDNI) % 23;

        return  id.getnumID().length()!= 9 || !isNumeric(intPartDNI) || dniChars.charAt(valNumDni) != ltrDNI ? 0 : 1;
    }
}

