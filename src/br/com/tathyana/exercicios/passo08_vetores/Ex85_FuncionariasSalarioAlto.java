package br.com.tathyana.exercicios.passo08_vetores;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 85 – Funcionárias com Salário Alto

Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
*/

import java.util.Scanner;

public class Ex85_FuncionariasSalarioAlto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetornome = new String[5];
        char[] vetorsexo = new char[5];
        double[] vetorsalario = new double[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %d nome: ", i+1);
            vetornome[i] = scanner.nextLine();

            System.out.println("Digite o sexo dessa pessoa (F/M): ");
            vetorsexo[i] = scanner.nextLine().toLowerCase().charAt(0);

            System.out.println("Digite o salário dessa pessoa: ");
            vetorsalario[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nMulheres que ganham mais de 5 mil reais: ");
        for(int i = 0; i < 5; i++){
            if (vetorsexo[i] == 'f' && vetorsalario[i] > 5000){
                System.out.printf("%s - %.2f reais. %n", vetornome[i], vetorsalario[i]);
            }

        }

    }
}