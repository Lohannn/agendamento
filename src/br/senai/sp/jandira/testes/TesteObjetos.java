package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AppAgenda;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        int[] a = {6, 9, 87, 35, 96};
        int[] b = new int [4];
        b[0] = 55;
        b[1] = 55;
        b[2] = 11;
        b[3] = 99;
        
        int[][] c = {
            {4, 6 ,6},
            {5,9,7},
            {1,2,3},
            {5,5,8}
        };
        
        String[][] quitanda = {
            {"Banana","Maçã","Uva","Morango"},
            {"Alface","Couve","Pepino","Salsinha","Pimentão","Brócolis"},
            {"Abacate","Tomate","Jiló","Abobrinha"},
        };
        
        System.out.println(quitanda[1][4]);
        System.out.println(c[2][1]);

        System.out.println("***********************************************************************************");

        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setDescricao("Cuida do coração");

        Especialidade e2 = new Especialidade("Gastroenterologia");
        e2.setDescricao("Cuida da barriguinha mole");

        Especialidade e4 = new Especialidade("Otorrino");
        e2.setDescricao("Cuida do nariz");

        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer Coisa!");

        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);

        System.out.println("tamanho: " + EspecialidadeDAO.getEspecialidades().size());

        EspecialidadeDAO.gravar(e3);
        EspecialidadeDAO.gravar(e4);

        System.out.println("tamanho: " + EspecialidadeDAO.getEspecialidades().size());
        System.out.println("tamanho: " + EspecialidadeDAO.getEspecialidades().size());

        EspecialidadeDAO.excluirEspecialidade(e3.getCodigo());

        System.out.println("tamanho: " + EspecialidadeDAO.getEspecialidades().size());

        System.out.println(EspecialidadeDAO.getEspecialidade(e4.getCodigo()).getNome());

        Especialidade correta = new Especialidade("Dermatologia", "Parte da medicina que estuda as doenças da pele.");
        EspecialidadeDAO.atualizar(correta);

        System.out.println(EspecialidadeDAO.getEspecialidade(e4.getCodigo()).getNome());

        System.out.println("Total: " + e1.getContador());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());

        ArrayList<Especialidade> especialidadess = new ArrayList<>();

        System.out.println(especialidadess.size());
        especialidadess.add(e1);
        especialidadess.add(e2);
        especialidadess.add(e3);
        especialidadess.add(e4);
        System.out.println(especialidadess.size());

        // Imprimir no console as especiliades
        // que estão armazenadas no ArrayList
        int i = 0;

        while (i < especialidadess.size()) {
            System.out.println(especialidadess.get(i).getNome());
            i++;
        }

        // Utilização do for para iteração
        for (int j = 0; j < especialidadess.size(); j++) {
            System.out.println(especialidadess.get(j).getNome());
        }

        // FOR EACH
        for (Especialidade e : especialidadess) {
            System.out.println(e.getNome());
        }

        //Criar 3 planos de saúde, armazenar em um array list
        PlanoSaude a1 = new PlanoSaude("Bradesco");
        PlanoSaude a2 = new PlanoSaude("Amil");
        PlanoSaude a3 = new PlanoSaude("Notredame");

        ArrayList<PlanoSaude> planoSaudes = new ArrayList<>();
        planoSaudes.add(a1);
        planoSaudes.add(a2);
        planoSaudes.add(a3);

        for (PlanoSaude m : planoSaudes) {
            System.out.println(m.getOperadora());
            System.out.println(PlanoSaude.getQuantidade());
        }

        PlanoSaude a4 = new PlanoSaude("Bradesco");
        PlanoSaude a5 = new PlanoSaude("Amil");
        PlanoSaude a6 = new PlanoSaude("Notredame");

        System.out.println("\n\n" + PlanoSaude.getQuantidade());

        AppAgenda.main(args);

        System.out.println("\n\n" + PlanoSaude.getQuantidade());

    }

}
