package br.com.sistemachamados.model;

import br.com.sistemachamados.enums.Categoria;
import br.com.sistemachamados.enums.Prioridade;
import br.com.sistemachamados.enums.StatusChamado;

import java.time.LocalDateTime;
import java.util.List;

public class Chamado {
    private int id;
    private static int serialChamado;
    private String descricao;
    private Usuario solicitante;
    private Tecnico tecnicoResponsavel;
    private Prioridade prioridade;
    private StatusChamado statusChamado;
    private Categoria categoria;
    private LocalDateTime dataCriacao;
    private  LocalDateTime dataFechamento;
    private List<Comentario> comentarios;

    public Chamado(String descricao, Usuario solicitante, Tecnico tecnicoResponsavel,
                   Prioridade prioridade, StatusChamado statusChamado, Categoria categoria,
                   LocalDateTime dataFechamento, List<Comentario> comentarios) {
        this.id = ++serialChamado;
        this.descricao = descricao;
        this.solicitante = solicitante;
        this.tecnicoResponsavel = tecnicoResponsavel;
        this.prioridade = prioridade;
        this.statusChamado = statusChamado;
        this.categoria = categoria;
        this.setDataCriacao();
        this.dataFechamento = dataFechamento;
        this.comentarios = comentarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public Tecnico getTecnicoResponsavel() {
        return tecnicoResponsavel;
    }

    public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
        this.tecnicoResponsavel = tecnicoResponsavel;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public StatusChamado getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(StatusChamado statusChamado) {
        this.statusChamado = statusChamado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao() {
        this.dataCriacao = LocalDateTime.now();
    }

    public LocalDateTime getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDateTime dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }


}
