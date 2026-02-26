package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 42 – Contagem até Valor Informado

Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
*/

import java.util.Scanner;

public class Ex42_ContagemAteValorInformado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo: ");
        int numero = scanner.nextInt();

        int contagem = 1;

        while (contagem <= numero){
            System.out.print(contagem + " ");
            contagem ++;
        }

        System.out.println("Acabou!");
    }
}