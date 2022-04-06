package com.kreitek.refactor.mal.Comprobadores;

import com.kreitek.refactor.mal.Documentos.ID;

public class ComprobarID {

    public static boolean Comprobar(ID id){
        return id.ValidarDocumentos() == 1;
    }
}
