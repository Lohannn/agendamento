
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class MedicoPanel extends javax.swing.JPanel {

    private int linha;

    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabelaMedicos();
    }
    
    private int getLinha() {
        return tableMedicosCadastrados.getSelectedRow();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanosDeSaude = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        tableMedicosCadastrados = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setLayout(null);

        PlanosDeSaude.setBackground(new java.awt.Color(232, 232, 232));
        PlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Médicos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        PlanosDeSaude.setForeground(new java.awt.Color(0, 102, 255));
        PlanosDeSaude.setPreferredSize(new java.awt.Dimension(980, 370));
        PlanosDeSaude.setLayout(null);

        tableMedicosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        tableMedicosCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        tableMedicosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMedicosCadastrados.getTableHeader().setReorderingAllowed(false);
        scrollTable.setViewportView(tableMedicosCadastrados);

        PlanosDeSaude.add(scrollTable);
        scrollTable.setBounds(200, 30, 577, 280);

        buttonDeletar.setBackground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/deletar.png"))); // NOI18N
        buttonDeletar.setToolTipText("Deletar Especialidades");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });
        PlanosDeSaude.add(buttonDeletar);
        buttonDeletar.setBounds(790, 320, 40, 40);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/editar.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Especialidades");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        PlanosDeSaude.add(buttonEditar);
        buttonEditar.setBounds(850, 320, 40, 40);

        buttonAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar Especialidades");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        PlanosDeSaude.add(buttonAdicionar);
        buttonAdicionar.setBounds(910, 320, 40, 40);

        add(PlanosDeSaude);
        PlanosDeSaude.setBounds(0, 0, 980, 370);
    }// </editor-fold>//GEN-END:initComponents

    private Integer getCodigo() {
        String codigoStr = tableMedicosCadastrados.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        if (getLinha() != -1) {
            excluirMedicoSelecionado();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Nenhum plano selecionado!",
                    "Excluindo Plano de Saúde",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void excluirMedicoSelecionado() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Esse Plano de Saúde será excluido.\nVocê tem certeza?",
                "Excluindo Plano de Saúde", JOptionPane.NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null);

        if (resposta == 0) {
            MedicoDAO.excluirMedico(getCodigo());
            preencherTabelaMedicos();
        }
    }
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (getLinha() != -1) {
            editarMedicoSelecionado();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Nenhum médico selecionado!",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void editarMedicoSelecionado() {

        Medico medico = MedicoDAO.getMedico(getCodigo());
        
        MedicoDialog medicoDialog = new MedicoDialog(null, true,
                medico, OperacaoEnum.EDITAR);
        medicoDialog.setVisible(true);
        preencherTabelaMedicos();
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabelaMedicos();
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanosDeSaude;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tableMedicosCadastrados;
    // End of variables declaration//GEN-END:variables

private void preencherTabelaMedicos() {
        tableMedicosCadastrados.setModel(MedicoDAO.getMedicoModel());
        ajustarTabelaPlanos();
    }

    private void ajustarTabelaPlanos() {

        tableMedicosCadastrados.getTableHeader().setReorderingAllowed(false);

        tableMedicosCadastrados.setDefaultEditor(Object.class, null);

        tableMedicosCadastrados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableMedicosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(120);
        tableMedicosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(267);
        tableMedicosCadastrados.getColumnModel().getColumn(3).setPreferredWidth(127);

    }
    
}
