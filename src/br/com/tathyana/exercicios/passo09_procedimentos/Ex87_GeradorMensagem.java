package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 87

Crie um programa que melhore o procedimento Gerador() da questão anterior para que mostre
uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Java") aparece:
+    =======   +
Aprendendo Java
+    =======   +
*/

public class Ex87_GeradorMensagem {
    public static void main(String[] args) {
        Gerador("Aprendendo Java");
    }

    public static void Gerador(String mensagem) {
        System.out.println("+    =======   +");
        System.out.println("  " + mensagem + "  ");
        System.out.println("+    =======   +");
    }
}