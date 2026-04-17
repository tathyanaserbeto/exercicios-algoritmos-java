package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 90

Desenvolva um algoritmo que leia dois valores pelo teclado
e passe esses valores para um procedimento Somador()
que vai calcular e mostrar a soma entre eles.
*/

import java.util.Scanner;

public class Ex90_SomadorProcedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        somador(a, b);
    }

    public static void somador(int a, int b) {
        System.out.print("\nA soma entre " + a + " e " + b + " é " + (a + b));
    }
}