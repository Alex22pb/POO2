/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import Viewer.TelaCadastroAluno;
import Viewer.TelaCadastroFicha;
import Viewer.TelaCadastroUsuario;
import Viewer.TelaLogin;
import Viewer.TelaPesquisar;
import Viewer.TelaPrincipal;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GerenciadorIG {
    private TelaLogin telaInicio = null;
    private TelaPrincipal telaPrincipal= null;
    private TelaCadastroAluno telaAluno = null;
    private TelaCadastroFicha telaFicha = null;
    private TelaPesquisar telaPesquisa = null;
    private TelaCadastroUsuario telaUsuario = null;

    public GerenciadorIG() {
    
    }
    
    private JDialog abrirJanelaDlg(java.awt.Frame parent, JDialog dlg, Class classe){
        if(dlg == null){
            try{
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerenciadorIG.class).newInstance(parent, true, this);
            }catch(NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }
    
    public void abrirTelaLogin(){
        if(telaInicio == null){ 
            telaInicio = new TelaLogin(this);
        }
        telaInicio.setVisible(true);
    }
    
    public void abrirTelaPrincipal(){
        if(telaPrincipal == null){
            telaPrincipal = new TelaPrincipal(this);
        }
        telaPrincipal.setVisible(true);
        telaInicio.setVisible(false);
    }
    
    public void abrirTelaCadastroAluno(){
        abrirJanelaDlg(telaPrincipal, telaAluno, TelaCadastroAluno.class);
    }
    
    public void abrirTelaCadastroFicha(){
        abrirJanelaDlg(telaPrincipal, telaFicha, TelaCadastroFicha.class);
    }
    
    public void abrirTelaPesquisar(){
        abrirJanelaDlg(telaPrincipal, telaPesquisa, TelaPesquisar.class);
    }
    
    public void abrirTelaUsuario(){
        abrirJanelaDlg(telaInicio, telaUsuario, TelaCadastroUsuario.class);
    }
    
    
    public boolean verificarUsuarioSenha(String usuario, String senha) {
        if (usuario.equals("admin") && senha.equals("admin")) {
            return true;
        } else {
            return false;
        }
        //A ideia e melhorar isso, criar um banco de dados para cadastrar usuários que podem acessar o sistema
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        GerenciadorIG gerenciarInterface = new GerenciadorIG();
        gerenciarInterface.abrirTelaLogin();
    }
}
