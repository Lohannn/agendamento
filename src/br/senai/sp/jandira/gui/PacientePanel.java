package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PacienteDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JTable;

public class PacientePanel extends javax.swing.JPanel {

    public PacientePanel() {
        initComponents();
        PacienteDAO.criarListaDePacientes();
        preencherTabela();
    }

    private int getLinha() {
        return tablePacientesCadastrados.getSelectedRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTable2 = new javax.swing.JScrollPane();
        tablePacientesCadastrados = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        buttonVisuzalizar = new javax.swing.JButton();
        buttonDeletar4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 232, 232));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        setLayout(null);

        tablePacientesCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        tablePacientesCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        tablePacientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePacientesCadastrados.getTableHeader().setReorderingAllowed(false);
        scrollTable2.setViewportView(tablePacientesCadastrados);

        add(scrollTable2);
        scrollTable2.setBounds(130, 30, 717, 280);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/editar.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Especialidades");
        add(buttonEditar);
        buttonEditar.setBounds(850, 320, 40, 40);

        buttonAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Especialidades");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        add(buttonAdicionar);
        buttonAdicionar.setBounds(910, 320, 40, 40);

        buttonVisuzalizar.setBackground(new java.awt.Color(255, 255, 255));
        buttonVisuzalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/visualizar.png"))); // NOI18N
        buttonVisuzalizar.setToolTipText("Visualizar Informações do Paciente");
        add(buttonVisuzalizar);
        buttonVisuzalizar.setBounds(20, 320, 40, 40);

        buttonDeletar4.setBackground(new java.awt.Color(255, 255, 255));
        buttonDeletar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/deletar.png"))); // NOI18N
        buttonDeletar4.setToolTipText("Deletar Especialidades");
        add(buttonDeletar4);
        buttonDeletar4.setBounds(790, 320, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private Integer getCodigo() {
        String codigoStr = tablePacientesCadastrados.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PacienteDialog pacienteDialogDialog = new PacienteDialog(null, true, OperacaoEnum.ADICIONAR);
        pacienteDialogDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonDeletar1;
    private javax.swing.JButton buttonDeletar4;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVisuzalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JScrollPane scrollTable1;
    private javax.swing.JScrollPane scrollTable2;
    private javax.swing.JTable tableEspecialidadescadastradas;
    private javax.swing.JTable tableEspecialidadescadastradas1;
    private javax.swing.JTable tablePacientesCadastrados;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tablePacientesCadastrados.setModel(PacienteDAO.getPacienteModel());
        ajustarTabela();
    }

    private void ajustarTabela() {

        tablePacientesCadastrados.getTableHeader().setReorderingAllowed(false);

        tablePacientesCadastrados.setDefaultEditor(Object.class, null);

        tablePacientesCadastrados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePacientesCadastrados.getColumnModel().getColumn(0).setPreferredWidth(60);
        tablePacientesCadastrados.getColumnModel().getColumn(1).setPreferredWidth(247);
        tablePacientesCadastrados.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablePacientesCadastrados.getColumnModel().getColumn(3).setPreferredWidth(127);
        tablePacientesCadastrados.getColumnModel().getColumn(4).setPreferredWidth(130);

    }

}
