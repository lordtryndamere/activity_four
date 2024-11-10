package com.magicideas;

import java.util.Scanner;

public class Recipes {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double facturacionTotal = 0;
        int litrosArticulo1 = 0;
        int facturasMayor600 = 0;
        int numeroFacturas = 5; // Procesamos 5 facturas

        for (int i = 1; i <= numeroFacturas; i++) {
            System.out.print("Introduce el código del artículo: ");
            int codigoArticulo = scanner.nextInt();
            
            System.out.print("Introduce la cantidad vendida en litros: ");
            int cantidadLitros = scanner.nextInt();
            
            System.out.print("Introduce el precio por litro: ");
            double precioPorLitro = scanner.nextDouble();

            // Calculamos el total de la factura
            double totalFactura = cantidadLitros * precioPorLitro;
            facturacionTotal += totalFactura;

            // Verificamos si es el artículo 1
            if (codigoArticulo == 1) {
                litrosArticulo1 += cantidadLitros;
            }

            // Contamos facturas de más de 600
            if (totalFactura > 600) {
                facturasMayor600++;
            }
        }

        System.out.println("Facturación total: " + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: " + litrosArticulo1);
        System.out.println("Cantidad de facturas de más de 600: " + facturasMayor600);
    }
    
}
