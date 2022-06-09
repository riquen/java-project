package Aula02;

import java.util.Scanner;

public class MesaDeTrabalho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num;
        int numA;
        int numB;
        int numC;

        System.out.print("Digite um número: ");
        num = leitor.nextInt();

        numeroPrimo(num);

        System.out.print("Digite um número: ");
        numA = leitor.nextInt();
        System.out.print("Digite outro número: ");
        numB = leitor.nextInt();
        System.out.print("Digite mais um número: ");
        numC = leitor.nextInt();

        maiorNumero(numA, numB, numC);
    }

    static boolean numeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é número primo");
                return false;
            }
        }
        System.out.println("É número primo");
        return true;
    }

    static int maiorNumero(int numA, int numB, int numC) {
        if (numA > numB && numA > numC) {
            System.out.println("O maior é: " + numA);
            return numA;
        } else if (numB > numA && numB > numC) {
            System.out.println("O maior é: " + numB);
            return numB;
        }
        System.out.println("O maior é: " + numC);
        return numC;
    }
}