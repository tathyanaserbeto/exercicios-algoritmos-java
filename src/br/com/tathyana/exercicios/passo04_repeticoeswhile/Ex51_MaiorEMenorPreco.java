package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 51 – Maior e Menor Preço

Faça um aplicativo que leia o preço de 8 produtos.
No final, mostre na tela qual foi o maior e qual foi o menor preço digitados.
*/

import java.util.Scanner;

public class Ex51_MaiorEMenorPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o preço do produto " + i + ": ");
            preco = scanner.nextDouble();

            if (i == 1) {
                maior = preco;
                menor = preco;
            }

            if (preco > maior) {
                maior = preco;
            } else {
                menor = preco;
            }

        }

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

    }
}