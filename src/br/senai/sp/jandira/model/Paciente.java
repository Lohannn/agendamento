package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente {
    
    public Paciente() {
        gerarCodigo();
    }

    public Paciente(String nome, String endereco, PlanoSaude planoSaude, LocalDate dataNascimento, String telefone, String rg, String cpf){
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        nascimentoFormatado = dataNascimento.format(formatador);
        
        this.nome = nome;
        this.endereco1 = endereco;
        this.planoSaude = planoSaude;
        this.dataNascimento = dataNascimento;
        this.telefone =  telefone;
        this.rg = rg;
        this.cpf = cpf;
        
        gerarCodigo();
    }
    
    private String nome;
    private Endereco endereco;
//    placeholder
    private String endereco1;
//    placeholder
    private PlanoSaude planoSaude;
    private LocalDate dataNascimento;
    private DateTimeFormatter formatador;
    private String nascimentoFormatado;
    private String telefone;
    private String rg;
    private String cpf;
    private static int contador = 100;
    private Integer codigo;

    public String getEndereco1() {
        return endereco1;
    }

    public void setEndereco1(String endereco1) {
        this.endereco1 = endereco1;
    }
    
    public String getNascimentoFormatado() {
        return nascimentoFormatado;
    }

    public void setNascimentoFormatado(String nascimentoFormatado) {
        this.nascimentoFormatado = nascimentoFormatado;
    }
    
    public void gerarCodigo() {
        Paciente.contador++;
        this.codigo = getContador();
    }
    
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public static void setContador(int contador) {
        Paciente.contador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
