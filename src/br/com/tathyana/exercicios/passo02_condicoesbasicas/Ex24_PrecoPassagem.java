package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 24 – Preço da Passagem

Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.
*/

import java.util.Scanner;

public class Ex24_PrecoPassagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a distância que será percorrida (em Km) ?");
        double distancia = scanner.nextDouble();

        double preco;

        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }

        System.out.println("O valor da sua passagem é de R$ " + preco);
    }
}
