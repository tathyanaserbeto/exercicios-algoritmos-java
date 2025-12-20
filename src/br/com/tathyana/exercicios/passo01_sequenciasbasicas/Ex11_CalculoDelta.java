package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 11 – Cálculo do Delta

Descrição: Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
*/

import java.util.Scanner;

public class Ex11_CalculoDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor de A:");
    int valorA = scanner.nextInt();
    System.out.println("Digite o valor de B:");
    int valorB = scanner.nextInt();
    System.out.println("Digite o valor de C:");
    int valorC = scanner.nextInt();

    int delta = (valorB * valorB) - 4 * valorA * valorC;

    System.out.println("O valor de delta é: " + delta);

    }
}
