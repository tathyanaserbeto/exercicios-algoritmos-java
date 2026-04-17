package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 93

Faça um programa que tenha um procedimento chamado Contador() que recebe três valores
como parâmetro:
o início, o fim e o incremento de uma contagem. O programa principal deve solicitar
a digitação desses valores e passá-los ao procedimento, que vai mostrar a contagem na tela.
Ex: Para os valores de início (4), fim (20) e incremento(3) teremos Contador(4, 20, 3)
vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
*/

import java.util.Scanner;

public class Ex93_ContadorProcedimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int inicio = scanner.nextInt();
        System.out.println("Digite o último número: ");
        int fim = scanner.nextInt();
        System.out.println("Digite o incremento: ");
        int incremento = scanner.nextInt();


        Contador(inicio, fim, incremento);
    }

    public static void Contador(int inicio, int fim, int incremento) {

        if (incremento == 0) {
            System.out.println("Incremento não pode ser zero.");
            return;
        }

        if (inicio < fim) {
            for (int i = inicio; i <= fim; i += incremento) {
                System.out.print(i + " >> ");
            }
        } else {
            for (int i = inicio; i >= fim; i -= incremento) {
                System.out.print(i + " >> ");
            }
        }

        System.out.println("FIM");
    }
}