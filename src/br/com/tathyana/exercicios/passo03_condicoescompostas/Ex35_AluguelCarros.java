package br.com.tathyana.exercicios.passo03_condicoescompostas;

/*
Curso: Algoritmos – Gustavo Guanabara
Exercício 35 – Aluguel de Carros

Uma empresa de aluguel de carros precisa cobrar pelos seus serviços.
O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
para carro de luxo. Além disso, o cliente paga por Km percorrido.

Faça um programa que leia o tipo de carro alugado (popular ou luxo),
quantos dias de aluguel e quantos Km foram percorridos.

No final mostre o preço a ser pago de acordo com a tabela:

Carros populares (R$90 por dia):
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km

Carros de luxo (R$150 por dia):
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km
*/


import java.util.Scanner;

public class Ex35_AluguelCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que tipo de carro você quer alugar?");
        System.out.println("[1] Carro Popular");
        System.out.println("[2] Carro de Luxo");
        int tipoCarro = scanner.nextInt();

        System.out.println("Quantos dias de aluguel?");
        int dias = scanner.nextInt();

        System.out.println("Quantos km foram percorridos?");
        double kmPercorridos = scanner.nextDouble();

        double valorPago = 0;

        if (tipoCarro == 1) {
            valorPago = 90 * dias;

            if (kmPercorridos <= 100) {
                valorPago += 0.20 * kmPercorridos;
            } else {
                valorPago += 0.10 * kmPercorridos;
            }


        } else if (tipoCarro == 2){
            valorPago = 150 * dias;

            if (kmPercorridos <= 200) {
                valorPago += 0.30 * kmPercorridos;
            } else {
                valorPago += 0.25 * kmPercorridos;
            }

        } else {
            System.out.println("Tipo de carro inválido!");
            return;
        }

        System.out.println("-------------------------");
        System.out.printf("Você deve pagar R$ %.2f.%n", valorPago);
        System.out.println("-------------------------");



    }
}
