package br.com.tathyana.exercicios.passo06_repeticoesfacaenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 61 – Contagem com Faça Enquanto

Mostra na tela a contagem:
0 3 6 9 12 15 18 21 24 27 30 Acabou!
*/

public class Ex61_ContagemFacaEnquanto {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.print(i + " ");
            i += 3;
        } while (i <= 30) ;

        System.out.println("Acabou!");
    }
}