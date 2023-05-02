/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.udesc.prog2trabalho1;

/**
 *
 * @author 11835692974
 */
public class Usuario {
    
    private String nomecompleto;
    private String nomeusuario;
    private String email;
    private String senha;
    
    public Usuario (){}

    public Usuario(String nomecompleto, String nomeusuario, String email, String senha) {
        this.nomecompleto = nomecompleto;
        this.nomeusuario = nomeusuario;
        this.email = email;
        this.senha = senha;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomecompleto=" + nomecompleto + ", nomeusuario=" + nomeusuario + ", email=" + email + ", senha=" + senha + '}';
    }
}
