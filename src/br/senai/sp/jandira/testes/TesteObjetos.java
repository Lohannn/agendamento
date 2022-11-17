package br.senai.sp.jandira.testes;

import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;

public class TesteObjetos {

    public static void main(String[] args) {
        
      ArrayList<String> medicos = new ArrayList<>();
      medicos.add("Lohannes");
      medicos.add("Marcos");
      medicos.add("Celso");
        
      StringBuffer sb = new StringBuffer();
      
      for (String s : medicos) {
         sb.append(s);
         sb.append(";");
      }
      String str = sb.toString();
      System.out.println(str);

    }
}
