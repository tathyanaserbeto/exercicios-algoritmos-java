package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 75 – Sequência de Fibonacci

Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
*/

public class Ex75_Fibonacci {
    public static void main(String[] args) {

        int[] vetor = new int[15];

        vetor[0] = 1;
        vetor[1] = 1;

        for (int i = 2; i < vetor.length; i++){
            vetor[i] = vetor[i-1] + vetor[i-2];
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Posição " + i + ": " + vetor[i]);
        }


    }
}