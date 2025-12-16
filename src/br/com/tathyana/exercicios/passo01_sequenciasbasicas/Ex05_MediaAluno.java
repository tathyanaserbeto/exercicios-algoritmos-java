package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
 Curso: Algoritmos – Gustavo Guanabara
 Exercício 05 – Média dos alunos

  Descrição: Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
 */

import java.util.Scanner;

public class Ex05_MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a sua primeira nota?");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual foi a sua segunda nota?");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("----------");
        System.out.printf("A sua média final foi %.1f. %n", media);
        System.out.println("----------");

    }
}
