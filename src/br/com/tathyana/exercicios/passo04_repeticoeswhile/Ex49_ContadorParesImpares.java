package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 49 – Contagem de Pares e Ímpares

Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.
*/

import java.util.Scanner;

public class Ex49_ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int par = 0;
        int impar = 0;

        while (contador <= 6){
            System.out.printf("Digite o %dº número: ",contador);
            int numero = scanner.nextInt();

                if(numero % 2 == 0){
                    //par
                    par++;
                } else {
                    //impar
                    impar++;
                }

            contador ++;
        }

        System.out.println("--------------------------");
        System.out.printf("Você digitou %d números pares e %d números ímpares.%n",par, impar);
    }
}