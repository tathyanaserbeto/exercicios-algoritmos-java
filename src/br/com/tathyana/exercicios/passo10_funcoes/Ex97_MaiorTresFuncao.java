package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 97

Refaça o exercício 91, só que agora em forma de função Maior(),
mas faça uma adaptação que vai receber TRÊS números como parâmetro
e vai retornar qual foi o maior entre eles.
*/

import java.util.Scanner;

public class Ex97_MaiorTresFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int c = scanner.nextInt();

        int resultado = Maior(a,b,c);
        System.out.println("O maior número é: " + resultado);

    }

    public static int Maior(int a, int b, int c) {
            int maior = a;

            if (b > maior) {
                maior = b;
            }

            if (c > maior) {
                maior = c;
            }

            return maior;
    }
}