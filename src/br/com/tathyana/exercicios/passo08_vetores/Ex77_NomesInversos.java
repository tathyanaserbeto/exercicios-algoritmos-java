package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 77 – Nomes em Ordem Inversa

Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados.
*/

import java.util.Scanner;

public class Ex77_NomesInversos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[7];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Digite o " + (i + 1) + " nome:");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("--- Nomes na ordem inversa ---");

        for (int i = nomes.length - 1; i >= 0; i--){
            System.out.println(nomes[i]);
        }

    }
}
