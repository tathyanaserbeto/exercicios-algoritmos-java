package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 92

Crie uma lógica que leia um número inteiro e passe para um procedimento ParOuImpar()
que vai verificar e mostrar na tela se o valor passado como parâmetro é PAR ou ÍMPAR.
*/

import java.util.Scanner;

public class Ex92_ParImparProcedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        int numero = scanner.nextInt();

        ParOuImpar(numero);
    }

    public static void ParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.printf("O número %d é par.%n", numero);
        } else {
            System.out.printf("O número %d é ímpar.%n", numero);
        }
    }
}