package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 43 – Contagem Regressiva com Divisíveis por 4

Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
*/

public class Ex43_ContagemRegressivaComDivisiveisPor4 {
    public static void main(String[] args) {

        int contagem = 30;

        while (contagem >= 1){

            if (contagem % 4 == 0) {
                System.out.print("[" + contagem + "] ");
            } else {
                System.out.print(contagem + " ");
            }

            contagem --;
        }
    }
}