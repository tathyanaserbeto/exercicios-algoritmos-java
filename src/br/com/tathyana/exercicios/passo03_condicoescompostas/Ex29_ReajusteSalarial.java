package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 29 – Reajuste Salarial

Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário,
reajustado de acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%
*/

import java.util.Scanner;

public class Ex29_ReajusteSalarial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.next();

        System.out.println("Qual é o seu salário?");
        double salario = scanner.nextDouble();

        System.out.println("Quantos anos você trabalha na empresa?");
        int anos = scanner.nextInt();

        if (anos <= 3){
            double novosalario = salario + (salario * 0.03);
            System.out.printf("Olá %s, seu novo salário é de R$ %.2f reais", nome, novosalario);
        } else if (anos >= 10){
            double novosalario = salario + (salario * 0.20);
            System.out.printf("Olá %s, seu novo salário é de R$ %.2f reais", nome, novosalario);
        } else {
            double novosalario = salario + (salario * 0.125);
            System.out.printf("Olá %s, seu novo salário é de R$ %.2f reais", nome, novosalario);
        }
    }
}
