package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 91

Desenvolva um algoritmo que leia dois valores pelo teclado
e passe esses valores para um procedimento Maior() que vai verificar
qual deles é o maior e mostrá-lo na tela.
Caso os dois valores sejam iguais, mostrar uma mensagem informando essa característica.
*/

import java.util.Scanner;

public class Ex91_MaiorProcedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        Maior(a,b);
    }

    public static void Maior(int a, int b) {
        if (a > b) {
            System.out.printf("O número %d é maior.", a);
        } else if (a < b) {
            System.out.printf("O número %d é maior.", b);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
