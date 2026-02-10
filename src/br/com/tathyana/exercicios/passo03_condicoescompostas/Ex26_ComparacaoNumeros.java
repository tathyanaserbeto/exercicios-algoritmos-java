package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 26 – Comparação de Números

Escreva um algoritmo que leia dois números inteiros e compare-os,
mostrando na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais

*/

import java.util.Scanner;

public class Ex26_ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Escreva outro número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("O número %d é maior que o número %d.%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("O número %d é maior que o número %d.%n", num2, num1);
        } else {
            System.out.println("Não existe valor maior, os dois são iguais");
        }
    }
}
