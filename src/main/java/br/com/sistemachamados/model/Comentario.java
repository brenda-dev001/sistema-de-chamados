package br.com.sistemachamados.model;

import java.time.LocalDateTime;

public class Comentario {
    private int id;
    private static int serialComentario;
    private Usuario autor;
    private String mensagem;
    private LocalDateTime data;

    public Comentario(Usuario autor, String mensagem) {
        this.id = ++serialComentario;
        this.autor = autor;
        this.mensagem = mensagem;
        this.setData();
    }

    public int getId() {
        return id;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData() {
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "COMENTARIO - ID: " + this.getId() + "\n" +
                this.getMensagem() + "\n" +
                "Autor: " + this.getAutor() + "\n" +
                "Data: " + this.getData() + "\n";
    }
}
