package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 70 – Sequência de Fibonacci

Mostre os 10 primeiros termos da sequência:
1 1 2 3 5 8 13 21...
*/


public class Ex70_Fibonacci {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int proximo;
        int i;

        for (i = 1; i <= 10; i++){
            proximo = a + b;
            System.out.print(a + " ");
            a = b;
            b = proximo;
        }


    }
}