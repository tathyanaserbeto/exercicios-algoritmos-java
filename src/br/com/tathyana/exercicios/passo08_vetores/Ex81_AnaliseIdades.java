package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 81 – Análise de Idades

Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade
*/

import java.util.Scanner;

public class Ex81_AnaliseIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media;
        int soma = 0;
        int maiorIdade = 0;

        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Digite a %d idade: ", i + 1);
            int idade = scanner.nextInt();

            vetor[i] = idade;
            soma += vetor[i];

            if (vetor[i] > maiorIdade) {
                maiorIdade = vetor[i];
            }

        }

        System.out.println(" ");
        System.out.println("- Maior idade digitada: " + maiorIdade + " anos.");

        System.out.println("- Posições da maior idade: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == maiorIdade){
                System.out.println("Posição " + i);
            }
        }

        media = (double) soma / vetor.length;
        System.out.printf("- Média das idades: %.2f anos.%n", media);

        System.out.println("- Posições com pessoas acima de 25 anos: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > 25){
                System.out.println("Posição " + i + ": " + vetor[i] + " anos.");
            }
        }


    }
}
