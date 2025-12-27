package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 18 – Situação do Voto

Descrição: Faça um programa que leia o ano de nascimento de uma pessoa e mostre
se ela está apta a votar, indicando se o voto é obrigatório, opcional ou se não
vota.
*/

import java.util.Scanner;

public class Ex18_VotoObrigatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual ano você nasceu?");
        int anoNascimento = scanner.nextInt();

        //Menor de 16 anos → NÃO vota
        //De 16 a 17 anos → VOTO OPCIONAL
        //70 anos ou mais → VOTO OPCIONAL
        //De 18 a 69 anos → VOTO OBRIGATÓRIO

        int idadeAtual = 2025 - anoNascimento;

        if (idadeAtual < 16){
            System.out.printf("Você tem %d anos e ainda não tem idade para votar.%n", idadeAtual);
        } else if (idadeAtual >= 18 && idadeAtual <= 69){
            System.out.printf("Você tem %d anos e seu voto é obrigatório!%n", idadeAtual);
        } else {
            System.out.printf("Você tem %d anos e o seu voto é opcional.%n", idadeAtual);
        }
    }
}
