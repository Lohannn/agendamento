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
