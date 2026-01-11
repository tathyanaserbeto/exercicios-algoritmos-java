package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 21 – Ano Bissexto

Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
*/

import java.util.Scanner;

public class Ex21_AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        /*
        Um ano é bissexto se ele for divisível por 400
        OU ele for divisível por 4, mas não por 100
        */

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.printf("%d é um ano bissexto.", ano);
        } else {
            System.out.printf("%d NÃO é um ano bissexto.", ano);
        }


    }
}
