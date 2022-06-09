package Aula02;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numA;
        int numB;

        System.out.print("Digite um n�mero: ");
        numA = leitor.nextInt();
        System.out.print("Digite outro n�mero: ");
        numB = leitor.nextInt();

        dividir(numA, numB);
    }

    static boolean dividir(int numA, int numB) {
        if (numA % numB == 0) {
            System.out.println("Divis�vel");
            return false;
        }
        System.out.println("N�o divis�vel");
        return true;
    }
}
