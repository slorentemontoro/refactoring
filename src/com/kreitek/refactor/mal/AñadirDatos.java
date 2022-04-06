package com.kreitek.refactor.mal;

import com.kreitek.refactor.mal.Documentos.ID;
import com.kreitek.refactor.mal.Documentos.TIPOID;

import java.util.ArrayList;
import java.util.List;

public class AñadirDatos {

    public static List<ID> DatosLista = new ArrayList<>();

    public static void AñadirID() {

        DatosLista.add(new ID(TIPOID.DNI, "11111111H", null));
        DatosLista.add(new ID(TIPOID.DNI, "24324356A", null));
        DatosLista.add(new ID(TIPOID.NIE, "X0932707B", null));
        DatosLista.add(new ID(TIPOID.NIE, "Z2691139Z", null));
        DatosLista.add(new ID(TIPOID.CIF, "W9696294I", null));
        DatosLista.add(new ID(TIPOID.CIF, "W9696294A", null));
    }
}
