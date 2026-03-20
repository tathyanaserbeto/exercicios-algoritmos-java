package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 52 – Estatísticas de Idade

Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
*/

import java.util.Scanner;

public class Ex52_EstatisticasIdade10Pessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        double somaIdade = 0;
        double mediaIdade;
        int mais18 = 0;
        int menos5 = 0;
        int maiorIdade = 0;

        int i = 1;
        while (i <= 10) {
            System.out.println("Qual é a idade da pessoa " + i + ": ");
            idade = scanner.nextInt();

            somaIdade = somaIdade + idade;

            if (idade > 18) {
                mais18++;
            }

            if (idade < 5){
                menos5++;
            }

            if (i == 1){
                maiorIdade = idade;
            }

            if(idade > maiorIdade){
                maiorIdade = idade;
            }

            i++;
        }

        mediaIdade = somaIdade / 10;

        System.out.println("--------------------");
        System.out.println(">> A média de idade do grupo é: " + mediaIdade);
        System.out.println(">> " + mais18 + " pessoas tem mais de 18 anos");
        System.out.println(">> " + menos5 + " pessoas tem menos de 5 anos");
        System.out.println(">> A maior idade lida foi: " + maiorIdade);

    }
}