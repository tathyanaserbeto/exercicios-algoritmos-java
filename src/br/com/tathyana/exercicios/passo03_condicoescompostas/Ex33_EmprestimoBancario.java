package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 33 – Empréstimo Bancário

Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
*/

import java.util.Scanner;

public class Ex33_EmprestimoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ EMPRESTIMO BANCÁRIO ------");
        System.out.println("Qual é o valor da casa?");
        double valorCasa = scanner.nextDouble();

        System.out.println("Qual o seu salário?");
        double salario = scanner.nextDouble();

        System.out.println("Em quantos anos você pretende quitar a casa?");
        double tempoPagamento = scanner.nextDouble();

        double prestacaoMensal = valorCasa / (tempoPagamento * 12);

        if (prestacaoMensal > (salario * 0.30)) {
            System.out.println("Empréstimo Negado!");
        } else {
            System.out.println("Emprestimo Aprovado!");
        }
    }
}
