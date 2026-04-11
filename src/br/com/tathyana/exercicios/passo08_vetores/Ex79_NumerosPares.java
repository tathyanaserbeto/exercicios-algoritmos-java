package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 79 – Números Pares

Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados.
*/

import java.util.Scanner;

public class Ex79_NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %d número inteiro: ", i+1);
            int digitado = scanner.nextInt();

            numeros[i]= digitado;
        }

        for(int i = 0; i < numeros.length; i++){

            if (numeros[i] % 2 == 0){
                System.out.println("O número " + numeros[i] + " é um número par e está na posição " + i);
            } 


        }

    }
}