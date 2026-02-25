package br.com.tathyana.exercicios.passo04_repeticoesenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 38 – Contagem Crescente de 6 a 11

Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou!
*/

public class Ex38_ContagemCrescente6a11 {
    public static void main(String[] args) {

        for (int i = 6; i <= 11 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");
    }
}