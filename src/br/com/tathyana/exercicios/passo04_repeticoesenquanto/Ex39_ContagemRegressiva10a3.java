package br.com.tathyana.exercicios.passo04_repeticoesenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 39 – Contagem Regressiva de 10 a 3

Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
*/

public class Ex39_ContagemRegressiva10a3 {
    public static void main(String[] args) {

        for (int i = 10; i >= 3 ; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");
    }
}