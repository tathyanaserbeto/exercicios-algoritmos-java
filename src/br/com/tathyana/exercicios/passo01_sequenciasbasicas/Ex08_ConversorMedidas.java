package br.com.tathyana.exercicios.passo01_sequenciasbasicas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 08 – Conversor de Medidas

Descrição: Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
*/

import java.util.Scanner;

public class Ex08_ConversorMedidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma distância em metros:");
        double distancia = scanner.nextDouble();

        double quilometros = distancia / 1000;
        double pes = distancia * 3.28084;
        double polegadas = distancia * 39.3701;
        double milhas = distancia / 1609.344;
        double milimetros = distancia * 1000;
        double jardas = distancia * 1.09361;

        System.out.println("----------");
        System.out.printf("%.1f m corresponde a:%n", distancia);
        System.out.printf("Quilômetros: %.2f km%n", quilometros);
        System.out.printf("Pés: %.2f ft%n", pes);
        System.out.printf("Polegadas: %.2f in%n", polegadas);
        System.out.printf("Milhas: %.2f mi%n", milhas);
        System.out.printf("Milímetros: %.2f mm%n", milimetros);
        System.out.printf("Jardas: %.2f yd%n", jardas);
        System.out.println("----------");


    }
}
