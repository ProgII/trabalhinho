/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2trabalho1;

/**
 *
 * @author 11835692974
 */
public class TarefasEstudos extends Tarefa {
    
    private String disciplina;

    public TarefasEstudos() {
    }

    public TarefasEstudos(String disciplina, String descricao, String prazo, String dificuldade, String status) {
        super(descricao, prazo, dificuldade, status);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "TarefasEstudos{" + "disciplina=" + disciplina + '}';
    }

}
