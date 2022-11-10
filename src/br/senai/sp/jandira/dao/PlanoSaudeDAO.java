package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282201\\Java\\SistemaDeAgendamento\\PlanosDeSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<PlanoSaude> planosDeSaude = new ArrayList<>();

    public static ArrayList<PlanoSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }

    public static PlanoSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoSaude e : planosDeSaude) {
            if (codigo.equals(e.getCodigo())) {
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
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                PlanoSaude e = new PlanoSaude(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3], vetor[4]);
                
                //Guardar a especialidade em uma lista
                planosDeSaude.add(e);
                
                //Ler a próxima linha
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                   "Ocorreu um erro ao ler o arquivo");
        }
        
//        PlanoSaude e1 = new PlanoSaude("Bradesco", "Nacional Flex", "5639-1720-0384", LocalDate.of(2027, 03, 27));
//        PlanoSaude e2 = new PlanoSaude("Unimed", "Estilo", "3876-2956-3186", LocalDate.of(2025, 06, 27));
//        
//        planosDeSaude.add(e1);
//        planosDeSaude.add(e2);
        
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
            dados[i][4] = e.getDataFormatada();
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
        
        //GRAVAR ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getSerializacao());
            escritor.newLine();
            escritor.close();
            
            
        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
}
