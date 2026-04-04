package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 66 – Tabuada com Para

Leia um número e mostre sua tabuada.
*/

import java.util.Scanner;

public class Ex66_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        double resultadoDiv;
        int resultado;

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de adição:");
       for (i = 1; i <=9; i++){
           resultado = numero + i;
           System.out.printf("%d + %d = %d %n", numero, i, resultado);
       }

        System.out.println("Tabuada de subtração:");
        for (i = 1; i <=9; i++){
            resultado = numero - i;
            System.out.printf("%d - %d = %d %n", numero, i, resultado);
        }

        System.out.println("Tabuada de multiplicação:");
        for (i = 1; i <=9; i++){
            resultado = numero * i;
            System.out.printf("%d x %d = %d %n", numero, i, resultado);
        }

        System.out.println("Tabuada de divisão:");
        for (i = 1; i <=9; i++){
            resultadoDiv = (double) numero / i;
            System.out.printf("%d / %d = %.2f %n", numero, i, resultadoDiv);
        }

    }
}