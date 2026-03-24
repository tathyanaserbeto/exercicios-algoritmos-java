package br.com.tathyana.exercicios.passo05_whilecomsentinela;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 58

Faça um algoritmo que leia a idade de vários alunos de uma turma.
O programa vai parar quando for digitada a idade 999.
No final, mostre quantos alunos existem na turma e qual é a média de idade do grupo.
*/

import java.util.Scanner;

public class Ex58_MediaIdadeTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double somaIdade = 0;
        double mediaIdade;
        int numeroAlunos = 0;

        System.out.println("Qual é a idade do aluno?");
        idade = scanner.nextInt();

        while (idade != 999){
            somaIdade = somaIdade + idade;
            numeroAlunos++;

            System.out.println("Qual é a idade do próximo aluno?");
            idade = scanner.nextInt();
        }

        if (numeroAlunos > 0) {
            mediaIdade = somaIdade / numeroAlunos;

            System.out.printf("Existem %d alunos na turma.%n", numeroAlunos);
            System.out.printf("A média da idade dos alunos é %.2f.%n", mediaIdade);
        } else {
            System.out.println("Nenhum aluno foi informado.");
        }

    }
}