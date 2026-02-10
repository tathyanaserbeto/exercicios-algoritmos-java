package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 27 – Média dos Alunos

Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO

*/

import java.util.Scanner;

public class Ex27_MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a sua primeira nota? ");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual foi a sua segunda nota?");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media <= 4.9){
            System.out.println("Você está REPROVADO!");
        } else if (media >= 7) {
            System.out.println("Você está APROVADO!");
        } else {
            System.out.println("Você está de RECUPERAÇÃO!");
        }
    }
}
