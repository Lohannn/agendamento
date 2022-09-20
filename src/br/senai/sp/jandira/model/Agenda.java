package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private LocalDate dataConsulta;
	private LocalTime horarioConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;

	public LocalDate getData() {
		return dataConsulta;
	}

	public void setData(LocalDate data) {
		this.dataConsulta = data;
	}

	public LocalTime getHorario() {
		return horarioConsulta;
	}

	public void setHorario(LocalTime horario) {
		this.horarioConsulta = horario;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}
