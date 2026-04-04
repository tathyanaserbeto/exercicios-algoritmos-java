package br.com.tathyana.exercicios.passo07_repeticoespara;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 64 – Contagem com Para (de 5 em 5)

Mostra na tela:
0 5 10 15 20 25 30 35 40 Acabou!
*/

public class Ex64_ContagemPara {
    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 40; i = i + 5){
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");

    }
}