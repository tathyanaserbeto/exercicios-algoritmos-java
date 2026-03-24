package br.com.tathyana.exercicios.passo05_whilecomsentinela;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 59

Crie um programa que leia o sexo e a idade de várias pessoas.
O programa vai perguntar se o usuário quer continuar ou não a cada pessoa.
No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens
*/

import java.util.Scanner;

public class Ex59_AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sexo;
        int idade;
        char continuar;
        int maiorIdade = 0;
        int quantidadeHomens = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        double mediaIdadeHomens;
        int somaIdadeHomens = 0;


        while (true){

            System.out.println("Qual é o sexo da pessoa? (F/M)");
            sexo = scanner.next().toUpperCase().charAt(0);

            System.out.println("Qual é a idade dessa pessoa?");
            idade = scanner.nextInt();

            System.out.println("Quer continuar? (S/N)");
            continuar = scanner.next().toUpperCase().charAt(0);


            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            if (sexo == 'M'){
                quantidadeHomens++;
                somaIdadeHomens = somaIdadeHomens + idade;
            }

            if (sexo == 'F' && idade < menorIdadeMulher) {
                menorIdadeMulher = idade;
            }

            if (continuar == 'N') {
                break;
            }

        }

        System.out.println("---------------------");
        System.out.println("A maior idade foi: " + maiorIdade);

        if (quantidadeHomens > 0) {
            mediaIdadeHomens = (double) somaIdadeHomens / quantidadeHomens;
            System.out.println(quantidadeHomens + " homens foram cadastrados.");
            System.out.println("A média de idade dos homens é " + mediaIdadeHomens);
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }

        if (menorIdadeMulher != Integer.MAX_VALUE) {
            System.out.println("A idade da mulher mais jovem é " + menorIdadeMulher);
        } else {
            System.out.println("Nenhuma mulher foi cadastrada.");
        }


    }
}