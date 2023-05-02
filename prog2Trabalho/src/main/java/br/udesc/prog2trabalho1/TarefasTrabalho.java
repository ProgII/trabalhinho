/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2trabalho1;

/**
 *
 * @author 11835692974
 */
public class TarefasTrabalho extends Tarefa {
    
    String nomeTrabalho;

    public TarefasTrabalho() {
    }

    public TarefasTrabalho(String nomeTrabalho, String descricao, String prazo, String dificuldade, String status) {
        super(descricao, prazo, dificuldade, status);
        this.nomeTrabalho = nomeTrabalho;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setNomeTrabalho(String nomeTrabalho) {
        this.nomeTrabalho = nomeTrabalho;
    }

    @Override
    public String toString() {
        return "TarefasTrabalho{" + "nomeTrabalho=" + nomeTrabalho + '}';
    }
    
    
}
