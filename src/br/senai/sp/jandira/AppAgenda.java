package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class AppAgenda {
	
	public static void main(String[] args) {
		
//		Especialidade especialidade = new Especialidade();
//		especialidade.setNome("Cardiologia");
//		especialidade.setDescricao("Faz alguma coisa legal aí");
//		
//		Especialidade especialidade2 = new Especialidade();
//		especialidade2.setNome("Otorrinolaringologia");
//		especialidade2.setDescricao("Faz algo");
//		
//		JOptionPane.showMessageDialog(null, especialidade2.getNome());
//		System.out.println(especialidade.getNome());
//		System.out.println(especialidade.getDescricao());
		
		PlanoSaude plano = new PlanoSaude();
		plano.setCategoria("Prata");
		plano.setNumero("9999999999999");
		plano.setOperadora("Bradesco");
//		plano.setValidade();
		
	}

}
