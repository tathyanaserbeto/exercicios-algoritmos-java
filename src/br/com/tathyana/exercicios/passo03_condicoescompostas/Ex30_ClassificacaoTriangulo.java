package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 30 – Classificação de Triângulo

Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes
*/

import java.util.Scanner;

public class Ex30_ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro segmento:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor do segundo segmento:");
        int b = scanner.nextInt();

        System.out.println("Digite o valor do terceiro segmento:");
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("É possível formar um triângulo!");

                if (a == b && b == c) {
                    System.out.println("O triângulo que será formado será EQUILÁTERO.");
                } else if ( a == b || b == c || a == c) {
                    System.out.println("O triângulo que será formado será ISÓSCELES.");
                } else {
                    System.out.println("O triângulo que será formado será ESCALENO.");
                }

        } else {
            System.out.println("Infelizmente, não é possível formar um triângulo.");
        }
    }
}
