package br.com.tathyana.exercicios.passo04_repeticoeswhile;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 44 – Contagem com Incremento

Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento,
mostrando em seguida todos os valores no intervalo:

Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
*/

import java.util.Scanner;

public class Ex44_ContagemComIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o último valor: ");
        int ultimoNumero = scanner.nextInt();

        System.out.println("Digite o incremento: ");
        int incremento = scanner.nextInt();

        while (primeiroNumero <= ultimoNumero){
            System.out.print(primeiroNumero + " ");

            primeiroNumero += incremento;
        }

        System.out.println("Acabou!");
    }
}