package Aula03;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        double qtdeComida;

        System.out.print("Digite o nome do seu pet: ");
        nome = leitor.nextLine();
        System.out.print("Digite a quantidade diária que ele come: ");
        qtdeComida = leitor.nextDouble();
        while (qtdeComida < 3) {
            System.out.print("A quantidade não pode ser menor que 3, tente novamente: ");
            qtdeComida = leitor.nextDouble();
        }

        quantosPacotes(nome, qtdeComida, leitor);
    }

    static void quantosPacotes(String nome, double qtdeComida, Scanner leitor) {
        double pacotes = 0;
        int contador = 0;
        while (pacotes < qtdeComida) {
            System.out.print("Digite o valor do pacote: ");
            pacotes += leitor.nextDouble();
            contador++;
        }
        System.out.printf(nome + " come " + qtdeComida + "kg diários e precisa de " + contador + " pacotes");
    }
}