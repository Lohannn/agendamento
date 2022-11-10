
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoSaude;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;

public class PacienteDialog extends javax.swing.JDialog {
    
    private Paciente paciente;
    private OperacaoEnum operacao;

    public PacienteDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
    
    public PacienteDialog(
            java.awt.Frame parent,
            boolean modal,
            Paciente e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        paciente = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();

    }
    
    private void preencherTitulo() {
        setTitle(operacao + " Pacientes");
        labelTitle.setText(operacao + " - PACIENTES");

        if (operacao == OperacaoEnum.EDITAR) {
            setIconImage(Toolkit.getDefaultToolkit().
                    getImage(getClass().
                            getResource("/br/senai/sp/jandira/images/editar.png")));
            labelTitle.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/br/senai/sp/jandira/images/editar.png")));
        } else {
            setIconImage(Toolkit.
                    getDefaultToolkit().
                    getImage(getClass().
                            getResource("/br/senai/sp/jandira/images/adicionar."
                                    + "png")));
            labelTitle.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/br/senai/sp/jandira/images/adicionar."
                            + "png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelAdicionarPacientes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomePaciente = new javax.swing.JTextField();
        labelNomePaciente = new javax.swing.JLabel();
        textFieldEndereco = new javax.swing.JTextField();
        labelPlanoSaude = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelCPF = new javax.swing.JLabel();
        comboPlanoSaude = new javax.swing.JComboBox<>();
        labelEndereco = new javax.swing.JLabel();
        fTextFieldCPF = new javax.swing.JFormattedTextField();
        labelDataNascimento = new javax.swing.JLabel();
        fTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        fTextFieldTelefone = new javax.swing.JFormattedTextField();
        labelRG = new javax.swing.JLabel();
        fTextFieldRG = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 255));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        labelTitle.setText(" Adicionar - PACIENTES");
        panelHeader.add(labelTitle);
        labelTitle.setBounds(20, 10, 610, 40);

        panelMain.setBackground(new java.awt.Color(248, 248, 248));
        panelMain.setLayout(null);

        panelAdicionarPacientes.setBackground(new java.awt.Color(232, 232, 232));
        panelAdicionarPacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        panelAdicionarPacientes.setLayout(null);

        labelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        panelAdicionarPacientes.add(labelCodigo);
        labelCodigo.setBounds(40, 20, 80, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 40, 50, 22);

        textFieldNomePaciente.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomePaciente.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarPacientes.add(textFieldNomePaciente);
        textFieldNomePaciente.setBounds(40, 90, 300, 22);

        labelNomePaciente.setForeground(new java.awt.Color(0, 0, 0));
        labelNomePaciente.setText("Nome do Paciente:");
        panelAdicionarPacientes.add(labelNomePaciente);
        labelNomePaciente.setBounds(40, 70, 300, 16);

        textFieldEndereco.setBackground(new java.awt.Color(255, 255, 255));
        textFieldEndereco.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarPacientes.add(textFieldEndereco);
        textFieldEndereco.setBounds(40, 140, 530, 22);

        labelPlanoSaude.setForeground(new java.awt.Color(0, 0, 0));
        labelPlanoSaude.setText("Plano de Saúde:");
        panelAdicionarPacientes.add(labelPlanoSaude);
        labelPlanoSaude.setBounds(40, 170, 530, 16);

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/cancelar.png"))); // NOI18N
        buttonCancel.setToolTipText("Cancelar");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(buttonCancel);
        buttonCancel.setBounds(500, 310, 40, 40);

        buttonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Especialidade");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(buttonSalvar);
        buttonSalvar.setBounds(560, 310, 40, 40);

        labelCPF.setForeground(new java.awt.Color(0, 0, 0));
        labelCPF.setText("CPF:");
        panelAdicionarPacientes.add(labelCPF);
        labelCPF.setBounds(440, 220, 50, 16);

        comboPlanoSaude.setBackground(new java.awt.Color(255, 255, 255));
        comboPlanoSaude.setForeground(new java.awt.Color(0, 0, 0));
        comboPlanoSaude.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                comboPlanoSaudeComponentAdded(evt);
            }
        });
        panelAdicionarPacientes.add(comboPlanoSaude);
        comboPlanoSaude.setBounds(40, 190, 150, 22);

        labelEndereco.setForeground(new java.awt.Color(0, 0, 0));
        labelEndereco.setText("Endereço:");
        panelAdicionarPacientes.add(labelEndereco);
        labelEndereco.setBounds(40, 120, 530, 16);

        fTextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldCPF.setColumns(8);
        try {
            fTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldCPFActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(fTextFieldCPF);
        fTextFieldCPF.setBounds(440, 240, 130, 22);

        labelDataNascimento.setForeground(new java.awt.Color(0, 0, 0));
        labelDataNascimento.setText("Data de Nascimento:");
        panelAdicionarPacientes.add(labelDataNascimento);
        labelDataNascimento.setBounds(40, 220, 130, 16);

        fTextFieldDataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldDataNascimento.setColumns(8);
        try {
            fTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldDataNascimentoActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(fTextFieldDataNascimento);
        fTextFieldDataNascimento.setBounds(40, 240, 120, 22);

        labelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefone.setText("Telefone:");
        panelAdicionarPacientes.add(labelTelefone);
        labelTelefone.setBounds(170, 220, 120, 16);

        fTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldTelefone.setColumns(8);
        try {
            fTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldTelefoneActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(fTextFieldTelefone);
        fTextFieldTelefone.setBounds(170, 240, 120, 22);

        labelRG.setForeground(new java.awt.Color(0, 0, 0));
        labelRG.setText("RG:");
        panelAdicionarPacientes.add(labelRG);
        labelRG.setBounds(300, 220, 50, 16);

        fTextFieldRG.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldRG.setColumns(8);
        try {
            fTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldRGActionPerformed(evt);
            }
        });
        panelAdicionarPacientes.add(fTextFieldRG);
        fTextFieldRG.setBounds(300, 240, 130, 22);

        panelMain.add(panelAdicionarPacientes);
        panelAdicionarPacientes.setBounds(10, 10, 630, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherFormulario() {

        textFieldCodigo.setText(paciente.getCodigo().toString());
        textFieldEndereco.setText(paciente.getEndereco1());
        textFieldNomePaciente.setText(paciente.getNome());
        fTextFieldDataNascimento.setText(paciente.getNascimentoFormatado());
        fTextFieldTelefone.setText(paciente.getTelefone());
        fTextFieldRG.setText(paciente.getRg());
        fTextFieldCPF.setText(paciente.getCpf());

    }
    
    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void fTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldCPFActionPerformed

    private void fTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldDataNascimentoActionPerformed

    private void fTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldTelefoneActionPerformed

    private void fTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldRGActionPerformed

    private void comboPlanoSaudeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_comboPlanoSaudeComponentAdded

    }//GEN-LAST:event_comboPlanoSaudeComponentAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<PlanoSaude> comboPlanoSaude;
    private javax.swing.JFormattedTextField fTextFieldCPF;
    private javax.swing.JFormattedTextField fTextFieldDataNascimento;
    private javax.swing.JFormattedTextField fTextFieldRG;
    private javax.swing.JFormattedTextField fTextFieldTelefone;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNomePaciente;
    private javax.swing.JLabel labelPlanoSaude;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdicionarPacientes;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNomePaciente;
    // End of variables declaration//GEN-END:variables

}
