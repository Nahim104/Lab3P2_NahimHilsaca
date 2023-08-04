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
public class Automovil extends Vehiculo {
    
    //Super Clase Vehiculo
    //Sub-clase Automovil
    private String tipo_combustible;
    private int num_puertas;
    private String transmision;
    private int num_asientos;

    public Automovil() {
        super();
    }

    public Automovil(String tipo_combustible, int num_puertas, String transmision, int num_asientos, String num_placa, String marca, String Modelo, String tipo, Color color, Date anio) {
        super(num_placa, marca, Modelo, tipo, color, anio);
        this.tipo_combustible = tipo_combustible;
        this.num_puertas = num_puertas;
        this.transmision = transmision;
        this.num_asientos = num_asientos;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Automovil{" + "tipo_combustible=" + tipo_combustible + ", num_puertas=" + num_puertas + ", transmision=" + transmision + ", num_asientos=" + num_asientos + '}';
    }
    
    

   
    
    
    
}
