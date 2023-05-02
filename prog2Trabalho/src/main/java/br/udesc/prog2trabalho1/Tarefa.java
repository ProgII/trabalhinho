/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2trabalho1;

/**
 *
 * @author 11835692974
 */
public abstract class Tarefa {
    
    private String descricao;
    private String prazo;
    private String dificuldade;
    private String status;
    
    public Tarefa (){}

    public Tarefa(String descricao, String prazo, String dificuldade, String status) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.dificuldade = dificuldade;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "descricao=" + descricao + ", prazo=" + prazo + ", dificuldade=" + dificuldade + ", status=" + status + '}';
    }
    
}
