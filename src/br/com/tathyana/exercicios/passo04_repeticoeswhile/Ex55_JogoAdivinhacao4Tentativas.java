package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 55 – Jogo de Adivinhação com 4 Tentativas

[DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32.
A partir de agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex55_JogoAdivinhacao4Tentativas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean acertou = false;

        int sorteio = random.nextInt(1,10);
        System.out.println("Descubra qual o número sorteado entre 1 a 10");

        for (int i = 1; i <= 4; i++){
            System.out.println("Tentativa " + i + "/4: ");
            int tentativaJogador = scanner.nextInt();

            if (sorteio == tentativaJogador) {
                System.out.println("Você acertou!");
                acertou = true;
                break;
            } else {
                if (i < 4) {
                    System.out.println("Você errou! Tente novamente.");
                }
            }

        }

        if (!acertou) {
            System.out.println("Você perdeu! O número era: " + sorteio);
        }

    }
}