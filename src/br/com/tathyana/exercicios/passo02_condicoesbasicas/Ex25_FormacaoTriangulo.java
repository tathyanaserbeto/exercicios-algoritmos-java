package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 25 – Formação de Triângulo

Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
*/

import java.util.Scanner;

public class Ex25_FormacaoTriangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro segmento:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo segmento:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o valor do terceiro segmento:");
        int valor3 = scanner.nextInt();

        if (valor1 < valor2 + valor3 && valor2 < valor1 + valor3 && valor3 < valor1 + valor2) {
            System.out.println("É possível formar um triângulo!");
        } else {
            System.out.println("Infelizmente, não é possível formar um triângulo.");
        }
    }
}
