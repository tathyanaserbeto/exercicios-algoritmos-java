package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 22 – Alistamento Militar

Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*/

import java.util.Scanner;
import java.time.LocalDate;

public class Ex22_AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu ano de nascimento?");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        if (idade < 18) {
            System.out.println("Ainda não é hora de se alistar...");
            System.out.println("Faltam " + (18 - idade) + " anos para você se alistar.");
        } else if (idade > 18) {
            System.out.println("Já passou da hora de se alistar...");
            System.out.println("Você deveria ter se alistado há " + (idade-18) + " anos.");
        } else {
            System.out.println("Você precisa se alistar esse ano!");
        }
    }
}
