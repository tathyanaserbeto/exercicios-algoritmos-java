package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 88

Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem várias vezes.
Ex: Ao chamar Gerador("Aprendendo Java", 4) aparece:
+    =======   +
Aprendendo Java
Aprendendo Java
Aprendendo Java
Aprendendo Java
+    =======   +
*/

public class Ex88_GeradorRepeticao {
    public static void main(String[] args) {
        Gerador("Aprendendo Java", 4);
    }

    public static void Gerador(String mensagem, int vezes) {
        System.out.println("+    =======   +");
        for (int i = 0; i < vezes; i++) {
            System.out.println("  " + mensagem + "  ");
        }
        System.out.println("+    =======   +");
    }
}