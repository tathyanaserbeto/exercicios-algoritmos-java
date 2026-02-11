package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 34 – Cálculo de IMC

O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas:

- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obesidade mórbida

Obs: O IMC é calculado pela expressão peso / altura²
*/

import java.util.Scanner;

public class Ex34_CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu peso? (em Kg)");
        double peso = scanner.nextDouble();

        System.out.println("Qual é a sua altura? (em metros)");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

       if (imc < 18.5) {
           System.out.printf("O seu IMC é %.2f e você está abaixo do peso.%n", imc);
       } else if (imc < 25) {
           System.out.printf("O seu IMC é %.2f e você está no peso ideal.%n", imc);
       } else if (imc < 30) {
           System.out.printf("O seu IMC é %.2f e você está com sobrepeso.%n", imc);
       } else if (imc < 40) {
           System.out.printf("O seu IMC é %.2f e você está com obesidade.%n", imc);
       } else {
           System.out.printf("O seu IMC é %.2f e você está com obesidade mórbida.%n", imc);
       }
    }
}
