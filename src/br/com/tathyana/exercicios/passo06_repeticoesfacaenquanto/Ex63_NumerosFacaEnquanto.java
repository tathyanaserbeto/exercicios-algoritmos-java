package br.com.tathyana.exercicios.passo06_repeticoesfacaenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 63 – Números com Faça Enquanto

Leia vários números.
Pergunte se deseja continuar.
No final mostre:
a) Soma dos valores
b) Menor valor
c) Média
d) Quantos são pares
*/

import java.util.Scanner;

public class Ex63_NumerosFacaEnquanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        double media;
        int quantidade = 0;
        int pares = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            quantidade++;
            soma = soma + numero;

            if (numero < menorValor) {
                menorValor = numero;
            }

            if (numero % 2 == 0) {
                pares++;
            }

            System.out.println("Quer continuar? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        media = (double) soma / quantidade;

        System.out.println("--------------------------");
        System.out.println("A soma dos valores digitados é " + soma);
        System.out.println("O menor valor digitado foi " + menorValor);
        System.out.println("A média dos valores digitados é " + media);
        System.out.println("Dos números digitados, " + pares + " são pares");
    }
}
