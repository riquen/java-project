package Aula02;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sobrenome;
        String iniciais;
        int dia;
        int mes;
        int ano;

        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leitor.nextLine();
        iniciais = String.valueOf(nome.charAt(0));
        iniciais += String.valueOf(sobrenome.charAt(0));
        System.out.print("Digite o dia do seu nascimento: ");
        dia = leitor.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        mes = leitor.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        ano = leitor.nextInt();

        System.out.println("Seu nome é " + nome + " " + sobrenome + ", com as iniciais: " + iniciais +
                " e sua data de nascimento é: " + dia + "/" + mes + "/" + ano);
    }
}