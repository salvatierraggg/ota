package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

/*adapter*/
public interface Proveedor {

     List<Vuelo> buscarVuelos(DateTime fecha, final String origen, final String destino);

     Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros);

     public String getProveedor();
}
