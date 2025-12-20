package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 16 – Redução do Tempo de Vida do Fumante

Descrição: Escreva um programa para calcular a redução do tempo de vida de um fumante.
Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou.
Considere que um fumante perde 10 minutos de vida a cada cigarro. Calcule quantos
dias de vida um fumante perderá e exiba o total em dias.
*/

import java.util.Scanner;

public class Ex16_ReducaoVidaFumante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você fuma há quantos anos?");
        int anosFumando = scanner.nextInt();
        System.out.println("Qual a quantidade de cigarros fumados por dia?");
        int cigarrosPorDia = scanner.nextInt();

        int dias = anosFumando * 365;
        int totalCigarros = cigarrosPorDia * dias;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / 1440;

        System.out.println("----------");
        System.out.printf("Ao longo de %d anos fumando %d cigarros por dia, você perdeu aproximadamente %d dias de vida.%n", anosFumando, cigarrosPorDia, diasPerdidos);
        System.out.println("----------");
    }
}
