package br.com.tathyana.exercicios.passo06_repeticoesfacaenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 62 – Idades com Faça Enquanto

Leia a idade de várias pessoas.
Pergunte se deseja continuar.
No final mostre:
a) Quantidade de idades
b) Média das idades
c) Quantas pessoas têm 21 anos ou mais
*/

import java.util.Scanner;

public class Ex62_IdadesFacaEnquanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int quantidade = 0;
        double mediaIdade;
        int somaIdade = 0;
        int maior21 = 0;
        char continuar;

        do {
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();

            somaIdade += idade;
            quantidade++;

            if(idade >= 21) {
                maior21++;
            }

            System.out.println("Quer continuar? (S/N) ");
            continuar = scanner.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        mediaIdade = (double) somaIdade / quantidade;

        System.out.println("-----------------");

        if (quantidade == 1) {
            System.out.println("Foi registrada " + quantidade + " idade.");
        } else {
            System.out.println("Foram registradas " + quantidade + " idades.");
        }

        System.out.println("A média das idades é de " + mediaIdade);

        if (maior21 == 0) {
            System.out.println("Nenhuma pessoa tem mais de 21 anos.");
        } else {
            System.out.println(maior21 + " pessoas tem mais de 21 anos.");
        }

    }
}