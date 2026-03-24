package br.com.tathyana.exercicios.passo05_whilecomsentinela;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 60

Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos
*/

import java.util.Scanner;

public class Ex60_CadastroCompletoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        char sexo;
        int idadeMaisVelho = 0;
        int mulherMaisJovem = Integer.MAX_VALUE;
        String nomeMaisJovem = "";
        String nomeMaisVelho = "";
        double mediaIdade = 0;
        int homensMais30 = 0;
        int quantidadePessoas = 0;
        int mulheresMenos18 = 0;
        int somaIdade = 0;

        while (true){

            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();
            System.out.print("Digite o sexo (F/M): ");
            sexo = scanner.next().toUpperCase().charAt(0);
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            quantidadePessoas++;
            somaIdade = somaIdade + idade;

            if (idade > idadeMaisVelho){
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            if (sexo == 'F' && idade < mulherMaisJovem){
                mulherMaisJovem = idade;
                nomeMaisJovem = nome;
            }

            if (sexo == 'M' && idade > 30){
                homensMais30++;
            }

            if (sexo == 'F' && idade < 18){
                mulheresMenos18++;
            }

            System.out.print("Quer continuar? (S/N) ");
            char continuar = scanner.next().toUpperCase().charAt(0);

            scanner.nextLine();

            if(continuar == 'N'){
                break;
            }

        }

        if(quantidadePessoas > 0){
            mediaIdade = (double) somaIdade / quantidadePessoas;
        }


        System.out.println("-----------------------");
        System.out.println("O nome da pessoa mais velha é: " + nomeMaisVelho);
        System.out.println("O nome da mulher mais jovem é: " + nomeMaisJovem);
        System.out.println("A média de idade do grupo é " + mediaIdade);
        if (homensMais30 > 0) {
            System.out.println(homensMais30 + " homens tem mais de 30 anos.");
        } else {
            System.out.println("Nenhum homem tem mais de 30 anos.");
        }

        if (mulheresMenos18 > 0) {
            System.out.println(mulheresMenos18+ " mulheres tem menos de 18 anos.");
        } else {
            System.out.println("Nenhuma mulher tem menos de 18 anos.");
        }

    }
}