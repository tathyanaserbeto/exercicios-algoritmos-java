package br.com.tathyana.exercicios.passo10_funcoes;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 100

Melhore o exercício 96, criando além da função Media() uma outra função chamada Situacao(),
que vai retornar para o programa principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
Essa nova função vai receber como parâmetro o resultado retornado pela função Media().
*/

import java.util.Scanner;

public class Ex100_MediaSituacaoFuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        double media = Media(n1, n2);
        String situacao = Situacao(media);

        System.out.println("---------------------");
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);

    }

    public static double Media(double n1, double n2) {
       return (n1 + n2) /2;
    }

    public static String Situacao(double media) {
        String situacao;

        if (media >= 7) {
            situacao = "APROVADO";
        } else if (media >= 5) {
            situacao = "RECUPERAÇÃO";
        } else {
            situacao = "REPROVADO";
        }

        return situacao;
    }
}