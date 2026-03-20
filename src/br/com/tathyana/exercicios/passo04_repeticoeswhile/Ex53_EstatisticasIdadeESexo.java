package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 53 – Estatísticas de Idade e Sexo

Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
*/

import java.util.Scanner;

public class Ex53_EstatisticasIdadeESexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mulheres = 0;
        int homens = 0;
        int mulheresMais20 = 0;
        double somaHomens = 0;
        double mediaHomens;
        double mediaIdade;
        double somaIdade = 0;

        for (int i=1; i<6; i++){
            System.out.println("--------------");
            System.out.println("> Pessoa " + i + ": ");
            System.out.println("Qual é a idade: ");
            int idade = scanner.nextInt();
            System.out.println("Qual é o sexo: (F/M)");
            char sexo = scanner.next().toLowerCase().charAt(0);

            if (sexo == 'f'){
                mulheres++;

                if (idade > 20){
                    mulheresMais20++;
                }

            } else if (sexo == 'm'){
                homens++;
                somaHomens = somaHomens + idade;
            } else {
                System.out.println("Atenção! Sexo inválido da pessoa " + i);
            }

            somaIdade = somaIdade + idade;


        }

        if (homens > 0) {
            mediaHomens = somaHomens / homens;
        } else {
            mediaHomens = 0;
        }

        mediaIdade = somaIdade / 5;

        System.out.println("--------------------");
        System.out.println(">> A média de idade do grupo é: " + mediaIdade);
        System.out.println(">> " + homens + " homens foram cadastrados.");
        System.out.println(">> " + mulheres + " mulheres foram cadastradas.");
        System.out.println(">> A média de idade dos homens é: " + mediaHomens);
        System.out.println(">> " + mulheresMais20 + " mulheres tem mais de 20 anos.");

    }
}