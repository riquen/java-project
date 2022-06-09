package Aula05;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
    }

    public double aumentarDivida(double valor) {
        return divida += valor;
    }

    public double pagarDivida(double valor) {
        return divida -= valor;
    }
}
