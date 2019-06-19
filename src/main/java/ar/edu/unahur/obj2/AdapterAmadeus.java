package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class AdapterAmadeus  implements Proveedor {

    private Amadeus amadeus;

    public AdapterAmadeus(Amadeus amadeus) {
        this.amadeus = amadeus;
    }

    @Override
    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {
        return amadeus.executeSearch(fecha, origen, destino);
    }

    @Override
    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return null;
    }

    public String getProveedor() {
        return "Amadeus";
    }



}
