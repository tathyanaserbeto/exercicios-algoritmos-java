package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 84 – Pessoas Menores de Idade

Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade.
*/

import java.util.Scanner;

public class Ex84_MenoresDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[9];
        int[] idades = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.printf("Digite o %d nome: %n", i+1);
            nomes[i] = scanner.nextLine();

            System.out.println("Digite a idade: ");
            idades[i] = scanner.nextInt();

            scanner.nextLine();
        }

        System.out.println("\nMenores de idade:");
        for (int i = 0; i < 9; i++) {
            if (idades[i] < 18) {
                System.out.println(nomes[i] + " - " + idades[i] + " anos");
            }
        }

    }
}