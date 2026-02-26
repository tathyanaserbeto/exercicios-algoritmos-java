package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 47 – Soma Regressiva de 500 até 0

Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
*/

public class Ex47_SomaRegressiva500a0De50Em50 {
    public static void main(String[] args) {

        int numero = 500;
        int soma = 0;

        while (numero >= 0){
            soma += numero;

            numero -= 50;
        }

        System.out.println(soma);
    }
}