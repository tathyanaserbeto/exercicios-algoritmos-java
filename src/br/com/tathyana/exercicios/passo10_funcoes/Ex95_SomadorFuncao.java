package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 95

Refaça o exercício 90, só que agora em forma de função Somador(),
que vai receber dois parâmetros e vai retornar o resultado da soma entre
eles para o programa principal.
*/

import java.util.Scanner;

public class Ex95_SomadorFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();

        int resultado = Somador(a, b);
        System.out.println("A soma é: " + resultado);
    }

    public static int Somador(int a, int b) {
        return a + b;
    }
}