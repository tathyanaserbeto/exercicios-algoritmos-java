package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 46 – Soma de 6 até 100 de 2 em 2

Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
*/


public class Ex46_SomaParesDe6a100 {
    public static void main(String[] args) {

        int numero = 6;
        int soma = 0;

        while (numero <= 100){
            soma += numero;

            numero += 2;
        }

        System.out.println("A soma de 6 até 100 de 2 em 2 é: " + soma);
    }
}