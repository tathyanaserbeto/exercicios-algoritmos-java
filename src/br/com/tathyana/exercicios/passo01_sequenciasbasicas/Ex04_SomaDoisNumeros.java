package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
 Curso: Algoritmos – Gustavo Guanabara
 Exercício 04 – Soma de dois números

  Descrição: Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
 */

import java.util.Scanner;

public class Ex04_SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = (num1 + num2);

        System.out.println("----------");
        System.out.printf("A soma entre %d e %d é igual a %d.%n", num1, num2, soma);
        System.out.println("----------");
    }
}