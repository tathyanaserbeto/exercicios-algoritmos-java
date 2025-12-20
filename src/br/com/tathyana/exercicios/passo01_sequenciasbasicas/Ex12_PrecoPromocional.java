package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 12 – Preço Promocional

Descrição: Crie um programa que leia o preço de um produto, calcule e mostre o seu
preço promocional, com 5% de desconto.
*/

import java.util.Scanner;

public class Ex12_PrecoPromocional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o preço do produto?");
        double precoProduto = scanner.nextDouble();

        double desconto = precoProduto * 0.05;
        double precoFinal = precoProduto - desconto;

        System.out.printf("O valor promocional do produto é R$ %.2f", precoFinal);

    }
}
