package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 54 – Estatísticas de Peso e Altura

Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg e tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m e pesam mais de 100Kg.
*/

import java.util.Scanner;

public class Ex54_EstatisticasPesoAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAltura;
        double somaAltura = 0;
        int mais90 = 0;
        int menos50 = 0;
        int mais190 = 0;

        int i = 1;
        while (i < 8){
            System.out.println("---------------");
            System.out.println("Pessoa " + i + ": ");
            System.out.println("Qual é a altura?");
            double altura = scanner.nextDouble();
            System.out.println("Qual é o peso?");
            double peso = scanner.nextDouble();

            somaAltura = somaAltura + altura;

            if (peso > 100 && altura > 1.90){  //Pessoas que medem mais de 1.90m e pesam mais de 100Kg.
                mais190++;
            }

            if (peso < 50 && altura < 1.60) { //Pessoas que pesam menos de 50Kg e tem menos de 1.60m
                menos50++;
            }

           if (peso > 90) {  //Pessoas pesam mais de 90Kg
              mais90++;
           }

            i++;

        }

        mediaAltura = somaAltura / 7.0;

        System.out.printf("A média de altura do grupo é %.2f %n", mediaAltura);
        System.out.println(mais190 + " pessoas que medem mais de 1.90m e pesam mais de 100Kg.");
        System.out.println(menos50 + " pessoas que pesam menos de 50Kg e tem menos de 1.60m.");
        System.out.println(mais90 + " pessoas pesam mais de 90Kg.");


    }
}