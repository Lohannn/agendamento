package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoSaude {

    public PlanoSaude() {
        this.operadora = operadora;
        gerarCodigo();
    }

    public PlanoSaude(String operadora, String categoria, String numero, LocalDate validade) {
        this.operadora = operadora;
        this.categoria = categoria;
        this.numero = operadora;
        this.validade = validade;
        gerarCodigo();
    }

    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private Integer codigo;
    private static int contador = 200;

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
        this.codigo = getContador();
    }

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

}
