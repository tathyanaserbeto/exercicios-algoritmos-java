package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 82 – Análise de Notas

Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece
*/

import java.util.Scanner;

public class Ex82_AnaliseNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media;
        int acimaMedia = 0;
        int soma = 0;
        int maiorNota = 0;
        int posicaoMaiorNota = 0;
        int[] vetorNotas = new int[10];

        for (int i = 0; i < vetorNotas.length; i++){
            System.out.printf("Digite a %d nota: ", i + 1);
            vetorNotas[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetorNotas.length; i++){

            if (vetorNotas[i] > maiorNota) {
                maiorNota = vetorNotas[i];
                posicaoMaiorNota = i;
            }

            soma += vetorNotas[i];

        }

        System.out.println(" ");
        media = (double) soma / vetorNotas.length;
        System.out.printf("A média da turma é %.2f.%n", media);

        for (int nota : vetorNotas){
            if (nota > media) {
                acimaMedia++;
            }
        }

        System.out.printf("%d alunos estão acima da média.%n", acimaMedia);
        System.out.printf("A maior nota digitada foi: %d.%n", maiorNota);
        System.out.printf("A maior nota aparece na posição %d.%n", posicaoMaiorNota);



    }
}