package br.com.tathyana.exercicios.passo05_whilecomsentinela;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 56 – Somatório com sentinela

Crie um programa que leia vários números pelo teclado e mostre no final o somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
*/

import java.util.Scanner;

public class Ex56_SomatorioComSentinela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite os números para saber qual o somatório.");
        System.out.println("Obs: Para finalizar digite o número 1111.");
        System.out.println("------------------------------------------");
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero != 1111) {
            soma = soma + numero;

            System.out.print("Digite outro número: ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
