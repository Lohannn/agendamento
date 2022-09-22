package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;

	// Construtores da Classe
	public Especialidade(String nome) {
		this.nome = nome;
	}

	public Especialidade(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public Especialidade() {

	}

	// Métodos de acesso aos atributos
	public void setNome(String nome) {

		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null,
					"O nome da especialidade (''" + nome + "'') deve ter ao menos 3 letras!", "Nome Inválido",
					JOptionPane.WARNING_MESSAGE, null);
		}

	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, "A descrição é muito pequena!\nDeve ter ao menos 10 caracteres!",
					"Descrição Inválida", JOptionPane.WARNING_MESSAGE, null);
		}
	}

	public String getDescricao() {
		return descricao;
	}

}