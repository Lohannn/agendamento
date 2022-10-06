package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EspecialidadeDAO {

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void excluirEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                especialidades.remove(e);
                break;
            }
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        
        Especialidade e1 = new Especialidade("Cardiologia", "Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração.");
        Especialidade e2 = new Especialidade("Otorrinolaringologia", "Otorrinolaringologia trata de doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
        Especialidade e3 = new Especialidade("Gastroenterologia", "A gastroenterologia é a especialidade médica que se ocupa da prevenção e tratamento das doenças que afetam o aparelho digestivo.");
        Especialidade e4 = new Especialidade("Fisioterapia", "Fisioterapia trata de doenças relacionadas a postura, lesões ou má-formações.");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        
    }

    public static void atualizar(Especialidade corrigida) {
        for (Especialidade i : especialidades) {
            if (corrigida.getCodigo() == i.getCodigo()) {
                especialidades.set(especialidades.indexOf(i), corrigida);
            }
        }
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);
    }

}
