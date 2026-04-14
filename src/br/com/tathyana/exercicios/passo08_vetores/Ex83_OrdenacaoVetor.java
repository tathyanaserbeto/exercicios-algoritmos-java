package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 83 – Ordenação de Vetor

Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.
*/

import java.util.Arrays;
import java.util.Random;

public class Ex83_OrdenacaoVetor {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vetores = new int[20];

        for (int i = 0; i < vetores.length; i++){
            vetores[i] = random.nextInt(100);
        }

        System.out.println("Vetor: ");
        for (int valores : vetores){
            System.out.print(valores + " ");
        }

        System.out.println("\n\nVetor ordenado: ");
        Arrays.sort(vetores);
        for (int valores : vetores){
            System.out.print(valores + " ");
        }

    }
}