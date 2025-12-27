package br.com.tathyana.exercicios.passo02_condicoesbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 17 – Multa por Velocidade

Descrição: Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
*/

import java.util.Scanner;

public class Ex17_MultaVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a velocidade do carro?");
        int velocidade = scanner.nextInt();

        if (velocidade > 80) {
            int kmExcedidos = velocidade - 80;
            double multa = kmExcedidos * 5;
            System.out.printf("Você foi multado! O valor da multa é de R$ %.2f. %n", multa);
        } else {
            System.out.println("Você está dentro da velocidade permitida!");
        }

    }
}