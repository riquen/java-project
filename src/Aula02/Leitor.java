package Aula02;

import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        String sobrenome;
        String iniciais;

        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leitor.nextLine();
        iniciais = String.valueOf(nome.charAt(0));
        iniciais += String.valueOf(sobrenome.charAt(0));
        System.out.println("Seu nome é " + nome + " " + sobrenome + ", com as iniciais: " + iniciais);
    }
}
