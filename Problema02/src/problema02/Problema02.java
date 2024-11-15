/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String lugar = "Buena via";
        String nombre;
        String tipo;
        double costo;
        double porcentaje;
        double peaje = 0;
        boolean tipoValido = true;

        System.out.println("Ingrese su nombre y apellido");
        nombre = entrada.nextLine();
        System.out.println("Ingrese tipo de vehiculo");
        tipo = entrada.nextLine();
        System.out.println("Ingrese avaluo del vehiculo");
        costo = entrada.nextDouble();

        tipo = tipo.toLowerCase();

        switch (tipo) {
            case "vehículo liviano particular":
            case "vehículo liviano":
            case "liviano":
            case "1":
                tipo = "vehículo liviano particular";
                porcentaje = (costo * 0.01) / 100;
                peaje = porcentaje + 2;
                break;

            case "vehículo grande particular":
            case "vehículo grande":
            case "grande":
            case "2":
                tipo = "vehículo grande particular";
                porcentaje = (costo * 0.02) / 100;
                peaje = porcentaje + 2.5;
                break;

            case "taxi":
            case "vehículo taxi":
            case "3":
                tipo = "taxi";
                porcentaje = (costo * 0.04) / 100;
                peaje = porcentaje + 1.5;
                break;

            case "bus urbano":
            case "bus":
            case "vehículo bus":
            case "4":
                tipo = "bus urbano";
                porcentaje = (costo * 0.05) / 100;
                peaje = porcentaje + 2.2;
                break;

            default:
                tipoValido = false;

                System.out.printf("Tipo de vehículo no válido.\nTipos válidos:\n"
                        + "1. Vehículo liviano particular\n"
                        + "   - Vehículo liviano\n"
                        + "   - Liviano\n"
                        + "2. Vehículo grande particular\n"
                        + "   - Vehículo grande\n"
                        + "   - Grande\n"
                        + "3. Taxi\n"
                        + "   - Vehículo taxi\n"
                        + "4. Bus urbano\n"
                        + "   - Bus\n"
                        + "   - Vehículo bus\n");
        }
        if (tipoValido == true) {
            System.out.printf("Peaje: %s\n\t"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n\t"
                    + "Valor: %.2f\n\t"
                    + "Peaje: %.2f\n", lugar, nombre, tipo, costo, peaje);
        }

    }
}
