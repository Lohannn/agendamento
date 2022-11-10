package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282201\\Java\\SistemaDeAgendamento\\Especialidades.txt";
    private final static Path PATH = Paths.get(URL);

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
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                
                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], 
                        Integer.valueOf(vetor[0]));
                
                //Guardar a especialidade em uma lista
                especialidades.add(e);
                
                //Ler a próxima linha
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                   "Ocorreu um erro ao ler o arquivo");
        }
        
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
                especialidades.set(especialidades.indexOf(i),
                        corrigida);
                break;
            }
        }
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);
        
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
