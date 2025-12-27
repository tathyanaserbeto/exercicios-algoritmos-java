package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 19 – Média e Aproveitamento

Descrição: Crie um programa que leia duas notas de um aluno, calcule a média
e mostre a situação do aluno, indicando se ele foi aprovado, está em recuperação
ou foi reprovado.
*/

import java.util.Scanner;

public class Ex19_MediaAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a sua nota na primeira avaliação?");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual foi a sua nota na segunda avaliação?");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        //Média abaixo de 5.0 → REPROVADO
        // Média entre 5.0 e 6.9 → RECUPERAÇÃO
        //Média 7.0 ou maior → APROVADO

        if (media < 5.0){
            System.out.printf("Sua média foi %.2f e você está reprovado!%n", media);
        } else if (media < 7.0){
            System.out.printf("Sua média foi %.2f e você está de recuperação!%n", media);
        } else {
            System.out.printf("Sua média foi %.2f e você está aprovado!%n", media);
        }
    }
}
