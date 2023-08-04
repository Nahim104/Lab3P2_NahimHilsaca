/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_nahimhilsacaa;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author nahim
 */
public class Lab3p2_NahimHilsacaa {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculos = new ArrayList();

    public static void main(String[] args) {

        //quitar el bloque blanco con el boton insert
        int opcion = 0;
        boolean ingreso_1 = false;

        while (opcion != 8) {

            System.out.println("Bienvenido a Su Sistema de Registro Vehicular. Ingrese su opcion: ");
            System.out.println("1. Agregar Automovil");
            System.out.println("2. Agregar Motocicleta");
            System.out.println("3. Agregar Autobus");
            System.out.println("4. Modificar Vehiculo");
            System.out.println("5. Eliminar Vehiculos");
            System.out.println("5. Mostrar Vehiculo");
            System.out.println("7. Generar Boleta");
            System.out.println("8. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    boolean combustible=false;
                     System.out.print("Ingrese el numero de la placa del automovil:");
        String placa = leer.next();
        leer.nextLine();
        System.out.print("Ingrese la Marca del automovil: ");
        String Marca = leer.next();
        leer.nextLine();
        System.out.print("Ingrese el Modelo del automovil: ");
        String Modelo = leer.next();
        leer.nextLine();
        System.out.print("Ingrese el tipo del automovil: ");
        String tipo = leer.next();
        leer.nextLine();
        System.out.print("Ingrese el color del vehiculo del automovil: ");
        Color color = JColorChooser.showDialog(null, "Elegir el color del automovil", Color.yellow);
        System.out.print("Ingrese el anio del automovil: ");
        int anio=leer.nextInt();
        Date fecha_anio= new Date();
        fecha_anio.setYear(anio);
                    System.out.print("Ingrese el tipo de combustible: ");
                    String tipo_combustible = leer.next();
                    leer.nextLine();
                    
                    if(tipo_combustible.equalsIgnoreCase("diesel")||tipo_combustible.equalsIgnoreCase("regular")||tipo_combustible.equalsIgnoreCase("super")){
                        combustible=true;
                    }else{
                    combustible=false;
                    }
                    
                    if(combustible==false){
                        System.out.println("Su combustible solo puede ser diesel, regular o super");
                    tipo_combustible = leer.next();
                    }
                    System.out.print("Ingrese el numero de puertas del automovil:");
                    int num_puertas=leer.nextInt();
                    
                    if(num_puertas<=0){
                        System.out.println("Sus puertas no pueden ser menor a 0");
                           num_puertas=leer.nextInt();
                    }
                    System.out.print("Ingrese la transmision del automovil: ");
                    String transmision=leer.next();
                    leer.nextLine();
                    System.out.print("Ingrese el numero de asientos del automovil: ");
                    int num_asientos= leer.nextInt();
                     if(num_asientos<=0){
                        System.out.println("Sus asientos no pueden ser menor a 0");
                           num_asientos=leer.nextInt();
                    }
                     
                     vehiculos.add(new Automovil(tipo_combustible,num_puertas,transmision,num_asientos,placa,Marca,Modelo,tipo,color,fecha_anio));

                    break;
                }

                case 2:
 

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Debe de ingresar de las opciones dadas");
                    ;
            }//Fin del switch
        }//Fin del while
    }//Fin del main

   

}
