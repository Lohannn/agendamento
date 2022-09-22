package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoSaude;

public class AppAgenda {

	public static void main(String[] args) {
		
//		int nota = 10;
//		int[] notas = {5, 6, 9};
//		double[] precos = new double[3];
//		precos[0] = 5.9;
//		precos[1] = 7.97;
//		precos[2] = 52.35;
//		
//		String[] nomes = {"ana", "paulo", "pedro", "julio"};
//		String[] cidades = new String[3];
//		cidades[0] = "Jandira";
//		cidades[1] = "Barueri";
//		cidades[2] = "Cotia";

		Especialidade especialidade1 = new Especialidade("Cardiologia");
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao(
				"Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração.");

		Especialidade especialidade2 = new Especialidade("Otorrinolaringologia");
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2
				.setDescricao("Otorrinolaringologia trata de doenças dos ouvidos, nariz, garganta, laringe e pescoço.");

		Especialidade especialidade3 = new Especialidade("Gastroenterologia");
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao(
				"A gastroenterologia é a especialidade médica que se ocupa da prevenção e tratamento das doenças que afetam o aparelho digestivo.");

		Especialidade especialidade4 = new Especialidade("Fisioterapia");
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Fisioterapia trata de doenças relacionadas a postura, lesões ou má-formações.");

		Especialidade especialidade5 = new Especialidade("Clínico Geral");
		especialidade5.setNome("Clínico Geral");
		especialidade5.setDescricao("Clínico Geral trata de Checkups.");

		Especialidade[] especialidadesMed1 = { especialidade1, especialidade5 };
		Especialidade[] especialidadesMed2 = { especialidade1, especialidade4, especialidade5 };

		Medico medico1 = new Medico();
		medico1.setNome("Leonardo");
		medico1.setEspecialidade(especialidadesMed1);
		medico1.setTelefone("(11)98471-8452");
		medico1.setEmail("leornado@gmail.com");
		medico1.setCrm("123456");

		Medico medico2 = new Medico();
		medico2.setNome("Joaquina");
		medico2.setEspecialidade(especialidadesMed2);
		medico2.setTelefone("(11)94631-7238");
		medico2.setEmail("Joaquina@hotmail.com");
		medico2.setCrm("654321");

		// Exibir dados dos dois médicos
		System.out.println("--------------LISTA DE MEDICOS---------------");
		int i = 0;
		System.out.println("Nome do Médico: " + medico1.getNome());
		System.out.println("CRM do Médico: " + medico1.getCrm());
		System.out.print("Especialidades: ");
		while (i < medico1.getEspecialidade().length) {
			System.out.print(medico1.getEspecialidade()[i].getNome() + ", ");
			i++;
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("Nome do Médico: " + medico2.getNome());
		System.out.println("CRM do Médico: " + medico2.getCrm());
		System.out.print("Especialidades: ");
		i = 0;
		while (i < medico2.getEspecialidade().length) {
			System.out.print(medico2.getEspecialidade()[i].getNome() + ", ");
			i++;
		}

		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Olga");
		endereco1.setNumero("13");
		endereco1.setComplemento("Bloco 1 AP44");
		endereco1.setBairro("Pq. dos Camargos");
		endereco1.setCidade("Barueri");
		endereco1.setEstado("São Paulo");
		endereco1.setCep("06436-390");

		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Camboriú");
		endereco2.setNumero("189");
		endereco2.setComplemento("");
		endereco2.setBairro("Vale do Sol");
		endereco2.setCidade("Jandira");
		endereco2.setEstado("São Paulo");
		endereco2.setCep("06620-310");

		PlanoSaude plano1 = new PlanoSaude();
		plano1.setCategoria("Estilo");
		plano1.setNumero("3876-2956-3186");
		plano1.setOperadora("Unimed");
		plano1.setValidade(LocalDate.of(2025, 06, 27));

		PlanoSaude plano2 = new PlanoSaude();
		plano2.setCategoria("Nacional Flex");
		plano2.setNumero("5639-1720-0384");
		plano2.setOperadora("Bradesco");
		plano2.setValidade(LocalDate.of(2027, 03, 27));

		Paciente paciente1 = new Paciente();
		paciente1.setNome("Lohannes da Silva Costa");
		paciente1.setEndereco(endereco1);
		paciente1.setPlanoSaude(plano1);
		paciente1.setDataNascimento(LocalDate.of(2005, 01, 21));
		paciente1.setTelefone("(11)97541-8397");
		paciente1.setRg("35.050.273/01");
		paciente1.setCpf("411.700.068-95");

		Paciente paciente2 = new Paciente();
		paciente2.setNome("Artur Alves");
		paciente2.setEndereco(endereco2);
		paciente2.setPlanoSaude(plano2);
		paciente2.setDataNascimento(LocalDate.of(2005, 04, 10));
		paciente2.setTelefone("(11)97628-5284");
		paciente2.setRg("29.159.861/52");
		paciente2.setCpf("523.683.710-67");

		// Exibir dados dos pacientes
		System.out.println("\n\n\n--------------LISTA DE PACIENTES---------------");
		System.out.println("Nome do Paciente: " + paciente1.getNome());
		System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
		System.out.println("Telefone: " + paciente1.getTelefone());
		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
		System.out.println("UF: " + paciente1.getEndereco().getEstado());
		System.out.println("Operadora do Plano de Saúde: " + paciente1.getPlanoSaude().getOperadora());
		System.out.println("Categoria do Plano de Saúde: " + paciente1.getPlanoSaude().getCategoria());
		System.out.println("-----------------------------------------------");
		System.out.println("Nome do Paciente: " + paciente2.getNome());
		System.out.println("Data de Nascimento: " + paciente2.getDataNascimento());
		System.out.println("Telefone: " + paciente2.getTelefone());
		System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
		System.out.println("UF: " + paciente2.getEndereco().getEstado());
		System.out.println("Operadora do Plano de Saúde: " + paciente2.getPlanoSaude().getOperadora());
		System.out.println("Categoria do Plano de Saúde: " + paciente2.getPlanoSaude().getCategoria());

		// agenda1r para o paciente 1 uma consulta com o o médico 2
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setDataConsulta(LocalDate.of(2023, 9, 27));
		agenda1.setHorarioConsulta(LocalTime.of(15, 45));
		agenda1.setMedico(medico2);
		agenda1.setEspecialidade(especialidade4);

		// exibir agenda1 do Paciente 1
		System.out.println("\n\n\n----------------AGENDAMENTOS------------------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Data da Consulta: " + agenda1.getDataConsulta());
		System.out.println("Hora da Consulta: " + agenda1.getHorarioConsulta());
		System.out.println("Nome do Médico: Dra." + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Plano de Saúde: " + agenda1.getPaciente().getPlanoSaude().getOperadora() + " - "
				+ agenda1.getPaciente().getPlanoSaude().getCategoria());
		System.out.println("Telefone do Paciente: " + agenda1.getPaciente().getTelefone());
	}

}
