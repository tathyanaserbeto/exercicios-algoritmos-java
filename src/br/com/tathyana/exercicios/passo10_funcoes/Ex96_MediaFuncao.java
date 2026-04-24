package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 96

Crie um programa que tenha uma função Media(), que vai receber as 2 notas de um aluno
e retornar a sua média para o programa principal.
*/


import java.util.Scanner;

public class Ex96_MediaFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextInt();

        double media = Media(n1, n2);
        System.out.println("A média das notas é: " + media);
    }

    public static double Media(double n1, double n2) {
        return (n1 + n2) /2;
    }
}