package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 71 – Preenchimento com 999

Faça um programa que preencha automaticamente um vetor numérico com 8 posições com o valor 999.
*/

import java.util.Arrays;

public class Ex71_Vetor999 {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        Arrays.fill(vetor,999);

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}