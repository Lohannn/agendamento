package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherEspecialidades();
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        medico = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        preencherEspecialidades();

    }

    private void preencherTitulo() {
        setTitle(operacao + " Médico");
        labelTitle.setText(operacao + " - MÉDICOS");

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

    private void preencherFormulario() {

        textFieldCodigo.setText(medico.getCodigo().toString());
        fTextFieldCRM.setText(medico.getCrm());
        textFieldNome.setText(medico.getNome());
        textFieldEmail.setText(medico.getEmail());
        fTextFieldNascimento.setText(medico.getDataFormatada());
        fTextFieldTelefone.setText(medico.getTelefone());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelAdicionarMedico = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCRM = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        buttonMoverParaLista = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelListaMedico = new javax.swing.JLabel();
        labelNascimento = new javax.swing.JLabel();
        fTextFieldCRM = new javax.swing.JFormattedTextField();
        fTextFieldNascimento = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMedico = new javax.swing.JList<>();
        labelTelefone = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonMoverParaMedico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListEspecialidades = new javax.swing.JList<>();
        labelEspecialidades = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        fTextFieldTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 255));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        labelTitle.setText(" Adicionar - MÉDICOS");
        panelHeader.add(labelTitle);
        labelTitle.setBounds(20, 10, 610, 40);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 650, 60);

        panelMain.setBackground(new java.awt.Color(248, 248, 248));
        panelMain.setLayout(null);

        panelAdicionarMedico.setBackground(new java.awt.Color(232, 232, 232));
        panelAdicionarMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        panelAdicionarMedico.setLayout(null);

        labelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        panelAdicionarMedico.add(labelCodigo);
        labelCodigo.setBounds(20, 30, 80, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 50, 50, 22);

        labelCRM.setForeground(new java.awt.Color(0, 0, 0));
        labelCRM.setText("CRM:");
        panelAdicionarMedico.add(labelCRM);
        labelCRM.setBounds(80, 30, 90, 16);

        textFieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        textFieldEmail.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarMedico.add(textFieldEmail);
        textFieldEmail.setBounds(140, 110, 330, 22);

        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setText("Nome:");
        panelAdicionarMedico.add(labelNome);
        labelNome.setBounds(220, 30, 100, 16);

        buttonMoverParaLista.setBackground(new java.awt.Color(255, 0, 0));
        buttonMoverParaLista.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        buttonMoverParaLista.setForeground(new java.awt.Color(255, 255, 255));
        buttonMoverParaLista.setText("<");
        buttonMoverParaLista.setToolTipText("Cancelar");
        buttonMoverParaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverParaListaActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonMoverParaLista);
        buttonMoverParaLista.setBounds(190, 280, 50, 50);

        buttonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Especialidade");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonSalvar);
        buttonSalvar.setBounds(560, 310, 40, 40);

        labelListaMedico.setForeground(new java.awt.Color(0, 0, 0));
        labelListaMedico.setText("Especialidades do Médico:");
        panelAdicionarMedico.add(labelListaMedico);
        labelListaMedico.setBounds(260, 170, 200, 16);

        labelNascimento.setForeground(new java.awt.Color(0, 0, 0));
        labelNascimento.setText("Data de Nascimento:");
        panelAdicionarMedico.add(labelNascimento);
        labelNascimento.setBounds(480, 90, 130, 16);

        fTextFieldCRM.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldCRM.setColumns(12);
        try {
            fTextFieldCRM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldCRMActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(fTextFieldCRM);
        fTextFieldCRM.setBounds(80, 50, 110, 22);

        fTextFieldNascimento.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldNascimento.setColumns(8);
        try {
            fTextFieldNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTextFieldNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldNascimentoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(fTextFieldNascimento);
        fTextFieldNascimento.setBounds(480, 110, 110, 22);

        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("E-Mail:");
        panelAdicionarMedico.add(labelEmail);
        labelEmail.setBounds(140, 90, 90, 16);

        jListMedico.setBackground(new java.awt.Color(255, 255, 255));
        jListMedico.setForeground(new java.awt.Color(0, 0, 0));
        jListMedico.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListMedico);

        panelAdicionarMedico.add(jScrollPane1);
        jScrollPane1.setBounds(260, 190, 150, 146);

        labelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefone.setText("Telefone:");
        panelAdicionarMedico.add(labelTelefone);
        labelTelefone.setBounds(20, 90, 70, 16);

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/cancelar.png"))); // NOI18N
        buttonCancel.setToolTipText("Cancelar");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonCancel);
        buttonCancel.setBounds(500, 310, 40, 40);

        buttonMoverParaMedico.setBackground(new java.awt.Color(0, 204, 51));
        buttonMoverParaMedico.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        buttonMoverParaMedico.setForeground(new java.awt.Color(255, 255, 255));
        buttonMoverParaMedico.setText(">");
        buttonMoverParaMedico.setToolTipText("Cancelar");
        buttonMoverParaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverParaMedicoActionPerformed(evt);
            }
        });
        panelAdicionarMedico.add(buttonMoverParaMedico);
        buttonMoverParaMedico.setBounds(190, 190, 50, 50);

        jListEspecialidades.setBackground(new java.awt.Color(255, 255, 255));
        jListEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jListEspecialidades);

        panelAdicionarMedico.add(jScrollPane2);
        jScrollPane2.setBounds(20, 190, 150, 130);

        labelEspecialidades.setForeground(new java.awt.Color(0, 0, 0));
        labelEspecialidades.setText("Lista de Especialidades:");
        panelAdicionarMedico.add(labelEspecialidades);
        labelEspecialidades.setBounds(20, 170, 190, 16);

        textFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNome.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarMedico.add(textFieldNome);
        textFieldNome.setBounds(220, 50, 370, 22);

        fTextFieldTelefone.setBackground(new java.awt.Color(255, 255, 255));
        fTextFieldTelefone.setColumns(12);
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
        panelAdicionarMedico.add(fTextFieldTelefone);
        fTextFieldTelefone.setBounds(20, 110, 110, 22);

        panelMain.add(panelAdicionarMedico);
        panelAdicionarMedico.setBounds(10, 10, 630, 360);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 60, 650, 410);

        setSize(new java.awt.Dimension(666, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed

    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonMoverParaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverParaListaActionPerformed

    }//GEN-LAST:event_buttonMoverParaListaActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        CharSequence branco = " ";

        if (textFieldNome.getText().isBlank() == true || textFieldEmail.getText().isBlank() == true || fTextFieldCRM.getText().contains(branco) == true || fTextFieldNascimento.getText().contains(branco) == true || fTextFieldTelefone.getText().contains(branco) == true) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio!\nPreencha todos!", operacao + " - Médicos", JOptionPane.WARNING_MESSAGE, null);
        } else {
            if (operacao == OperacaoEnum.ADICIONAR) {
                adicionar();
            } else {
                editar();
            }
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void adicionar() {
        //Criar objeto especialidade
        Medico novoMedico = new Medico();

        novoMedico.setEmail(textFieldEmail.getText());
        novoMedico.setNome(textFieldNome.getText());
        novoMedico.setCrm(fTextFieldCRM.getText());
        novoMedico.setDataFormatada(fTextFieldNascimento.getText());
        novoMedico.setTelefone(fTextFieldTelefone.getText());

        //Gravar o objeto, através do DAO
        MedicoDAO.gravar(novoMedico);

        JOptionPane.showMessageDialog(this,
                "Médico Cadastrado com Sucesso!",
                "Médico - Adicionar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();

    }

    private void editar() {
        medico.setEmail(textFieldEmail.getText());
        medico.setNome(textFieldNome.getText());
        medico.setCrm(fTextFieldCRM.getText());
        medico.setDataFormatada(fTextFieldNascimento.getText());
        medico.setTelefone(fTextFieldTelefone.getText());

        MedicoDAO.atualizar(medico);

        JOptionPane.showMessageDialog(this,
                "Médico Editado com Sucesso!",
                "Médico - Editar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }

    private void preencherEspecialidades() {
        jListEspecialidades.setModel(EspecialidadeDAO.getEspModel());
    }

    private void fTextFieldCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldCRMActionPerformed

    private void fTextFieldNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldNascimentoActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonMoverParaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverParaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMoverParaMedicoActionPerformed

    private void fTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldTelefoneActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonMoverParaLista;
    private javax.swing.JButton buttonMoverParaMedico;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField fTextFieldCRM;
    private javax.swing.JFormattedTextField fTextFieldNascimento;
    private javax.swing.JFormattedTextField fTextFieldTelefone;
    private javax.swing.JList<Especialidade> jListEspecialidades;
    private javax.swing.JList<String> jListMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialidades;
    private javax.swing.JLabel labelListaMedico;
    private javax.swing.JLabel labelNascimento;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdicionarMedico;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    // End of variables declaration//GEN-END:variables
}
