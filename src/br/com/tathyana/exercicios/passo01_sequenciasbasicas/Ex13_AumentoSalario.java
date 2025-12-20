package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 13 – Aumento de Salário

Descrição: Faça um algoritmo que leia o salário de um funcionário, calcule e mostre
o seu novo salário, com 15% de aumento.
*/

import java.util.Scanner;

public class Ex13_AumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu salário em R$?");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.printf("O seu novo salário, com 15%% de aumento, será: R$ %.2f", novoSalario);

    }
}
