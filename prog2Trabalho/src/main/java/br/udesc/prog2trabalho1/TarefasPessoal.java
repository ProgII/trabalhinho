/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2trabalho1;

/**
 *
 * @author 11835692974
 */
public class TarefasPessoal extends Tarefa {
    
    private String areaPessoal;

    public TarefasPessoal() {}

    public TarefasPessoal(String areaPessoal, String descricao, String prazo, String dificuldade, String status) {
        super(descricao, prazo, dificuldade, status);
        this.areaPessoal = areaPessoal;
    }

    public String getAreaPessoal() {
        return areaPessoal;
    }

    public void setAreaPessoal(String areaPessoal) {
        this.areaPessoal = areaPessoal;
    }

    @Override
    public String toString() {
        return "TarefasPessoal{" + "areaPessoal=" + areaPessoal + '}';
    }    
    
}
