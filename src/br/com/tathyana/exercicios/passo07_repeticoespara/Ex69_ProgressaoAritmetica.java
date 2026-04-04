package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 69 – Progressão Aritmética

Leia o primeiro termo e a razão de uma PA.
Mostre os 10 primeiros termos e a soma deles.
*/

import java.util.Scanner;

public class Ex69_ProgressaoAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int soma = 0;

        System.out.println("Digite o primeiro termo:");
        int termo = scanner.nextInt();

        System.out.println("Digite a razão da PA:");
        int razao = scanner.nextInt();

        for (i = 0; i < 10; i++){
            System.out.print(termo + " ");
            soma = soma + termo;
            termo = termo + razao;
        }

        System.out.println("- A soma dos termos é: " + soma);

    }
}
