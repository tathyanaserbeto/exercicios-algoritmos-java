package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
 Curso: Algoritmos – Gustavo Guanabara
 Exercício 02 – Boas Vindas

  Descrição: Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
  vindas para ela
 */

import java.util.Scanner;

public class Ex02_BoasVindas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String name = scanner.nextLine();

        System.out.printf( "Olá %s! Seja bem-vindo(a)!", name );

    }
}
