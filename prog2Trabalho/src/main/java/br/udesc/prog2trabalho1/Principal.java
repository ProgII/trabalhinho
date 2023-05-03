/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.udesc.prog2trabalho1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author 11835692974
 */
public class Principal {
    
    public static TarefasEstudos tarefa = new TarefasEstudos();
    public static List<Tarefa> listaTarefas = new ArrayList();
    public static List<Usuario> listaUsuarios = new ArrayList();
    public static Usuario admin = new Usuario("admin", "admin", "admin", "admin");

    public static void main(String[] args) {
        
    String descricao = "Beber agua";
    String prazo = "02/05/2023";
    String dificuldade = "fácil";
    String categoria = "nana";
    String status = "Pendente";
    
    //Tarefa tarefa1 = new Tarefa();
        
    //Tarefa tarefa2 = new Tarefa(descricao, prazo, dificuldade, categoria, status);

    //listaTarefas.add(tarefa1);
    //listaTarefas.add(tarefa2);
    
    listaTarefas.forEach(new ConsumerImpl());
    }  private static class ConsumerImpl implements Consumer<Tarefa> {

        public ConsumerImpl() {
        }

        @Override
        public void accept(Tarefa t) {
            System.out.println(t);
        }
    }
}
