package br.com.tathyana.exercicios.passo04_repeticoesenquanto;

/*
Curso: Algoritmos – Gustavo Guanabara
40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
*/

public class Ex40_ContagemDe3Em3 {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i+=3) {
            System.out.print(i + " ");
        }

        System.out.println("Acabou!");
    }
}