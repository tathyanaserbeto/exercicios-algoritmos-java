package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 10 – Pintura da Parede

Descrição: Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
*/

import java.util.Scanner;

public class Ex10_PinturaParede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a altura da parede? (em metros)");
        double altura = scanner.nextDouble();

        System.out.println("Qual a largura da parede?(em metros)");
        double largura = scanner.nextDouble();

        double area = altura * largura;
        double tinta = area / 2;

        System.out.println("----------");
        System.out.printf("Para pintar uma parede com %.2fm de largura e %.2fm de altura, será preciso %.1f litros de tinta. %n", largura, altura, tinta);
        System.out.println("----------");
    }
}
