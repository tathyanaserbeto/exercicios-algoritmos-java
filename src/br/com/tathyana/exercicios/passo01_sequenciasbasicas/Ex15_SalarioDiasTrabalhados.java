package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 15 – Salário por Dias Trabalhados

Descrição: Crie um programa que leia o número de dias trabalhados em um mês e mostre
o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha
R$25 por hora trabalhada.
*/

import java.util.Scanner;

public class Ex15_SalarioDiasTrabalhados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos dias você trabalhou esse mês?");
    int diasTrabalhados = scanner.nextInt();

    double horasTrabalhadas = diasTrabalhados * 8;
    double salario = horasTrabalhadas * 25;

    System.out.println("----------");
    System.out.printf("O seu salário esse mês será de R$ %.2f. Referente a %.0f horas trabalhadas.%n", salario, horasTrabalhadas);
    System.out.println("----------");

    }
}
