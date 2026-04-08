package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 76 – Números Aleatórios

Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.
*/

import java.util.Random;

public class Ex76_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetor = new int[7];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(10);
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

    }
}