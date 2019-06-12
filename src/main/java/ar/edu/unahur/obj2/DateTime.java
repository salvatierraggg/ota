package ar.edu.unahur.obj2;

public class DateTime {
    String fecha;
    int dia;
    int mes;
    int anio;


    public DateTime(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fecha= this.dia+"-"+this.mes+"-"+this.anio;
    }

    public void modificarDia(int dia){
        this.dia=dia;
        this.fecha= this.dia+"-"+this.mes+"-"+this.anio;
    }

    public void modificarMes(int anio){
        this.anio=anio;
        this.fecha= this.dia+"-"+this.mes+"-"+this.anio;
    }

    public void modificarAnio(int mes){
        this.mes=mes;
        this.fecha= this.dia+"-"+this.mes+"-"+this.anio;
    }

}
