package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 39 – Contagem Regressiva de 10 a 3

Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
*/

public class Ex39_ContagemRegressiva10a3 {
    public static void main(String[] args) {

        int contador = 10;

        while (contador >= 3){
            System.out.print(contador + " ");
            contador--;
        }

        System.out.println("Acabou!");
    }
}