package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 28 – Áres do Terreno

Faça um programa que leia a largura e o comprimento de um terreno retangular,
calculando e mostrando a sua área em m². O programa também devemostrar a classificação
desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP
*/

import java.util.Scanner;

public class Ex28_AreaTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a comprimento do terreno em metros?");
        double comprimento = scanner.nextDouble();

        System.out.println("Qual a altura do terreno em metros?");
        double altura = scanner.nextDouble();

        double area = comprimento * altura;

        if (area < 100) {
            System.out.println("------------------------");
            System.out.printf("O seu terreno tem %.2f m² e é classificado como POPULAR.%n", area);
        } else if (area > 500) {
            System.out.println("------------------------");
            System.out.printf("O seu terreno tem %.2f m² e é classificado como VIP.%n", area);
        } else {
            System.out.println("------------------------");
            System.out.printf("O seu terreno tem %.2f m² e é classificado como MASTER.%n", area);
        }

    }
}
