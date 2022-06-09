package Aula05;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public int aumentarPontuacao() {
        return pontuacao += 1;
    }

    public int subirNivel() {
        return nivel += 1;
    }

    public int bonus(int valor) {
        return pontuacao += valor;
    }
}
