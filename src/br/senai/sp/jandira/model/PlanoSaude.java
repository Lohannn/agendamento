package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

    public class PlanoSaude {

    public PlanoSaude() {
        gerarCodigo();
    }
    
    public PlanoSaude(Integer codigo, String operadora, String categoria, String numero, String validade) {
        
        this.codigo = codigo;
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.dataFormatada = validade;
        this.contador = codigo;
        
    }

    public PlanoSaude(String operadora, String categoria, String numero, LocalDate validade) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = numero;
        this.validade = validade;
        
        gerarCodigo();
    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private Integer codigo;
    private static int contador = 200;
    
    public String toString() {
        return this.categoria;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void gerarCodigo() {
        PlanoSaude.contador++;
        this.codigo = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    public String getSerializacao(){
        return this.codigo + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.dataFormatada;
    }

}
