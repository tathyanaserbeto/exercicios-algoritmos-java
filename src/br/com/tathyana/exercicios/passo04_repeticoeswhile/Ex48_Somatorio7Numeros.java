package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 48 – Somatório de 7 Números

Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles.
*/

import java.util.Scanner;

public class Ex48_Somatorio7Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador <= 7){
            System.out.printf("Digite o %dº número: %n", contador);
            int numero = scanner.nextInt();

            soma += numero;
            contador ++;
        }

        System.out.println("A soma dos números é: " + soma);
    }
}