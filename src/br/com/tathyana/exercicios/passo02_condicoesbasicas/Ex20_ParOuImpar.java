package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 20 – Par ou Impar

Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
*/

import java.util.Scanner;

public class Ex20_ParOuImpar {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número inteiro:");
        int num1 = scanner.nextInt();

        int restoDivisao = num1 % 2;

        if (restoDivisao == 0){
            System.out.printf("O número %d é par. %n", num1);
        } else {
            System.out.printf("O número %d é ímpar. %n", num1);
        }
    }
}
