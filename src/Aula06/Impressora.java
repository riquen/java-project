package Aula06;

import java.util.Date;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private Date dataFabricacao;
    private int folhasDisponiveis;

    private boolean temPapel() {
        return folhasDisponiveis > 0;
    }

    public String imprimir(String texto) {
        if (!temPapel()) {
            return "Sem papel";
        }
        return texto;
    }
}
