package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 36 – Programa Vida Saudável

Um programa de vida saudável quer dar pontos para atividades físicas que podem
ser trocados por dinheiro.

O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- Até 10h no mês: ganha 2 pontos por hora
- De 10h até 20h no mês: ganha 5 pontos por hora
- Acima de 20h no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05

Faça um programa que leia quantas horas de atividade uma pessoa teve no mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro conseguiu ganhar.
*/


import java.util.Scanner;

public class Ex36_VidaSaudavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas de atividade física você fez esse mês?");
        double horasAtividade = scanner.nextDouble();

        double pontos = 0;

        if (horasAtividade <= 10) {
            pontos = 2 * horasAtividade;

        } else if (horasAtividade <= 20) {
            pontos = 5 * horasAtividade;

        } else {
            pontos = 10 * horasAtividade;
        }

        double valorFaturado = pontos * 0.05;

        System.out.printf("Você realizou %.1f horas de atividade.%n" +
                        "Total de pontos: %.1f%n" +
                        "Valor faturado: R$ %.2f%n",
                horasAtividade, pontos, valorFaturado);

    }
}
