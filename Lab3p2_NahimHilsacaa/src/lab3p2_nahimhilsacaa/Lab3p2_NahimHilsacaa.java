/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_nahimhilsacaa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab3p2_NahimHilsacaa {

    
    static Scanner leer= new Scanner(System.in);
    static ArrayList <Vehiculo> vehiculos= new ArrayList();
    public static void main(String[] args) {
        
        
        int opcion=0;
        boolean ingreso_1= false;
        
        while (opcion !=8) {

            System.out.println("Bienvenido a Su Sistema de Registro Vehicular. Ingrese su opcion: ");
            System.out.println("1. Agregar Automovil");
            System.out.println("2. Agregar Motocicleta");
            System.out.println("3. Agregar Autobus");
            System.out.println("4. Modificar Vehiculo");
            System.out.println("5. Eliminar Vehiculos");
            System.out.println("5. Mostrar Vehiculo");
            System.out.println("7. Generar Boleta");
            System.out.println("8. Salir");
            opcion= leer.nextInt();
            
            
            switch (opcion) {
                case 1:
                    break;
                    
                    
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
                    System.out.println("Debe de ingresar de las opciones dadas");;
            }
        }
    }
  
}
