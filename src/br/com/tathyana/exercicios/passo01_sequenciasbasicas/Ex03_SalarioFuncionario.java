package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
 Curso: Algoritmos – Gustavo Guanabara
 Exercício 03 – Salário dos funcionários

  Descrição: Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
 */

import java.util.Scanner;

public class Ex03_SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Qual é o salário atual do funcionário(a)?");
        int salario = scanner.nextInt();

        System.out.printf("O(a) funcionário(a) %s tem um salário de R$ %d.", nome, salario);

    }

}
