package com.magicideas;

import java.util.Scanner;

public class MaxSalary {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de sueldos a ingresar: ");
        int N = scanner.nextInt();
        
        double sueldoMaximo = Double.MIN_VALUE; // Inicializamos al mínimo valor posible

        for (int i = 1; i <= N; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }

        System.out.println("El sueldo máximo es: " + sueldoMaximo);
    }
    
}
