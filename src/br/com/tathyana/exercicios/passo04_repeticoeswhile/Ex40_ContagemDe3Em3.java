package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
*/

public class Ex40_ContagemDe3Em3 {
    public static void main(String[] args) {

        int contador = 0;

        while (contador < 20){
            System.out.print(contador + " ");
            contador += 3;
        }

        System.out.println("Acabou!");
    }
}