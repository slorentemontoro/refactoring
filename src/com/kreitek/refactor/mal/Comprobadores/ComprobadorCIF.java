package com.kreitek.refactor.mal.Comprobadores;

import com.kreitek.refactor.mal.Documentos.ID;
import com.kreitek.refactor.mal.Funciones.ValidarCIF;

public class ComprobadorCIF{
    protected static String cif;
    public static int ComprobarCIF(ID id){
        cif = id.getnumID();
        return id.getnumID() != null ? ValidarCIF.comprobarCIF() : 0;
    }
}

