
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

public class PlanoSaudePanel extends javax.swing.JPanel {

    private int linha;

    public PlanoSaudePanel() {
        initComponents();
        PlanoSaudeDAO.criarListaDePlanos();
        preencherTabelaPlanos();
    }
    
    private int getLinha() {
        return tablePlanosCadastrados.getSelectedRow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanosDeSaude = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        tablePlanosCadastrados = new javax.swing.JTable();
        buttonDeletar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        PlanosDeSaude.setBackground(new java.awt.Color(232, 232, 232));
        PlanosDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        PlanosDeSaude.setForeground(new java.awt.Color(0, 102, 255));
        PlanosDeSaude.setPreferredSize(new java.awt.Dimension(980, 370));
        PlanosDeSaude.setLayout(null);

        tablePlanosCadastrados.setBackground(new java.awt.Color(255, 255, 255));
        tablePlanosCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        tablePlanosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePlanosCadastrados.getTableHeader().setReorderingAllowed(false);
        scrollTable.setViewportView(tablePlanosCadastrados);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 981, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PlanosDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PlanosDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Integer getCodigo(){
        String codigoStr = tablePlanosCadastrados.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    } 
    
    private void buttonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeletarActionPerformed
        if (getLinha() != -1){
            excluirPlanoSelecionado();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Nenhum plano selecionado!", 
                    "Excluindo Plano de Saúde", 
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }//GEN-LAST:event_buttonDeletarActionPerformed

    private void excluirPlanoSelecionado () {
        
        int resposta = JOptionPane.showConfirmDialog(this, 
                "Esse Plano de Saúde será excluido.\nVocê tem certeza?", 
                "Excluindo Plano de Saúde", JOptionPane.NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null);
        
        
        if (resposta == 0){
            PlanoSaudeDAO.excluirPlano(getCodigo());
            preencherTabelaPlanos();
        }
    }
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if(getLinha() != -1){
            editarplanoSelecionado();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Nenhum plano selecionado!", 
                    "Editando Plano de Saúde", 
                    JOptionPane.WARNING_MESSAGE, null);
        }       
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void editarplanoSelecionado(){
        
        PlanoSaude planoSaude = PlanoSaudeDAO.getPlanosDeSaude(getCodigo());
        
        PlanoSaudeDialog planoDialog = 
                new PlanoSaudeDialog(null,
                        true,
                        planoSaude, OperacaoEnum.EDITAR);
        planoDialog.setVisible(true);
        preencherTabelaPlanos();
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        PlanoSaudeDialog planoDialog = new PlanoSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDialog.setVisible(true);
        preencherTabelaPlanos();        
    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanosDeSaude;
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonDeletar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tablePlanosCadastrados;
    // End of variables declaration//GEN-END:variables
    
    private void preencherTabelaPlanos() {
        tablePlanosCadastrados.setModel(PlanoSaudeDAO.getPlanoSaudeModel());
        ajustarTabelaPlanos();
    }
    
    private void ajustarTabelaPlanos(){
        
        tablePlanosCadastrados.getTableHeader().setReorderingAllowed(false);
        
        tablePlanosCadastrados.setDefaultEditor(Object.class, null);
        
        tablePlanosCadastrados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanosCadastrados.getColumnModel().getColumn(0).setPreferredWidth(60);
        tablePlanosCadastrados.getColumnModel().getColumn(1).setPreferredWidth(140);
        tablePlanosCadastrados.getColumnModel().getColumn(2).setPreferredWidth(150);
        tablePlanosCadastrados.getColumnModel().getColumn(3).setPreferredWidth(127);
        tablePlanosCadastrados.getColumnModel().getColumn(4).setPreferredWidth(97);
        
    }
}
