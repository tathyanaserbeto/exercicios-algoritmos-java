package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 73 – Contagem Regressiva em Vetor

Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições com valores de 9 até 0.
*/

public class Ex73_ContagemRegressiva {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = 9 - i;
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}