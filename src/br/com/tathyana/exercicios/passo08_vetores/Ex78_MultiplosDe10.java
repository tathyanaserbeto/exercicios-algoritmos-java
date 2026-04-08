package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 78 – Múltiplos de 10

Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.
*/

import java.util.Scanner;

public class Ex78_MultiplosDe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " número: ");
            int digitado = scanner.nextInt();

            numeros[i] = digitado;
        }

        for (int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.println();
        System.out.println("Múltiplos de 10 na posição: ");
        for(int i = 0; i < numeros.length; i++){

            if (numeros[i] % 10 == 0){
                System.out.print(i + " ");
            }

        }


    }
}