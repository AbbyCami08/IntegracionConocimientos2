/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Habitacion {
    //Atributos
    private String numeroHabitacion;
    private String estado;
    private String tipo;
    private double precio;
    Habitaciones cuarto[][];

    //Contructor
    public Habitacion() {
        this.cuarto = new Habitaciones[5][5];
    }
    
    //Metodos
    public void habitacionesHotel(){
        //piso 1
        cuarto[0][0] = new Habitaciones("101","Libre", "Simple", 30);
        cuarto[0][1] = new Habitaciones("102","Libre", "Doble", 30);
        cuarto[0][2] = new Habitaciones("103","Libre", "Simple", 30);
        cuarto[0][3] = new Habitaciones("104","Libre", "Doble", 30);
        cuarto[0][4] = new Habitaciones("105","Sucia", "Simple", 40);
        
        //piso 2
        cuarto[1][0] = new Habitaciones("201","Libre", "Simple", 40);
        cuarto[1][1] = new Habitaciones("202","Libre", "Doble", 40);
        cuarto[1][2] = new Habitaciones("203","Libre", "Simple", 40);
        cuarto[1][3] = new Habitaciones("204","Libre", "Doble", 40);
        cuarto[1][4] = new Habitaciones("205","Sucia", "Simple", 40);
        
        //piso 3
        cuarto[2][0] = new Habitaciones("301","Sucia", "Doble", 50);
        cuarto[2][1] = new Habitaciones("302","Libre", "Doble", 60);
        cuarto[2][2] = new Habitaciones("303","Libre", "Simple", 40);
        cuarto[2][3] = new Habitaciones("304","Libre", "Doble", 30);
        cuarto[2][4] = new Habitaciones("305","Sucia", "Simple", 40);
        
        //piso 4
        cuarto[3][0] = new Habitaciones("401","Ocupada", "Simple", 50);
        cuarto[3][1] = new Habitaciones("402","Libre", "Doble", 60);
        cuarto[3][2] = new Habitaciones("403","Libre", "Simple", 40);
        cuarto[3][3] = new Habitaciones("404","Libre", "Doble", 40);
        cuarto[3][4] = new Habitaciones("405","Sucia", "Simple", 40);
        
        //piso 5
        cuarto[4][0] = new Habitaciones("501","Libre", "Simple", 50);
        cuarto[4][1] = new Habitaciones("502","Libre", "Doble", 60);
        cuarto[4][2] = new Habitaciones("503","Libre", "Simple", 40);
        cuarto[4][3] = new Habitaciones("504","Libre", "Doble", 40);
        cuarto[4][4] = new Habitaciones("505","Sucia", "Simple", 40);
    }  
    
    public void mostrarHabitaciones(){
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
               System.out.println("Habitacion: " + cuarto[i][j].getNumeroHabitacion()+ " " + cuarto[i][j].getEstado() + " " + cuarto[i][j].getTipo() + " " + cuarto[i][j].getPrecio());
            }
            System.out.println("--------------------------------------------------------------------------");
        }
    }
    
    public void cambiarEstado(){
        String buscarHabitacion = JOptionPane.showInputDialog("Digite el numero de habitacion del que desea modificar el estado: ");
        boolean encontrado = false;
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
                if (buscarHabitacion.equalsIgnoreCase(cuarto[i][j].getNumeroHabitacion())){
                    encontrado = true;
                    String modificarEstado = JOptionPane.showInputDialog("Digite el estado de la habitacion: ");
                    this.cuarto[i][j].setEstado(modificarEstado);
                    
                }
            }
        }
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Lo siento la habitacion que usted ha solicita no existe, la habitacion digitada fue: " + buscarHabitacion);
        }
    }
    
    public void cambiarTipo(){
        String buscarHabitacion = JOptionPane.showInputDialog("Digite el numero de habitacion del que desea modificar el tipo: ");
        boolean encontrado = false;
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
                if (buscarHabitacion.equalsIgnoreCase(cuarto[i][j].getNumeroHabitacion())){
                    encontrado = true;
                    String modificarTipo = JOptionPane.showInputDialog("Digite el tipo actual de la habitacion: ");
                    this.cuarto[i][j].setTipo(modificarTipo);
                    
                }
            }
        }
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Lo siento la habitacion que usted ha solicita no existe, la habitacion digitada fue: " + buscarHabitacion);
        }
    }
    
    public void cambiarPrecio(){
        String buscarHabitacion = JOptionPane.showInputDialog("Digite el numero de habitacion del que desea modificar el precio: ");
        boolean encontrado = false;
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
                if (buscarHabitacion.equalsIgnoreCase(cuarto[i][j].getNumeroHabitacion())){
                    encontrado = true;
                    double modificarPrecio = Double.parseDouble(JOptionPane.showInputDialog("Digite el nuevo precio: "));
                    this.cuarto[i][j].setPrecio(modificarPrecio);
                    
                }
            }
        }
        if (encontrado == false){
            JOptionPane.showMessageDialog(null, "Lo siento la habitacion que usted ha solicita no existe, la habitacion digitada fue: " + buscarHabitacion);
        }
    }
    
    public void calcularEstadoHabitaciones(){
        int totalHabitaciones = 5 * 5;
        int habitacionesLibres = 0;
        int habitacionesSucias = 0;
        int habitacionesOcupadas = 0;
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
                if (cuarto[i][j].getEstado().equalsIgnoreCase("Libre")){
                    habitacionesLibres++;
                }else if (cuarto[i][j].getEstado().equalsIgnoreCase("Sucia")){
                    habitacionesSucias++;
                }else if (cuarto[i][j].getEstado().equalsIgnoreCase("Ocupada")){
                    habitacionesOcupadas++;
                }
            }
        }
        
        double porcentajeLibres = (habitacionesLibres * 100) / totalHabitaciones ;
        double porcentajeSucias = (habitacionesSucias * 100) / totalHabitaciones ;
        double porcentajeOcupadas = (habitacionesOcupadas * 100) / totalHabitaciones;
        
        System.out.println("La cantidad total de habitaciones libres es: " + habitacionesLibres + " El porcentaje es: " + porcentajeLibres + "%");
        System.out.println("La cantidad total de habitaciones sucias es: " + habitacionesSucias + " El porcentaje es: " + porcentajeSucias + "%");
        System.out.println("La cantidad total de habitaciones ocupadas es: " + habitacionesOcupadas + " El porcentaje es: " + porcentajeOcupadas + "%");
       
    }
    
    public void gananciaDelHotel(){
        double gananciaTotal = 0;
        for (int i = 0; i < cuarto.length; i++) {
            for (int j = 0; j < cuarto.length; j++) {
                if(cuarto[i][j].getEstado().equalsIgnoreCase("Ocupada")){
                    gananciaTotal += cuarto[i][j].getPrecio();
                }
            }
        }
        System.out.println("La ganancia actual del hotel basado en las habitaciones que estan ocupadas en el momento es: $" + gananciaTotal);
        
    }
    
    
}
