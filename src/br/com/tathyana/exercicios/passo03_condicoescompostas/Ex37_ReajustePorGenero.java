package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 37 – Reajuste Salarial por Gênero

Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores.

Faça um programa que leia:
- O salário atual
- O gênero do funcionário
- Há quantos anos trabalha na empresa

No final, mostre o novo salário baseado na tabela:

Mulheres:
- Menos de 15 anos: +5%
- De 15 até 20 anos: +12%
- Mais de 20 anos: +23%

Homens:
- Menos de 20 anos: +3%
- De 20 até 30 anos: +13%
- Mais de 30 anos: +25%
*/

import java.util.Scanner;

public class Ex37_ReajustePorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você é homem ou mulher?");
        String genero = scanner.nextLine().toLowerCase();

        System.out.println("Qual é o seu salário atual?");
        double salario = scanner.nextDouble();

        System.out.println("Há quantos anos trabalha na empresa?");
        int tempoTrabalho = scanner.nextInt();

        double aumento = 0;

        if (genero.equalsIgnoreCase("mulher")){

            if(tempoTrabalho < 15) {
                aumento = salario * 0.05;
            } else if (tempoTrabalho <= 20) {
                aumento = salario * 0.12;
            } else {
                aumento = salario * 0.23;
            }

        } else if (genero.equalsIgnoreCase("homem")) {

            if(tempoTrabalho < 20) {
                aumento = salario * 0.03;
            } else if (tempoTrabalho <= 30) {
                aumento = salario * 0.13;
            } else {
                aumento = salario * 0.25;
            }

        } else {
            System.out.println("Resposta Inválida!");
            return;
        }

        double novoSalario = salario + aumento;

        System.out.println("----------------------------");
        System.out.printf("Você vai receber um aumento de %.2f e seu novo salário será R$ %.2f. %n", aumento, novoSalario);


    }
}
