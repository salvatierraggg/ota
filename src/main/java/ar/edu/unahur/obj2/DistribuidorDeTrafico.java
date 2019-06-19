package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Sabre;
import ar.edu.unahur.obj2.proveedores.Worldspan;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistribuidorDeTrafico {

    private Random random = new Random();
    private List<Proveedor> proveedores;

    public DistribuidorDeTrafico(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Proveedor proveedor() {
        return proveedores.get(random.nextInt(proveedores.size()));
    }


}
