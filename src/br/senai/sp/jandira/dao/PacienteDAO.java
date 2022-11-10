package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static Paciente getPaciente(Integer codigo) {
        for (Paciente e : pacientes) {
            if (codigo.equals(e.getCodigo())) {
                return e;
            }
        }
        return null;
    }

    public static void excluirPaciente(Integer codigo) {
        for (Paciente e : pacientes) {
            if (codigo.equals(e.getCodigo())) {
                pacientes.remove(e);
                break;
            }
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDePacientes() {

        PlanoSaude p1 = new PlanoSaude("Bradesco", "Nacional Flex", "5639-1720-0384", LocalDate.of(2027, 03, 27));
        Paciente e1 = new Paciente("Lohannes da Silva Costa", "Rua Olga", p1, LocalDate.of(2005, 01, 21), "(11)97541-8397", "32.749.873/91", "411.700.068/95");
        PlanoSaude p2 = new PlanoSaude("Unimed", "Estilo", "3876-2956-3186", LocalDate.of(2025, 06, 27));
        Paciente e2 = new Paciente("Luís Inácio Lula da Silva", "Distrito Federal", p2, LocalDate.of(1945, 10, 27), "(61)93673-4394", "47.390.434/73", "374.237.398/29");
        
        pacientes.add(e1);
        pacientes.add(e2);

    }

    public static DefaultTableModel getPacienteModel() {

        String[] titulos = {"CÓDIGO", "NOME", "NASCIMENTO", "CPF", "TELEFONE"};
        String[][] dados = new String[pacientes.size()][5];

        int i = 0;
        for (Paciente e : pacientes) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getNascimentoFormatado();
            dados[i][3] = e.getCpf();
            dados[i][4] = e.getTelefone();
            i++;
        }

        DefaultTableModel modeloPaciente = new DefaultTableModel(dados, titulos);
        return modeloPaciente;

    }

    public static void atualizar(Paciente corrigido) {
        for (Paciente i : pacientes) {
            if (corrigido.getCodigo() == i.getCodigo()) {
                pacientes.set(pacientes.indexOf(i), corrigido);
                break;
            }
        }
    }

    public static void gravar(Paciente e) {
        pacientes.add(e);
    }

}
