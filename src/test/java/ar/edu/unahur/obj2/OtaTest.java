package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Sabre;
import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class OtaTest {

    @org.testng.annotations.Test
    public void testBuscarVuelos() {
        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico();
        Ota ota = new Ota(distribuidorDeTrafico);

        DateTime fecha = new DateTime("13-12-2019");


        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");


    }

    @org.testng.annotations.Test
    public void testReservar() {
        List<Proveedor> proveedores=Stream.of(new AdapterAmadeus(new Amadeus()),new AdapterSabre(new Sabre()),new AdapterWorldspan(new Worldspan())).collect(Collectors.toList());
        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(proveedores);
        Ota ota = new Ota(distribuidorDeTrafico);

        DateTime fecha = new DateTime("13-12-2019");


        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");

        Vuelo elegido =  vuelos.get(0);
        Set<Pasajero> pasajeros = Stream.of(new Pasajero("Juan", "Pérez", 40)).collect(Collectors.toSet());

        Boleto boleto = ota.reservar(elegido, pasajeros );

        assertEquals(boleto.getVuelo(), elegido);


    }
}