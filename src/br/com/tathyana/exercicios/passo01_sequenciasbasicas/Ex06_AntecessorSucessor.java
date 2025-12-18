package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 06 – Antecessor e Sucessor

Descrição: Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
*/

import java.util.Scanner;

public class Ex06_AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        int antecessor = (num - 1);
        int sucessor = (num + 1);

        System.out.println("----------");
        System.out.printf("O número escolhido foi: %d %n", num);
        System.out.printf("O antecessor do número %d é %d e o sucessor é %d. %n", num, antecessor, sucessor);
        System.out.println("----------");

    }
}
