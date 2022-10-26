package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282201
 */
public class EspecialidadeDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        especialidade = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelAdicionarEspecialidade = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        labelNomeEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoEspecialidade = new javax.swing.JTextField();
        labelDescricaoEspecialidade = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Especialidades");
        setPreferredSize(new java.awt.Dimension(650, 440));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 440));
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 255));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        labelTitle.setText(" Adicionar - ESPECIALIDADES");
        panelHeader.add(labelTitle);
        labelTitle.setBounds(20, 10, 610, 40);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 650, 60);

        panelMain.setBackground(new java.awt.Color(248, 248, 248));
        panelMain.setLayout(null);

        panelAdicionarEspecialidade.setBackground(new java.awt.Color(232, 232, 232));
        panelAdicionarEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        panelAdicionarEspecialidade.setLayout(null);

        labelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        panelAdicionarEspecialidade.add(labelCodigo);
        labelCodigo.setBounds(40, 80, 80, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelAdicionarEspecialidade.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 100, 80, 22);

        textFieldNomeEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNomeEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldNomeEspecialidade);
        textFieldNomeEspecialidade.setBounds(40, 160, 300, 22);

        labelNomeEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeEspecialidade.setText("Nome da Especialidade:");
        panelAdicionarEspecialidade.add(labelNomeEspecialidade);
        labelNomeEspecialidade.setBounds(40, 140, 300, 16);

        textFieldDescricaoEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDescricaoEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldDescricaoEspecialidade);
        textFieldDescricaoEspecialidade.setBounds(40, 220, 530, 22);

        labelDescricaoEspecialidade.setForeground(new java.awt.Color(0, 0, 0));
        labelDescricaoEspecialidade.setText("Descrição da Especialidade:");
        panelAdicionarEspecialidade.add(labelDescricaoEspecialidade);
        labelDescricaoEspecialidade.setBounds(40, 200, 530, 16);

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/cancelar.png"))); // NOI18N
        buttonCancel.setToolTipText("Cancelar");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        panelAdicionarEspecialidade.add(buttonCancel);
        buttonCancel.setBounds(500, 310, 40, 40);

        buttonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Especialidade");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelAdicionarEspecialidade.add(buttonSalvar);
        buttonSalvar.setBounds(560, 310, 40, 40);

        panelMain.add(panelAdicionarEspecialidade);
        panelAdicionarEspecialidade.setBounds(10, 10, 630, 360);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 60, 650, 410);

        setSize(new java.awt.Dimension(665, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherFormulario() {

        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoEspecialidade.setText(especialidade.getDescricao());

    }

    private void preencherTitulo() {
        setTitle(operacao + " Especialidades");
        labelTitle.setText(operacao + " - ESPECIALIDADES");

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

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (textFieldNomeEspecialidade.getText().isBlank() == true || textFieldDescricaoEspecialidade.getText().isBlank() == true) {
            JOptionPane.showMessageDialog(null, "Há algum campo vazio!\nPreencha todos!", operacao + " - Especialidades", JOptionPane.WARNING_MESSAGE, null);
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
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoEspecialidade.
                getText());

        //Gravar o objeto, através do DAO
        EspecialidadeDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(this,
                "Especialidade Gravada com Sucesso!",
                "Especialidades - Adicionar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }

    private void editar() {
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoEspecialidade.
                getText());

        EspecialidadeDAO.atualizar(especialidade);

        JOptionPane.showMessageDialog(this,
                "Especialidade Editada com Sucesso!",
                "Especialidades - Editar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoEspecialidade;
    private javax.swing.JLabel labelNomeEspecialidade;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelAdicionarEspecialidade;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoEspecialidade;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
