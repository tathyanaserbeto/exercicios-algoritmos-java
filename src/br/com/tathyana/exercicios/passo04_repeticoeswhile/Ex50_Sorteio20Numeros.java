package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 50 – Sorteio de 20 Números

Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
*/

import java.util.Random;

public class Ex50_Sorteio20Numeros {
    public static void main(String[] args) {
        Random random = new Random();

        int acimaDe5 = 0;
        int divisiveisPor3 = 0;

        int i = 0;
        while (i < 20) {
            int numero = random.nextInt(11);

            System.out.print(numero + " ");

            if (numero > 5) {
                acimaDe5++;
            }

            if (numero % 3 == 0){
                divisiveisPor3++;
            }

            i++;
        }

        System.out.println(" ");
        System.out.println("Números acima de 5: " + acimaDe5);
        System.out.println("Números divisíveis por 3: " + divisiveisPor3);

    }
}