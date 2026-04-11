package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 80 – Busca de Valor

Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada.
*/

import java.util.Random;
import java.util.Scanner;

public class Ex80_BuscaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int contador = 0;
        int[] vetor = new int[30];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(15) + 1;
        }

        System.out.println("Digite um número entre 1 e 15: ");
        int chave = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++){

            if (vetor[i] == chave) {
                System.out.println("O número " + chave + " foi encontrado na posição " + i);
                contador++;
            }

        }

        System.out.println("O número foi encontrado " + contador + " vezes.");


    }
}