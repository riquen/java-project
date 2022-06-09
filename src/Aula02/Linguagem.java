package Aula02;

public class Linguagem {
    public static void main(String[] args) {
        String texto1 = "dell";
        String texto2 = "dell";

        if (texto1.equals(texto2)) {
            System.out.println("sucesso");
        }
        System.out.println("erro");

        int numA = 14;
        int numB = 14;

        if (numA > numB) {
            System.out.println("maior");
        } else if (numA == numB) {
            System.out.println("é igual");
        } else if (numA < numB) {
            System.out.println("menor");
        }
    }
}