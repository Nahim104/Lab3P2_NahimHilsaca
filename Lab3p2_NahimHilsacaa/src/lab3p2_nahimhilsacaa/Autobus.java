/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_nahimhilsacaa;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author nahim
 */
public class Autobus extends Vehiculo {
    
    private int capacidad_pasajeros;
    private int num_ejes;
    private int longitud;

    public Autobus() {
        super();
    }

    public Autobus(int capacidad_pasajeros, int num_ejes, int longitud, String num_placa, String marca, String Modelo, String tipo, Color color, Date anio) {
        super(num_placa, marca, Modelo, tipo, color, anio);
        this.capacidad_pasajeros = capacidad_pasajeros;
        this.num_ejes = num_ejes;
        this.longitud = longitud;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public int getNum_ejes() {
        return num_ejes;
    }

    public void setNum_ejes(int num_ejes) {
        this.num_ejes = num_ejes;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Autobus{" + "capacidad_pasajeros=" + capacidad_pasajeros + ", num_ejes=" + num_ejes + ", longitud=" + longitud + '}';
    }
    
    

    
    
    
    
    
}
