package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 65 – Contagem regressiva com Para

Mostra na tela:
100 90 80 70 60 50 40 30 20 10 0 Acabou!
*/

public class Ex65_ContagemRegressiva {
    public static void main(String[] args) {

        int i;

        for (i = 100; i >= 0; i = i - 10){
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");
    }
}
