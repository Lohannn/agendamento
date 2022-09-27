package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AppAgenda;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

	public static void main(String[] args) {

		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setDescricao("Cuida do coração");

		Especialidade e2 = new Especialidade("Gastroenterologia");
		e2.setDescricao("Cuida da barriguinha mole");

		Especialidade e4 = new Especialidade("Otorrino");
		e2.setDescricao("Cuida do nariz");

		Especialidade e3 = new Especialidade();
		e3.setNome("Qualquer Coisa!");

		ArrayList<Especialidade> especialidades = new ArrayList<>();

		System.out.println(especialidades.size());
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		especialidades.add(e4);
		System.out.println(especialidades.size());

		// Imprimir no console as especiliades
		// que estão armazenadas no ArrayList

		int i = 0;

		while (i < especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		}

		// Utilização do for para iteração
		for (int c = 0; c < especialidades.size(); c++) {
			System.out.println(especialidades.get(c).getNome());
		}
		
		// FOR EACH
		for (Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		
		//Criar 3 planos de saúde, armazenar em um array list
		
		PlanoSaude a1 = new PlanoSaude("Bradesco");
		PlanoSaude a2 = new PlanoSaude("Amil");
		PlanoSaude a3 = new PlanoSaude("Notredame");
		
		ArrayList<PlanoSaude> planoSaudes = new ArrayList<>();
		planoSaudes.add(a1);
		planoSaudes.add(a2);
		planoSaudes.add(a3);
		
		for (PlanoSaude m : planoSaudes) {
			System.out.println(m.getOperadora());
			System.out.println(PlanoSaude.getQuantidade());
		}
		
		PlanoSaude a4 = new PlanoSaude("Bradesco");
		PlanoSaude a5 = new PlanoSaude("Amil");
		PlanoSaude a6 = new PlanoSaude("Notredame");
		
		System.out.println("\n\n" + PlanoSaude.getQuantidade());
		
		AppAgenda.main(args);
		
		System.out.println("\n\n" + PlanoSaude.getQuantidade());
		
	}

}