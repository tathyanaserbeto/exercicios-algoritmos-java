package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 07 – Dobro e Terça Parte

Descrição: Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
*/

import java.util.Scanner;

public class Ex07_DobroETercaParte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double terca = numero / 3;

        System.out.println("----------");
        System.out.printf("O dobro de %.2f é %.2f e a terça parte é %.2f. %n", numero, dobro, terca);
        System.out.println("----------");

    }
}
