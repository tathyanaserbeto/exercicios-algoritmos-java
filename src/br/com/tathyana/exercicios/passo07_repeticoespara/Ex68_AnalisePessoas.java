package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 68 – Análise de pessoas

Leia sexo e peso de 8 pessoas.
Mostre:
a) Quantas mulheres
b) Homens com mais de 100kg
c) Média de peso das mulheres
d) Maior peso entre homens
*/

import java.util.Scanner;

public class Ex68_AnalisePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        int quantidadeMulheres = 0;
        int homensMaisCem = 0;
        double mediaPesoMulheres;
        double somaPesoMulheres = 0;
        double maiorPeso = 0;

        for (i = 1; i <= 8; i++){

            System.out.println("Digite o sexo: ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.println("Digite o peso: ");
            double peso = scanner.nextDouble();

            if (sexo == 'F'){
                quantidadeMulheres++;
                somaPesoMulheres = somaPesoMulheres + peso;
            }

            if (sexo == 'M' && peso >= 100){
                homensMaisCem++;
            }

            if(sexo == 'M' && peso > maiorPeso){
                maiorPeso = peso;
            }


        }

        System.out.println("------------------------------");
        if (quantidadeMulheres == 0) {
            System.out.println("Nenhuma mulher foi registrada.");
        } else {
            mediaPesoMulheres = somaPesoMulheres / quantidadeMulheres;
            System.out.printf("Foram registradas %d mulheres.%n", quantidadeMulheres);
            System.out.printf("A média do peso das mulheres é de %.2f.%n", mediaPesoMulheres);
        }
        System.out.printf("%d homens tem mais de 100kg.%n", homensMaisCem);
        System.out.printf("O maior peso registrado entre os homens foi %.2f.%n", maiorPeso);

    }
}
