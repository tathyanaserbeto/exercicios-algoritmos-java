package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 09 – Conversão de Moeda

Descrição: Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
*/

import java.util.Scanner;

public class Ex09_ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos reais você tem na carteira?");
        double reais = scanner.nextDouble();

        double dolar = reais / 3.45;

        System.out.println("----------");
        System.out.printf("O valor corresponde a US$ %.2f! %n", dolar);
        System.out.println("----------");

    }
}
