package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private final static String URL = "C:\\Users\\22282201\\Java\\SistemaDeAgendamento\\Medicos.txt";
    private final static String URL_TEMP = "C:\\Users\\22282201\\Java\\SistemaDeAgendamento\\Medicos-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico e : medicos) {
            if (codigo.equals(e.getCodigo())) {
                return e;
            }
        }
        return null;
    }

    public static void excluirMedico(Integer codigo) {
        for (Medico e : medicos) {
            if (codigo.equals(e.getCodigo())) {
                medicos.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        //PASSO 01 - Criar uma rpresentação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter assisTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico e : medicos) {
                assisTemp.write(e.getSerializacao());
                assisTemp.newLine();
            }

            assisTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.getStackTrace();
        }
    }

    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Medico e = new Medico(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3]);

                //Guardar a especialidade em uma lista
                medicos.add(e);

                //Ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }

    }
    
    public static DefaultTableModel getPlanoSaudeModel(){
        
        String[] titulos = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][5];
        
        int i = 0;
        for (Medico e : medicos) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();
            i++;
        }
        
        DefaultTableModel modeloPlanos = new DefaultTableModel(dados, titulos);
        return modeloPlanos;
        
    }

    public static void atualizar(Medico corrigida) {
        for (Medico i : medicos) {
            if (corrigida.getCodigo() == i.getCodigo()) {
                medicos.set(medicos.indexOf(i), corrigida);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void gravar(Medico e) {
        medicos.add(e);
        
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
