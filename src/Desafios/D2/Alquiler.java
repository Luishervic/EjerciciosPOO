package Desafios.D2;

import java.util.Date;

public class Alquiler {
    private String peliculaT;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String peliculaT, Date fechaInicio, Date fechaFin, double precio) {
        this.peliculaT = peliculaT;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPeliculaT() {
        return peliculaT;
    }

    public void setPeliculaT(String peliculaT) {
        this.peliculaT = peliculaT;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "peliculaT='" + peliculaT + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }

}
