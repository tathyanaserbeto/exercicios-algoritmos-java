package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 86

Crie um programa que tenha um procedimento Gerador() que, quando chamado,
mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
Ex: Ao chamar Gerador() aparece:
+    =======   +
Olá, Mundo!
+    =======   +
*/

public class Ex86_GeradorSimples {
    public static void main(String[] args) {
        Gerador();
    }

    public static void Gerador() {
        System.out.println("+    =======   +");
        System.out.println("   Olá, Mundo!   ");
        System.out.println("+    =======   +");
    }
}