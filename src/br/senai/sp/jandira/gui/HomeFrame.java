package br.senai.sp.jandira.gui;

import static br.senai.sp.jandira.dao.EspecialidadeDAO.criarListaDeEspecialidades;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadesPanel panelEspecialidades;
    private PlanoSaudePanel panelPlanoSaude;
    private PacientePanel panelPaciente;
    
    private final int DIMENSION_X = 10;
    private final int DIMENSION_Y = 70;
    private final int WIDTH = 980;
    private final int HEIGHT = 370;
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/images/agenda.png")));
        criarListaDeEspecialidades();
        initPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelMain = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        labelAGECON = new javax.swing.JLabel();
        labelAGECONSub = new javax.swing.JLabel();
        labelAgendaAGECON = new javax.swing.JLabel();
        Linha = new javax.swing.JPanel();
        labelSite = new javax.swing.JLabel();
        labelSuporte = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonPaciente = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoSaude = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        panelMain.setBackground(new java.awt.Color(248, 248, 248));
        panelMain.setLayout(null);

        panelHome.setBackground(new java.awt.Color(232, 232, 232));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(0, 102, 255));
        panelHome.setLayout(null);

        labelAGECON.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelAGECON.setForeground(new java.awt.Color(0, 0, 255));
        labelAGECON.setText("AGECON");
        panelHome.add(labelAGECON);
        labelAGECON.setBounds(20, 10, 530, 60);

        labelAGECONSub.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        labelAGECONSub.setForeground(new java.awt.Color(51, 51, 51));
        labelAGECONSub.setText("Agenda de Consultas");
        panelHome.add(labelAGECONSub);
        labelAGECONSub.setBounds(50, 60, 660, 20);

        labelAgendaAGECON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/agenda.png"))); // NOI18N
        panelHome.add(labelAgendaAGECON);
        labelAgendaAGECON.setBounds(220, 10, 60, 70);

        Linha.setBackground(new java.awt.Color(0, 0, 0));
        panelHome.add(Linha);
        Linha.setBounds(0, 90, 978, 1);

        labelSite.setBackground(new java.awt.Color(0, 0, 0));
        labelSite.setForeground(new java.awt.Color(0, 0, 0));
        labelSite.setText("www.agecon.com.br");
        panelHome.add(labelSite);
        labelSite.setBounds(20, 220, 570, 30);

        labelSuporte.setBackground(new java.awt.Color(0, 0, 0));
        labelSuporte.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        labelSuporte.setForeground(new java.awt.Color(0, 0, 0));
        labelSuporte.setText("Suporte Técnico");
        panelHome.add(labelSuporte);
        labelSuporte.setBounds(20, 150, 590, 30);

        labelEmail.setBackground(new java.awt.Color(0, 0, 0));
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email - suporte@gmail.com");
        panelHome.add(labelEmail);
        labelEmail.setBounds(20, 180, 540, 30);

        labelTelefone.setBackground(new java.awt.Color(0, 0, 0));
        labelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labelTelefone.setText("Telefone - 11 90909-9090");
        panelHome.add(labelTelefone);
        labelTelefone.setBounds(20, 200, 450, 30);

        panelMain.add(panelHome);
        panelHome.setBounds(10, 70, 980, 370);

        buttonSair.setBackground(new java.awt.Color(204, 255, 255));
        buttonSair.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(51, 51, 51));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/sair.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        panelMain.add(buttonSair);
        buttonSair.setBounds(870, 30, 100, 30);

        buttonHome.setBackground(new java.awt.Color(51, 255, 255));
        buttonHome.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonHome.setForeground(new java.awt.Color(51, 51, 51));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/home.png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.setToolTipText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        panelMain.add(buttonHome);
        buttonHome.setBounds(10, 30, 110, 30);

        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonPaciente.setForeground(new java.awt.Color(51, 51, 51));
        buttonPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/paciente.png"))); // NOI18N
        buttonPaciente.setText("Paciente");
        buttonPaciente.setToolTipText("Pacientes");
        buttonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacienteActionPerformed(evt);
            }
        });
        panelMain.add(buttonPaciente);
        buttonPaciente.setBounds(250, 30, 110, 30);

        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonMedicos.setForeground(new java.awt.Color(51, 51, 51));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/medicos.png"))); // NOI18N
        buttonMedicos.setText("Médicos");
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        panelMain.add(buttonMedicos);
        buttonMedicos.setBounds(370, 30, 110, 30);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonEspecialidades.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonEspecialidades.setForeground(new java.awt.Color(51, 51, 51));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/especialidades.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        panelMain.add(buttonEspecialidades);
        buttonEspecialidades.setBounds(490, 30, 160, 30);

        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonPlanoSaude.setForeground(new java.awt.Color(51, 51, 51));
        buttonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/planodesaude.png"))); // NOI18N
        buttonPlanoSaude.setText("Plano de Saúde");
        buttonPlanoSaude.setToolTipText("Planos de saúde");
        buttonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoSaudeActionPerformed(evt);
            }
        });
        panelMain.add(buttonPlanoSaude);
        buttonPlanoSaude.setBounds(660, 30, 170, 30);

        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonAgenda1.setForeground(new java.awt.Color(51, 51, 51));
        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/agenda(1).png"))); // NOI18N
        buttonAgenda1.setText("Agenda");
        buttonAgenda1.setToolTipText("Agendamentos");
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        panelMain.add(buttonAgenda1);
        buttonAgenda1.setBounds(130, 30, 110, 30);

        getContentPane().add(panelMain);
        panelMain.setBounds(0, 90, 1000, 490);

        panelHeader.setBackground(new java.awt.Color(102, 204, 255));
        panelHeader.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 255));
        labelTitulo.setText("Agenda de Consultas");
        panelHeader.add(labelTitulo);
        labelTitulo.setBounds(90, 20, 630, 50);

        labelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/images/agenda.png"))); // NOI18N
        panelHeader.add(labelAgenda);
        labelAgenda.setBounds(20, 10, 60, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1000, 90);

        setSize(new java.awt.Dimension(1014, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoSaudeActionPerformed
        buttonHome.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(51, 255, 255));
        
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanoSaude.setVisible(true);
        panelPaciente.setVisible(false);
    }//GEN-LAST:event_buttonPlanoSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(51, 255, 255));
        buttonHome.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(true);
        panelPlanoSaude.setVisible(false);
        panelPaciente.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonHome.setBackground(new java.awt.Color(51, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        
        panelHome.setVisible(true);
        panelEspecialidades.setVisible(false);
        panelPlanoSaude.setVisible(false);
        panelPaciente.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        buttonHome.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(51, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanoSaude.setVisible(false);
        panelPaciente.setVisible(false);
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

    private void buttonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacienteActionPerformed
        buttonHome.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(51, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(204, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanoSaude.setVisible(false);
        panelPaciente.setVisible(true);
    }//GEN-LAST:event_buttonPacienteActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        buttonHome.setBackground(new java.awt.Color(204, 255, 255));
        buttonAgenda1.setBackground(new java.awt.Color(204, 255, 255));
        buttonPaciente.setBackground(new java.awt.Color(204, 255, 255));
        buttonMedicos.setBackground(new java.awt.Color(51, 255, 255));
        buttonEspecialidades.setBackground(new java.awt.Color(204, 255, 255));
        buttonPlanoSaude.setBackground(new java.awt.Color(204, 255, 255));
        
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanoSaude.setVisible(false);
        panelPaciente.setVisible(false);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Linha;
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPaciente;
    private javax.swing.JButton buttonPlanoSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelAGECON;
    private javax.swing.JLabel labelAGECONSub;
    private javax.swing.JLabel labelAgenda;
    private javax.swing.JLabel labelAgendaAGECON;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelSuporte;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        panelEspecialidades = new EspecialidadesPanel();
        panelEspecialidades.setBounds(DIMENSION_X, DIMENSION_Y, WIDTH, HEIGHT);
        panelEspecialidades.setVisible(false);
        panelMain.add(panelEspecialidades);
        
        panelPlanoSaude = new PlanoSaudePanel();
        panelPlanoSaude.setBounds(DIMENSION_X, DIMENSION_Y, WIDTH, HEIGHT);
        panelPlanoSaude.setVisible(false);
        panelMain.add(panelPlanoSaude);
        
        panelPaciente = new PacientePanel();
        panelPaciente.setBounds(DIMENSION_X, DIMENSION_Y, WIDTH, HEIGHT);
        panelPaciente.setVisible(false);
        panelMain.add(panelPaciente);
        
    }
}
