package br.com.tathyana.exercicios.passo05_whilecomsentinela;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 57

Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres.

O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário.
*/

import java.util.Scanner;

public class Ex57_SalariosPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        char sexo;
        double somaMulheres = 0;
        double somaHomens = 0;
        char continuar = 'S';

        while (continuar == 'S') {

            System.out.println("Qual é o sexo do funcionário? (F/M)");
            sexo = scanner.next().toUpperCase().charAt(0);
            System.out.println("Qual o salário?");
            salario = scanner.nextDouble();

            if (sexo == 'F') {
                somaMulheres += salario;
            } else if (sexo == 'M') {
                somaHomens += salario;
            }

            System.out.println("Quer continuar?");
            continuar = scanner.next().toUpperCase().charAt(0);
        }

        System.out.println("-----------------------------");
        System.out.printf("A soma dos salários das mulheres é de R$ %.2f reais.%n", somaMulheres);
        System.out.printf("A soma dos salários dos homens é de R$ %.2f reais.%n", somaHomens);

    }
}