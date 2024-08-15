/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author WChavarria
 */
public class Habitaciones {
    private String numeroHabitacion;
    private String estado;
    private String tipo;
    private double precio;

    //Constructor
    public Habitaciones(String numeroHabitacion, String estado, String tipo, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;
    }

    //Getters
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    //Setters
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
