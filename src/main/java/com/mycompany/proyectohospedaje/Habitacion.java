package com.mycompany.proyectohospedaje;

public class Habitacion {

    private String estado;
    
    public Habitacion() {
        this.estado = "Disponible";
    }

    public void ocuparHabitacion() {
        this.estado = "No Diponible";
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Estado: " + getEstado();
    }
}
