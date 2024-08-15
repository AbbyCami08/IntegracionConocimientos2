/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

/**
 *
 * @author WChavarria
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LLamado de los metodos.
        Habitacion habitacion = new Habitacion();
        habitacion.habitacionesHotel();
        habitacion.mostrarHabitaciones();
        habitacion.cambiarEstado();
        habitacion.cambiarTipo();
        habitacion.cambiarPrecio();
        habitacion.mostrarHabitaciones();
        habitacion.calcularEstadoHabitaciones();
        habitacion.gananciaDelHotel();
    }
    
}
