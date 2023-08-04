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
public class Vehiculo {
    private String num_placa;
    private String marca;
    private String tipo;
    private Color color;
    private Date anio;

    public Vehiculo() {
    }

    public Vehiculo(String num_placa, String marca, String tipo, Color color, Date anio) {
        this.num_placa = num_placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.anio = anio;
    }

    public String getNum_placa() {
        return num_placa;
    }

    public void setNum_placa(String num_placa) {
        this.num_placa = num_placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "num_placa=" + num_placa + ", marca=" + marca + ", tipo=" + tipo + ", color=" + color + ", anio=" + anio + '}';
    }
    
    
}
