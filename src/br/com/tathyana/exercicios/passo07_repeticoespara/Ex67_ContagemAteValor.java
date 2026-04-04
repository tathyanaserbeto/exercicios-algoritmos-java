package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 67 – Contagem até número digitado

Leia um número inteiro positivo e mostre a contagem de 0 até ele.
*/

import java.util.Scanner;

public class Ex67_ContagemAteValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i ;

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (i = 0; i <= numero; i++) {
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");
    }
}