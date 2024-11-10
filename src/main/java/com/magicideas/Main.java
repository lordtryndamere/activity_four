package com.magicideas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // square
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       calculateSquare(num);
       randomNumber();
       sc.close();
       System.out.println(productNotEvenNumbers());
       System.out.println(calculateFactorial(num));
        avgAndCountNumbers();
        multiplyTableNumber(5);



    }
    //1

    public static void calculateSquare(int number) {
        if (number == 0 || number == -1) return;
        int square = number * number;
        System.out.println("El cuadrado de " + number + " es: " + square);

    }
    //2

    public static void randomNumber() {
        int secretNum = (int) (Math.random() * 100);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num < secretNum) System.out.println("El numerero secreto es mayor. Intenta de nuevo");
            else if (num > secretNum) System.out.println("El numerero secreto es mayor. Intenta de nuevo");
            else {
                System.out.println("¡Felicidades! Adivinaste el número. El numerero secreto es: " + secretNum);
                sc.close();
                break;
            }
        }
    }

    //3
    public static int productNotEvenNumbers() {
        int produt = 1;
        int counter = 0;

        for (int numero = 1; counter < 10; numero += 2) {
            produt *= numero;
            counter++;
        }

        return produt;
    }

    //4
    public static long calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Invalid number");
        }

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
    // 5
    //    Pedir 10 números. Mostrar la media de los números positivos, la media de
    //    los números negativos y la cantidad de ceros.

    public static void avgAndCountNumbers() throws IOException {
        List<Integer> numbers;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            numbers = new ArrayList<>();
            int limit = 9;
            System.out.println("Write ten numbers: ");
            while (numbers.size() <= limit) {
                
                numbers.add(Integer.valueOf(bufferedReader.readLine()));
            }
        }
        int positivesCounter = 0;
        int negativesCounter = 0;
        int zerosCounter = 0;


        for (Integer number : numbers) {
            if (number >= 0) positivesCounter += number;
            if (number < 0) negativesCounter += number;
            if (number == 0) zerosCounter += number;
        }

        System.out.println("NumbersSize" + numbers.size());
        System.out.println("AVGPositives: " + (double) positivesCounter / numbers.size());
        System.out.println("AVGNegatives: " + (double) negativesCounter / numbers.size());
        System.out.println("QuantityOfZeros: " + zerosCounter);

    }
//6. Pide un número (que debe estar entre 0 y 10) y muestra la tabla de
//    multiplicar de dicho número

    public static void multiplyTableNumber(int number) {
        
        if (number < 0 || number > 10) throw new IllegalArgumentException("Number must be beetwen 0 and 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }


    }

    //SpecialCounter

    public static void specialCounter() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            String contador = String.valueOf(i) + "-" +
                                              String.valueOf(j) + "-" +
                                              String.valueOf(k) + "-" +
                                              String.valueOf(l) + "-" +
                                              String.valueOf(m);

                            // Reemplazamos los 3s con E
                            contador = contador.replace("3", "E");

                            System.out.println(contador);
                        }
                    }
                }
            }
        }
    }


}