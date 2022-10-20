package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoSaudeDAO {
    
    private static ArrayList<PlanoSaude> planosDeSaude = new ArrayList<>();

    public static ArrayList<PlanoSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }

    public static PlanoSaude getPlanosDeSaude(Integer codigo) {
        for (PlanoSaude e : planosDeSaude) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void excluirPlano(Integer codigo) {
        for (PlanoSaude e : planosDeSaude) {
            if (codigo.equals(e.getCodigo())) {
                planosDeSaude.remove(e);
                break;
            }
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDePlanos() {
        
        PlanoSaude e1 = new PlanoSaude("Bradesco", "Nacional Flex", "5639-1720-0384", LocalDate.of(2027, 03, 27));
        PlanoSaude e2 = new PlanoSaude("Unimed", "Estilo", "3876-2956-3186", LocalDate.of(2025, 06, 27));
        
        planosDeSaude.add(e1);
        planosDeSaude.add(e2);
        
    }
    
    public static DefaultTableModel getPlanoSaudeModel(){
        
        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planosDeSaude.size()][5];
        
        int i = 0;
        for (PlanoSaude e : planosDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            dados[i][4] = e.getCodigo().toString();
            i++;
        }
        
        DefaultTableModel modeloPlanos = new DefaultTableModel(dados, titulos);
        return modeloPlanos;
        
    }

    public static void atualizar(PlanoSaude corrigida) {
        for (PlanoSaude i : planosDeSaude) {
            if (corrigida.getCodigo() == i.getCodigo()) {
                planosDeSaude.set(planosDeSaude.indexOf(i), corrigida);
                break;
            }
        }
    }

    public static void gravar(PlanoSaude e) {
        planosDeSaude.add(e);
    }
    
}
