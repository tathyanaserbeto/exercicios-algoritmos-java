package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 99

Faça um programa que possua uma função chamada Potencia(),
que vai receber dois parâmetros numéricos (base e expoente)
e vai calcular o resultado da exponenciação.
Ex: Potencia(5,2) vai calcular 5² = 25
*/

import java.util.Scanner;

public class Ex99_PotenciaFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base da potência: ");
        int base = scanner.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        int resultado = Potencia(base, expoente);
        System.out.println("Resultado de " + base + "^" + expoente + " = " + resultado);
    }

    public static int Potencia(int base, int expoente) {
        int potencia = 1;

        for (int i = 0; i < expoente; i++) {
            potencia *= base;
        }

        return potencia;
    }
}