package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 94

Desenvolva um aplicativo que tenha um procedimento chamado Fibonacci()
que recebe um único valor inteiro como parâmetro, indicando quantos termos
da sequência serão mostrados na tela.
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
*/



public class Ex94_FibonacciProcedimento {
    public static void main(String[] args) {

        Fibonacci(9);
    }

    public static void Fibonacci(int termos) {
        int a = 1;
        int b = 1;

        if (termos <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

            System.out.print(a + " >> ");

        if (termos >= 2) {
            System.out.print(b + " >> ");
        }

        for (int i = 3; i <= termos; i++) {
            int proximo = a + b;
            System.out.print(proximo + " >> ");
            a = b;
            b = proximo;
        }

        System.out.println("FIM");
    }
}