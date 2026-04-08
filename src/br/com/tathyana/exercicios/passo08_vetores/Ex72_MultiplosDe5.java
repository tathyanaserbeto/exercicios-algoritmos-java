package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 72 – Múltiplos de 5

Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições com valores: 5, 10, 15...45, 50.
*/

public class Ex72_MultiplosDe5 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (i + 1) * 5;
            System.out.println("Posição " + i + ": " + vetor[i]);
        }



    }
}
