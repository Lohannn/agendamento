/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282201
 */
public class EspecialidadesPanel extends javax.swing.JPanel {

    private int linha;
    
    public EspecialidadesPanel() {
        initComponents();
        preencherTabela();
    }

    private int getLinha() {
        return tableEspecialidadescadastradas.getSelectedRow();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        scrollTable = new javax.swing.JScrollPane();
        tableEspecialidadescadastradas = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 232, 232));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        setForeground(new java.awt.Color(0, 102, 255));
        setPreferredSize(new java.awt.Dimension(980, 370));
        setLayout(null);

        tableEspecialidadescadastradas.setBackground(new java.awt.Color(255, 255, 255));
        tableEspecialidadescadastradas.setForeground(new java.awt.Color(0, 0, 0));
        tableEspecialidadescadastradas.setModel(new javax.swing.table.DefaultTableModel(
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
        tableEspecialidadescadastradas.setColumnSelectionAllowed(false);
        tableEspecialidadescadastradas.getTableHeader().setReorderingAllowed(false);
        scrollTable.setViewportView(tableEspecialidadescadastradas);

        add(scrollTable);
        scrollTable.setBounds(20, 30, 940, 280);

        buttonDeletar.setBackground(new java.awt.Color(255, 255, 255));
        buttonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/deletar.png"))); // NOI18N
        buttonDeletar.setToolTipText("Deletar Especialidades");
        buttonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeletarActionPerformed(evt);
            }
        });
        add(buttonDeletar);
        buttonDeletar.setBounds(790, 320, 40, 40);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/editar.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar Especialidades");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
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
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        if (getLinha() != -1){
            excluirEspecialidadeSelecionada();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Nenhuma especialidade selecionada!", 
                    "Excluindo Especialidade", 
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void excluirEspecialidadeSelecionada () {
        
        int resposta = JOptionPane.showConfirmDialog(this, 
                "Essa especialidade será excluida.\nVocê tem certeza?", 
                "Excluindo Especialidade", JOptionPane.NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null);
        
        if (resposta == 0){
        EspecialidadeDAO.excluirEspecialidade(getCodigo());
        preencherTabela();
        }
    }
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
        if(getLinha() != -1){
            editarEspecialidadeSelecionada();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Nenhuma especialidade selecionada!", 
                    "Editando Especialidade", 
                    JOptionPane.WARNING_MESSAGE, null);
        }
       
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void editarEspecialidadeSelecionada(){
        
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadeDialog especialidadeDialog = 
                new EspecialidadeDialog(null,
                        true,
                        EspecialidadeDAO.getEspecialidade(getCodigo()));
        especialidadeDialog.setVisible(true);
        preencherTabela();
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        
        EspecialidadeDialog especialidadeDialog = new EspecialidadeDialog(null, true);
        especialidadeDialog.setVisible(true);
        preencherTabela();
        
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private Integer getCodigo(){
        String codigoStr = tableEspecialidadescadastradas.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tableEspecialidadescadastradas;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        tableEspecialidadescadastradas.setModel(EspecialidadeDAO.getEspecialidadesModel());
        ajustarTabela();
    }
    
    private void ajustarTabela(){
        
        tableEspecialidadescadastradas.getTableHeader().setReorderingAllowed(false);
        
        tableEspecialidadescadastradas.setDefaultEditor(Object.class, null);
        
        tableEspecialidadescadastradas.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidadescadastradas.getColumnModel().getColumn(0).setPreferredWidth(60);
        tableEspecialidadescadastradas.getColumnModel().getColumn(1).setPreferredWidth(350);
        tableEspecialidadescadastradas.getColumnModel().getColumn(2).setPreferredWidth(527);
        
    }

}
