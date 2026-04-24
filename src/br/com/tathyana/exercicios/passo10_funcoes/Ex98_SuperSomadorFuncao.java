package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 98

Crie um programa que tenha uma função SuperSomador(),
que vai receber dois números como parâmetro e depois vai retornar a soma de todos
os valores no intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
*/

import java.util.Scanner;

public class Ex98_SuperSomadorFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resultado = SuperSomador(a,b);
        System.out.println("O resultado da super soma é: " + resultado);
    }

    public static int SuperSomador(int a, int b) {
        int soma = 0;

        if (a < b) {
            for (int i = a; i <= b; i++){
                soma += i;
            }
        } else {
            for (int i = b; i <= a; i++){
                soma += i;
            }
        }

        return soma;
    }
}