package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        
        Especialidade e1 = new Especialidade("Cardiologia", "Área da medicina que cuida do coração.");
        Especialidade e2 = new Especialidade("Otorrinolaringologia", "Área da medicina que cuida do ouvido, nariz e pescoço.");
        Especialidade e3 = new Especialidade("Gastroenterologia", "Área da medicina que cuida do estômago.");
        Especialidade e4 = new Especialidade("Fisioterapia", "Área da medicina que cuida dos problemas no corpo.");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        
    }
    
    public static DefaultTableModel getEspecialidadesModel(){
        
        String[] titulos = {"CÓDIGO", "ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];
        
        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        
        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        return modelo;
        
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
