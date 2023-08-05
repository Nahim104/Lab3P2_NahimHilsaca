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
                    boolean combustible = false;

                    System.out.print("Ingrese el numero de la placa del automovil:");
                    String placa = leer.next();

                    while (Placa(placa, vehiculos, 'H')) {

                        Placa(placa, vehiculos, 'H');
                        break;
                    }

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
                    Color color = JColorChooser.showDialog(null, "Elegir el color del vehiculo", Color.yellow);
                    System.out.println();
                    System.out.print("Ingrese el anio del automovil: ");
                    int anio = leer.nextInt() - 1900;
                    Date fecha_anio = new Date();
                    fecha_anio.setYear(anio);
                    System.out.print("Ingrese el tipo de combustible: ");
                    String tipo_combustible = leer.next();
                    leer.nextLine();

                    if (tipo_combustible.equalsIgnoreCase("diesel") || tipo_combustible.equalsIgnoreCase("regular") || tipo_combustible.equalsIgnoreCase("super")) {
                        combustible = true;
                    } else {
                        combustible = false;
                    }

                    if (combustible == false) {
                        System.out.println("Su combustible solo puede ser diesel, regular o super");
                        tipo_combustible = leer.next();
                    }
                    System.out.print("Ingrese el numero de puertas del automovil:");
                    int num_puertas = leer.nextInt();

                    if (num_puertas <= 0) {
                        System.out.println("Sus puertas no pueden ser menor a 0");
                        num_puertas = leer.nextInt();
                    }
                    System.out.print("Ingrese la transmision del automovil: ");
                    String transmision = leer.next();
                    leer.nextLine();
                    System.out.print("Ingrese el numero de asientos del automovil: ");
                    int num_asientos = leer.nextInt();
                    if (num_asientos <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        num_asientos = leer.nextInt();
                    }

                    vehiculos.add(new Automovil(tipo_combustible, num_puertas, transmision, num_asientos, placa, Marca, Modelo, tipo, color, fecha_anio));
                    System.out.println("Automovil agregado!");

                    break;
                }

                case 2: {

                    int cont_letras = 0;
                    int cont_numeros = 0;
                    System.out.print("Ingrese el numero de la placa del automovil:");
                    String placa = leer.next();

                    while (Placa(placa, vehiculos, 'B')) {

                        Placa(placa, vehiculos, 'B');
                    }

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
                    Color color = JColorChooser.showDialog(null, "Elegir el color del vehiculo", Color.yellow);
                    System.out.println();
                    System.out.print("Ingrese el anio del automovil: ");
                    int anio = leer.nextInt() - 1900;
                    Date fecha_anio = new Date();
                    fecha_anio.setYear(anio);

                    System.out.print("Ingrese la velocidad maxima: ");
                    int velocidad_maxima = leer.nextInt();

                    if (velocidad_maxima <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        velocidad_maxima = leer.nextInt();
                    }

                    System.out.print("Ingrese el peso de la motocicleta:");
                    int peso = leer.nextInt();
                    if (peso <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        peso = leer.nextInt();
                    }
                    System.out.println("Ingrese el consumo maximo de la motocicleta:");
                    int consumo = leer.nextInt();
                    if (consumo <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        consumo = leer.nextInt();
                    }

                    vehiculos.add(new Motocicleta(velocidad_maxima, peso, consumo, placa, Marca, Modelo, tipo, color, fecha_anio));

                    break;
                }
                case 3: {

                    int cont_letras = 0;
                    int cont_numeros = 0;
                    System.out.print("Ingrese el numero de la placa del automovil:");
                    String placa = leer.next();

                    while (Placa(placa, vehiculos, 'H')) {

                        Placa(placa, vehiculos, 'H');
                    }

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
                    System.out.println();
                    Color color = JColorChooser.showDialog(null, "Elegir el color del vehiculo", Color.yellow);
                    System.out.print("Ingrese el anio del automovil: ");
                    int anio = leer.nextInt() - 1900;
                    Date fecha_anio = new Date();
                    fecha_anio.setYear(anio);

                    System.out.println("Ingrese la capacidad de pasajeros del autobus: ");
                    int capacidad_pasajeros = leer.nextInt();
                    if (capacidad_pasajeros <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        capacidad_pasajeros = leer.nextInt();
                    }
                    System.out.println("Ingrese el numero de ejes del autobus: ");
                    int ejes = leer.nextInt();
                    if (ejes <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        ejes = leer.nextInt();
                    }
                    System.out.println("Ingrese la longitud del autobus: ");
                    int longitud = leer.nextInt();
                    if (longitud <= 0) {
                        System.out.println("Sus asientos no pueden ser menor a 0");
                        longitud = leer.nextInt();
                    }
                    vehiculos.add(new Autobus(capacidad_pasajeros, ejes, longitud, placa, Marca, Modelo, tipo, color, fecha_anio));

                    break;
                }
                case 4: {

                    ImprimirVehiculos();
                    System.out.println("Ingrese el vehiculo a modificar: ");
                    int modificar = leer.nextInt();

                    for (int i = 0; i < vehiculos.size(); i++) {
                        if (modificar == (i + 1)) {
                            if (vehiculos.get(i) instanceof Automovil) {
                                boolean combustible = false;
                                int cont_letras = 0;
                                int cont_numeros = 0;
                                System.out.print("Ingrese el numero de la placa del automovil:");
                                String placa = leer.next();
                                while (placa.length() < 7) {
                                    System.out.print("Su placa debe tener 8 caracterese por lo menos");
                                    placa = leer.next();
                                }
                                for (int k = 0; k < placa.length(); k++) {

                                    char j = placa.charAt(k);

                                    if ((j > 64 && j < 90) || (j > 96 && j < 123)) {
                                        cont_letras++;
                                    }

                                    if (j < 58 && j > 47) {

                                        cont_numeros++;
                                    }
                                }
                                while (cont_letras != 3 && cont_numeros != 4) {
                                    System.out.println("La placa debe tener 3 caracteres y 4 digitos  ");
                                    placa = leer.next();

                                }
                                while (placa.charAt(0) != 'H') {
                                    System.out.println("Su placa debe inciar en H");
                                    placa = leer.next();
                                }

                                ((Automovil) vehiculos.get(i)).setNum_placa(placa);

                                System.out.print("Ingrese la Marca del automovil: ");
                                String Marca = leer.next();
                                leer.nextLine();
                                ((Automovil) vehiculos.get(i)).setMarca(Marca);
                                System.out.print("Ingrese el Modelo del automovil: ");
                                String Modelo = leer.next();
                                ((Automovil) vehiculos.get(i)).setModelo(Modelo);
                                leer.nextLine();
                                System.out.print("Ingrese el tipo del automovil: ");
                                String tipo = leer.next();
                                leer.nextLine();
                                ((Automovil) vehiculos.get(i)).setTipo(tipo);
                                System.out.print("Ingrese el color del vehiculo del automovil: ");
                                Color color = JColorChooser.showDialog(null, "Elegir el color del vehiculo", Color.yellow);
                                ((Automovil) vehiculos.get(i)).setColor(color);
                                System.out.println();
                                System.out.print("Ingrese el anio del automovil: ");
                                int anio = leer.nextInt();
                                Date fecha_anio = new Date();
                                fecha_anio.setYear(anio);
                                ((Automovil) vehiculos.get(i)).setAnio(fecha_anio);
                                System.out.print("Ingrese el tipo de combustible: ");
                                String tipo_combustible = leer.next();
                                leer.nextLine();
                                if (tipo_combustible.equalsIgnoreCase("diesel") || tipo_combustible.equalsIgnoreCase("regular") || tipo_combustible.equalsIgnoreCase("super")) {
                                    combustible = true;
                                } else {
                                    combustible = false;
                                }

                                if (combustible == false) {
                                    System.out.println("Su combustible solo puede ser diesel, regular o super");
                                    tipo_combustible = leer.next();
                                }
                                ((Automovil) vehiculos.get(i)).setTipo_combustible(tipo_combustible);
                                System.out.print("Ingrese el numero de puertas del automovil:");
                                int num_puertas = leer.nextInt();

                                if (num_puertas <= 0) {
                                    System.out.println("Sus puertas no pueden ser menor a 0");
                                    num_puertas = leer.nextInt();
                                }
                                ((Automovil) vehiculos.get(i)).setNum_puertas(num_puertas);
                                System.out.print("Ingrese la transmision del automovil: ");
                                String transmision = leer.next();
                                leer.nextLine();
                                ((Automovil) vehiculos.get(i)).setTransmision(transmision);
                                System.out.print("Ingrese el numero de asientos del automovil: ");
                                int num_asientos = leer.nextInt();
                                if (num_asientos <= 0) {
                                    System.out.println("Sus asientos no pueden ser menor a 0");
                                    num_asientos = leer.nextInt();
                                }
                                ((Automovil) vehiculos.get(i)).setNum_asientos(num_asientos);
                                System.out.println("Automovil agregado!");

                            } else if (vehiculos.get(i) instanceof Motocicleta) {

                            }

                        }
                    }

                    break;
                }
                case 5:
                    break;

                case 6:
                    System.out.println(" Lista de sus Vehiculos");

                    for (int i = 0; i < vehiculos.size(); i++) {

                        if (vehiculos.get(i) instanceof Automovil) {

                            System.out.println((i + 1) + "-" + vehiculos.get(i).toString());
                        }

                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Debe de ingresar de las opciones dadas");
                    break;
            }//Fin del switch
        }//Fin del while
    }//Fin del main

    public static void ImprimirVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {

            System.out.println(vehiculos.get(i));
        }

    }//Fin del metodo ImprimirVehiculos

    public static boolean Placa(String placa, ArrayList<Vehiculo> vehiculos, char cha) {

        int cont_numeros = 0;
        int cont_letras = 0;
        while (placa.length() < 7) {
            System.out.print("Su placa debe tener 7 caracterese por lo menos");
            placa = leer.next();
        }
        for (int k = 0; k < placa.length(); k++) {

            int codigoasci = (char) placa.charAt(k);

            if ((codigoasci >= 97 && codigoasci <= 122) || (codigoasci >= 65 && codigoasci <= 90)) {
                cont_letras++;
            } else if ((codigoasci >= 48 && codigoasci <= 57)) {
                cont_numeros++;
            }
        }

        boolean repetido = false;
        for (int i = 0; i < vehiculos.size(); i++) {
            if (placa.equalsIgnoreCase(vehiculos.get(i).getNum_placa()) == true) {
                repetido = true;
            }

        }

        if (placa.length() == 7 && (cont_numeros == 4) && (cont_letras == 3) && (repetido == false) && placa.charAt(0) == cha) {

            return true;

        } else {

            System.out.println("Placa invalida");
            return false;
        }

    }

}//Fin de la clase

