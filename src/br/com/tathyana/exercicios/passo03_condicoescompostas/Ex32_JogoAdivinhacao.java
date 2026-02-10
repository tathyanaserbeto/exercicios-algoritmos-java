package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 32 – Jogo de Adivinhação

Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
*/

import java.util.Scanner;
import java.util.Random;

public class Ex32_JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int sorteio = random.nextInt(1,5);

        System.out.println("Descubra qual o número sorteado de 1 a 5:");
        int jogador = scanner.nextInt();

        System.out.println("O número sorteado foi: " + sorteio);

        if (sorteio == jogador) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou! Tente novamente.");
        }

    }
}
