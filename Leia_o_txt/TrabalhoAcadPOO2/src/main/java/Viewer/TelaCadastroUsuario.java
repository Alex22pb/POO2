/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Viewer;

import DOMAIN.Usuario;
import GERENCIADOR.FuncaoAjuda;
import GERENCIADOR.GerenciadorIG;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaCadastroUsuario extends javax.swing.JDialog {

    private Usuario user;
    private List<Usuario> listaUser = new ArrayList<>();
    
    public TelaCadastroUsuario(java.awt.Frame parent, boolean modal, GerenciadorIG newGerenIG) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        buttonCadastrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        labelCPF = new javax.swing.JLabel();
        cpfFormatted = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        telefoneFormated = new javax.swing.JFormattedTextField();
        labelNome = new javax.swing.JLabel();
        labelNasc = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        dateNasc = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Novo Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        labelUsuario.setText("E-mail ou Username:");

        labelSenha.setText("Senha:");

        buttonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-ok-16.png"))); // NOI18N
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-cancelar-16.png"))); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        labelCPF.setText("CPF: ");

        try {
            cpfFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelTelefone.setText("Telefone:");

        try {
            telefoneFormated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelNome.setText("Nome:");

        labelNasc.setText("Data Nascimento:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-vassoura-16.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNasc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(buttonCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1)
                                    .addGap(15, 15, 15))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(telefoneFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCancelar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(labelUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuario)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNasc)
                    .addComponent(dateNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(cpfFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneFormated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonCancelar)
                    .addComponent(jButton1))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        buttonCancelar.addActionListener(e -> dispose());
        // ao clicar no botão cancelar fecha a tela, não se essa será uma maneira correta de se fazer isso, pedi ajuda para o chatGPT
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        String nome = txtNome.getText();
        Date dataNascimento = dateNasc.getDate();
        String cpf = cpfFormatted.getText();
        String userName = txtUsername.getText();
        String telefone = telefoneFormated.getText();
        String senha = txtSenha.getText();

        if (GerenciadorIG.getMyInstance().getGerDom().pesqusiarUsuario(userName, senha)) {
            JOptionPane.showMessageDialog(null, "E-mail ou username já cadastrado.", "Tela de Cadastro Usuário", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (validarCampos()) {

                user = GerenciadorIG.getMyInstance().getGerDom().inserirUsuario(nome, dataNascimento, cpf, telefone, userName, senha);

                JOptionPane.showMessageDialog(this, "Usuário " + user.getIdUsuario() + " inserido com sucesso.", "Cadastro de Usuário", JOptionPane.INFORMATION_MESSAGE);

                limparEscolha();
            }
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparEscolha();
        setarCoresErro();
    }//GEN-LAST:event_jButton1ActionPerformed

     private boolean validarCampos(){
        String mensgErro = "";
        Date dataNas = dateNasc.getDate();
        String numberTelefone = telefoneFormated.getText().replaceAll("[ .()/ -]", "");
        
        if(txtNome.getText().isEmpty()){
            mensgErro = mensgErro + "Digite um nome válido\n";
            labelNome.setForeground(Color.red);
        }
        
        if(txtUsername.getText().isEmpty()){
            mensgErro = mensgErro + "Digite um nome de usuário válido\n";
            labelUsuario.setForeground(Color.red);
        }
        
         if(txtSenha.getText().isEmpty()){
            mensgErro = mensgErro + "Digite um nome de usuário válido\n";
            labelSenha.setForeground(Color.red);
        }
        
         if(dataNas == null){
            mensgErro = mensgErro + "Digite uma data de nascimento válido\n";
            labelNasc.setForeground(Color.red);
        }
        
        if(FuncaoAjuda.isCPF(cpfFormatted.getText()) == false){
            mensgErro = mensgErro + "Digite um CPF válido\n";
            labelCPF.setForeground(Color.red);
        }       
        
        if(numberTelefone.isEmpty()){
            mensgErro = mensgErro + "Digite um telefone válido\n";
            labelTelefone.setForeground(Color.red);
        }
                
        if(mensgErro.isEmpty()){
            setarCoresErro();
            return true;
        }else{
            JOptionPane.showMessageDialog(this, mensgErro, "Cadastro de aluno", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
     
     private void setarCoresErro(){
        labelNome.setForeground(Color.black);
        labelTelefone.setForeground(Color.black);
        labelUsuario.setForeground(Color.black);
        labelSenha.setForeground(Color.black);
        labelCPF.setForeground(Color.black);
        labelNasc.setForeground(Color.black);
    }
     
     
     private void limparEscolha(){
        txtNome.setText("");
        txtSenha.setText("");
        txtUsername.setText("");
        cpfFormatted.setText("");
        telefoneFormated.setText("");
        dateNasc.setDate(null);
    }
    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JFormattedTextField cpfFormatted;
    private com.toedter.calendar.JDateChooser dateNasc;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelNasc;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JFormattedTextField telefoneFormated;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
