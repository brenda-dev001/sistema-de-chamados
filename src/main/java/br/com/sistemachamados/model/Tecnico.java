package br.com.sistemachamados.model;

public class Tecnico extends Usuario{
    private String especialidade;

    public Tecnico(String nome, String email, String especialidade) {
        super(nome, email);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "especialidade='" + especialidade + '\'' +
                '}';
    }
}
