package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 41 – Contagem Regressiva de 100 a 0 de 5 em 5

Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
*/

public class Ex41_ContagemRegressiva100a0De5Em5 {
    public static void main(String[] args) {

        int contador = 100;

        while (contador >=0) {
            System.out.print(contador + " ");
            contador -= 5;
        }

        System.out.println("Acabou!");
    }
}
