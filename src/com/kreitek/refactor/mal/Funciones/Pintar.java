package com.kreitek.refactor.mal.Funciones;

import com.kreitek.refactor.mal.Comprobadores.ComprobarID;


import static com.kreitek.refactor.mal.AñadirDatos.*;

public class Pintar {

    public static void Encabezado(){
        System.out.println("=====================");
        System.out.println("Vamos a refactorizar!");
        System.out.println("=====================");
    }

    protected static Boolean revisar;

    public static void Comprobar(){
        for (int i = 0; i < DatosLista.size(); i++) {

            revisar = ComprobarID.Comprobar(DatosLista.get(i));
            System.out.println(DatosLista.get(i).getEnumTipo() +" "+ DatosLista.get(i).getnumID() + " es: " + revisar);
        }
    }
}
