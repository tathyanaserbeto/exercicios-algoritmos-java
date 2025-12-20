package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 14 – Aluguel de Carro

Descrição: A locadora de carros precisa da sua ajuda para cobrar seus serviços.
Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
*/

import java.util.Scanner;

public class Ex14_AluguelCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos dias o carro foi alugado?");
        int diasAluguel = scanner.nextInt();
        System.out.println("Quantos Km foram percorridos?");
        double kmPercorridos = scanner.nextDouble();

        double valorDias = diasAluguel * 90;
        double valorKm = kmPercorridos * 0.20;
        double valorTotal = valorDias + valorKm;

        System.out.printf("O valor total que deverá ser pago é de R$ %.2f", valorTotal);

    }
}
