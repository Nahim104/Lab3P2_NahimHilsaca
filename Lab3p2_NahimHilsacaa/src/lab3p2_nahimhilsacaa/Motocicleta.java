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
public class Motocicleta extends Vehiculo {
    
    private int velocidad_maxima;
    private int peso;
    private int consumo;

    public Motocicleta() {
        super();
    }

    public Motocicleta(int velocidad_maxima, int peso, int consumo, String num_placa, String marca, String Modelo, String tipo, Color color, Date anio) {
        super(num_placa, marca, Modelo, tipo, color, anio);
        this.velocidad_maxima = velocidad_maxima;
        this.peso = peso;
        this.consumo = consumo;
    }

    public int getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(int velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return  "velocidad_maxima=" + velocidad_maxima + "\n peso=" + peso + "\n consumo=" + consumo;
    }

    
    
    
    
    

    
    
    
    
    
}
