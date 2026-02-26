package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 45 – Contagem com Incremento em Qualquer Situação

O programa acima vai ter um problema quando digitarmos o primeiro valor maior que o último.
Resolva esse problema com um código que funcione em qualquer situação.
*/

import java.util.Scanner;

public class Ex45_ContagemComIncrementoFlexivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o último valor: ");
        int ultimoNumero = scanner.nextInt();

        System.out.println("Digite o incremento: ");
        int incremento = scanner.nextInt();

        if (incremento == 0 || incremento < 0) {
            System.out.println("Erro no valor do incremento!");

        } else if (primeiroNumero > ultimoNumero) {
            //decrescente

            while (primeiroNumero >= ultimoNumero) {
                System.out.print(primeiroNumero + " ");
                primeiroNumero -= incremento;
            }

        } else {
            //crescente

            while (primeiroNumero <= ultimoNumero) {
                System.out.print(primeiroNumero + " ");
                primeiroNumero += incremento;
            }

        }

        System.out.println("Acabou!");
    }
}