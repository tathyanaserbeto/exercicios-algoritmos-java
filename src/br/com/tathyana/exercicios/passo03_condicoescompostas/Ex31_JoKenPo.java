package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 31 – JoKenPo

Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
*/

import java.util.Scanner;
import java.util.Random;

public class Ex31_JoKenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int sorteio = random.nextInt(3);

        System.out.println("Qual é a sua escolha? Pedra, Papel ou Tesoura?");
        String jogador = scanner.next().toLowerCase();

        if (!jogador.equals("pedra") && !jogador.equals("papel") && !jogador.equals("tesoura")) {
            System.out.println("Jogada inválida!");
            return;
        }

        String computador;

        if (sorteio == 0){
            computador = "pedra";
        } else if (sorteio == 1){
            computador = "papel";
        } else {
            computador = "tesoura";
        }

        System.out.println("Sua escolha foi: " + jogador);
        System.out.println("O jogador 2 escolheu: " + computador);
        System.out.println("--------------------");

        switch (jogador){
            case "pedra":
                if (computador.equals("tesoura")) {
                    System.out.println("Você ganhou! :)");
                } else if (computador.equals("papel")) {
                    System.out.println("Você perdeu! :(");
                } else {
                    System.out.println("Empatou!");
                }
                break;

            case "papel":
                if (computador.equals("pedra")) {
                    System.out.println("Você ganhou! :)");
                } else if (computador.equals("tesoura")) {
                    System.out.println("Você perdeu! :(");
                } else {
                    System.out.println("Empatou!");
                }
                break;

            case "tesoura":
                if (computador.equals("papel")) {
                    System.out.println("Você ganhou! :)");
                } else if (computador.equals("pedra")) {
                    System.out.println("Você perdeu! :(");
                } else {
                    System.out.println("Empatou!");
                }
                break;

            default:
                System.out.println("Jogo Inválido!");
                break;
        }


    }
}
