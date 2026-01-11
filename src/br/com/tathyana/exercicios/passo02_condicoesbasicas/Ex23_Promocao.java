package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 23 – Promoção

Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto
*/

import java.util.Scanner;

public class Ex23_Promocao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "!");

        System.out.println("Qual o seu sexo? (F/M)");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Qual o valor da sua compra?");
        double valorCompra = scanner.nextDouble();

        double desconto;
        double valorFinal;

        if (sexo == 'M') {
            desconto = valorCompra * 0.05;
        } else if (sexo == 'F') {
            desconto = valorCompra * 0.13;
        } else {
            System.out.println("Sexo inválido.");
            return;
        }

        valorFinal = valorCompra - desconto;

        System.out.println("----------");
        System.out.printf("O valor final da sua compra com desconto é R$ %.2f.%n", valorFinal);
        System.out.println("----------");

    }
}
