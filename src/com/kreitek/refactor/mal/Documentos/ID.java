package com.kreitek.refactor.mal.Documentos;

import com.kreitek.refactor.mal.Comprobadores.ComprobadorCIF;
import com.kreitek.refactor.mal.Comprobadores.ComprobadorDNI;
import com.kreitek.refactor.mal.Comprobadores.ComprobadorNIE;

import java.util.Date;

public class ID {

    private TIPOID enumTipo;
    private String numID;
    private Date fchValidez;


    public ID(TIPOID enumTipo, String numID, Date fchValidez) {
        this.enumTipo = enumTipo;
        this.numID = numID;
        this.fchValidez = fchValidez;
    }


    public TIPOID getEnumTipo() {
        return enumTipo;
    }

    public String getnumID() {
        return numID;
    }

    public Date getFchValidez() {
        return fchValidez;
    }

    public int ValidarDocumentos() {
        switch (this.enumTipo) {
            case DNI:
                return ComprobadorDNI.ComprobarDNI(this);
            case CIF:
                return ComprobadorCIF.ComprobarCIF(this);
            case NIE:
                return ComprobadorNIE.ComprobarNIE(this);
            default:
                return -99;
        }
    }
}