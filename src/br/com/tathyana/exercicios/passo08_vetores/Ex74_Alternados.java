package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 74 – Valores Alternados

Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições com valores alternados: 5 e 3.
*/

public class Ex74_Alternados {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for ( int i = 0; i < vetor.length; i++){
            if (i % 2 == 0) {
                vetor[i] = 5;
            } else {
                vetor[i] = 3;
            }

            System.out.println("Posição " + i + ": " + vetor[i]);
        }

    }
}