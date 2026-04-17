package br.com.tathyana.exercicios.passo09_procedimentos;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 89

Crie um programa que melhore o procedimento Gerador() da questão anterior para que
o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3

Ex: Uma chamada válida seria Gerador("Java", 3, 2)
~~~~~~~~:::::::~~~~~~~
JAVA
JAVA
JAVA
~~~~~~~~:::::::~~~~~~~
*/

public class Ex89_GeradorBordas {
    public static void main(String[] args) {

        Gerador("JAVA", 3, 2);

    }

    public static void Gerador(String mensagem, int vezes, int borda) {
        String linha;

        linha = switch (borda) {
            case 1 -> "+-------=======------+";
            case 2 -> "~~~~~~~~:::::::~~~~~~~";
            case 3 -> "<<<<<<<<------->>>>>>>";
            default -> "----------------------";
        };

        System.out.println(linha);

        for (int i = 0; i < vezes; i++) {
            System.out.println("         " + mensagem + "        ");
        }

        System.out.println(linha);
    }
}