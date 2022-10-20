package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoSaude;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class PlanoSaudeDialog extends javax.swing.JDialog {

    private PlanoSaude planoSaude;
    private OperacaoEnum operacao;

    public PlanoSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public PlanoSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoSaude e,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        planoSaude = e;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();

    }
    
    private void preencherTitulo(){
        setTitle(operacao + " Planos de Saúde");
        labelTitle.setText(operacao + " - PLANOS DE SAÚDE");
        
        if (operacao == OperacaoEnum.EDITAR){
            setIconImage(Toolkit.getDefaultToolkit().
                    getImage(getClass().
                    getResource("/br/senai/sp/jandira/images/editar.png")));
            labelTitle.setIcon(new javax.swing.
                    ImageIcon(getClass().
                    getResource("/br/senai/sp/jandira/images/editar.png")));
        } else {
            setIconImage(Toolkit.
                    getDefaultToolkit().
                    getImage(getClass().
                    getResource("/br/senai/sp/jandira/images/adicionar."
                    + "png")));
            labelTitle.setIcon(new javax.swing.
                    ImageIcon(getClass().
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
        panelAdicionarEspecialidade = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldOperadora = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textFieldCategoria = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelNumero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textFieldValidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        labelTitle.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 255));
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/adicionar.png"))); // NOI18N
        labelTitle.setText(" Adicionar - PLANOS DE SAÚDE");
        panelHeader.add(labelTitle);
        labelTitle.setBounds(20, 10, 610, 40);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 650, 60);

        panelMain.setBackground(new java.awt.Color(248, 248, 248));
        panelMain.setLayout(null);

        panelAdicionarEspecialidade.setBackground(new java.awt.Color(232, 232, 232));
        panelAdicionarEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 102, 204))); // NOI18N
        panelAdicionarEspecialidade.setLayout(null);

        labelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        labelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        labelCodigo.setText("Código:");
        panelAdicionarEspecialidade.add(labelCodigo);
        labelCodigo.setBounds(40, 30, 80, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelAdicionarEspecialidade.add(textFieldCodigo);
        textFieldCodigo.setBounds(40, 50, 50, 22);

        textFieldOperadora.setBackground(new java.awt.Color(255, 255, 255));
        textFieldOperadora.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldOperadora);
        textFieldOperadora.setBounds(40, 100, 300, 22);

        labelOperadora.setForeground(new java.awt.Color(0, 0, 0));
        labelOperadora.setText("Operadora do Plano");
        panelAdicionarEspecialidade.add(labelOperadora);
        labelOperadora.setBounds(40, 80, 300, 16);

        textFieldCategoria.setBackground(new java.awt.Color(255, 255, 255));
        textFieldCategoria.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldCategoria);
        textFieldCategoria.setBounds(40, 150, 530, 22);

        labelCategoria.setForeground(new java.awt.Color(0, 0, 0));
        labelCategoria.setText("Categoria do Plano");
        panelAdicionarEspecialidade.add(labelCategoria);
        labelCategoria.setBounds(40, 130, 530, 16);

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

        labelNumero.setForeground(new java.awt.Color(0, 0, 0));
        labelNumero.setText("Número do Plano");
        panelAdicionarEspecialidade.add(labelNumero);
        labelNumero.setBounds(40, 180, 530, 16);

        textFieldNumero.setBackground(new java.awt.Color(255, 255, 255));
        textFieldNumero.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldNumero);
        textFieldNumero.setBounds(40, 200, 530, 22);

        labelValidade.setForeground(new java.awt.Color(0, 0, 0));
        labelValidade.setText("Validade");
        panelAdicionarEspecialidade.add(labelValidade);
        labelValidade.setBounds(40, 230, 530, 16);

        textFieldValidade.setBackground(new java.awt.Color(255, 255, 255));
        textFieldValidade.setForeground(new java.awt.Color(0, 0, 0));
        panelAdicionarEspecialidade.add(textFieldValidade);
        textFieldValidade.setBounds(40, 250, 530, 22);

        panelMain.add(panelAdicionarEspecialidade);
        panelAdicionarEspecialidade.setBounds(10, 10, 630, 360);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 60, 650, 410);

        setSize(new java.awt.Dimension(665, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherFormulario(){
        
        textFieldCodigo.setText(planoSaude.getCodigo().toString());
        textFieldOperadora.setText(planoSaude.getOperadora());
        textFieldCategoria.setText(planoSaude.getCategoria());
        textFieldNumero.setText(planoSaude.getCategoria());
        textFieldValidade.setText(planoSaude.getCategoria());
        
    }
    
    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed

    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void adicionar(){
        //Criar objeto especialidade
        PlanoSaude novoPlano = new PlanoSaude();
        novoPlano.setOperadora(textFieldOperadora.getText());
        novoPlano.setCategoria(textFieldCategoria.getText());
        novoPlano.setNumero(textFieldNumero.getText());
        novoPlano.setNumero(textFieldValidade.getText());

        //Gravar o objeto, através do DAO
        PlanoSaudeDAO.gravar(novoPlano);

        JOptionPane.showMessageDialog(this,
                "Plano Gravado com Sucesso!",
                "Plano de Saúde - Adicionar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }
    
    private void editar(){
        planoSaude.setOperadora(textFieldOperadora.getText());
        planoSaude.setCategoria(textFieldCategoria.getText());
        planoSaude.setNumero(textFieldNumero.getText());
        planoSaude.setNumero(textFieldValidade.getText());
        
        PlanoSaudeDAO.atualizar(planoSaude);
        
        JOptionPane.showMessageDialog(this,
                "Plano Editade com Sucesso!",
                "Plano de Saúde - Editar",
                JOptionPane.INFORMATION_MESSAGE, null);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelAdicionarEspecialidade;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldOperadora;
    private javax.swing.JTextField textFieldValidade;
    // End of variables declaration//GEN-END:variables
}
