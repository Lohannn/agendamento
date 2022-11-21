package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    public Medico() {
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefone, String email, String dataNascimento, Especialidade[] especialidades) {

        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataFormatada = dataNascimento;
        this.contador = codigo;

    }

    public Medico(String crm, String nome, String telefone, String email, LocalDate dataNascimento, Especialidade[] especialidades) {

        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataNascimento.format(formatador);

        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.especialidades = especialidades;
        this.contador = codigo;

        gerarCodigo();
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    private Integer codigo;
    private String crm;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private Especialidade[] especialidades;
    private static int contador = 100;

    public void gerarCodigo() {
        Medico.contador++;
        this.codigo = getContador();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public int getContador() {
        return contador;
    }
    
    public void setDataFormatada(String data) {
        this.dataFormatada = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public String toString(){
        return ";" + Integer.toString(codigo);
    }

    public String getSerializacao() {

        return this.codigo + ";"
                + this.crm + ";"
                + this.nome + ";"
                + this.telefone + ";"
                + this.email + ";"
                + this.dataFormatada + ";" 
                + this.especialidades;
    }

}
