package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteEminem {

	public static void main(String[] args) {

		int a = 5;

		Integer b = 5;

		Double x = 2.9;

		ArrayList<Especialidade> especialidades = new ArrayList<>();

		Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração");

		Especialidade e2 = new Especialidade();
//		e2.setNome("Gastroenterologia");
		e2.setDescricao("Cuida da barriguinha mole");

		especialidades.add(e1);
		especialidades.add(e2);

		Especialidade e3 = new Especialidade("Fisioterapia");
//		e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ter dor nas costas");

		especialidades.add(e3);

		Especialidade e4 = new Especialidade("Clinico geral");
//		e4.setNome("Clinico geral");
		e4.setDescricao("Cuida de um pouco de tudo que tem");

//		Especialidade[] especialidades = {e1, e2, e3, e4};

		Especialidade e5 = new Especialidade("Otorrinolaringologia");
//		e5.setNome("Otorrinolaringologia");
		e5.setDescricao("Cuida do ouvido e do pescoçito");

		especialidades.add(e4);
		especialidades.add(e5);
//		especialidades[4] = e5;
		
		System.out.println(especialidades.size());
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(25);
		notas.add(59);
		notas.add(734);
		System.out.println(notas.size());
		notas.add(9);
		notas.add(28);
		System.out.println(notas.size());
		
		System.out.println(especialidades.get(3).getNome());
		
		especialidades.get(1).setNome("Teste");
		System.out.println(e2.getNome());
		
		Especialidade nova = especialidades.get(2);
		
		System.out.println(nova.getNome());
		
		Especialidade y = new Especialidade();
		
	}

}
