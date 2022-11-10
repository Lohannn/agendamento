package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;

//     Construtores da Classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        gerarCodigo();
    }
    
    public Especialidade(String nome, String descricao, Integer codigo){
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = codigo;
    }

    public Especialidade() {
        gerarCodigo();
    }
    
    public void gerarCodigo() {
        Especialidade.contador++;
        this.codigo = getContador();
    }

    // Métodos de acesso aos atributos

    public Integer getCodigo() {
        return codigo;
    }
    
    public int getContador() {
        return contador;
    }
    
    public void setNome(String nome) {

            this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {

            this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public String getSerializacao(){
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }

}
