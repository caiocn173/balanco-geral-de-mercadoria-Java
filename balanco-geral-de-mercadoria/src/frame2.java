import java.awt.Color;
import javax.swing.JOptionPane;
import teste.atri;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class frame2 extends javax.swing.JFrame{

    /**
     * Creates new form frame2
     */
    public frame2() {
        initComponents();
        bt_entrar.setBackground(Color.blue);
        bt_voltar.setBackground(Color.blue);
    }
    
    atri at = new atri();
    cadastro cad = new cadastro();
    String user = at.getUsuario();
    String pass = at.getSenha();
    String tipo = atri.getTipo();
    
    public boolean verifyFields()
    {
        String usuario2 = txt_usuario.getText();
        String senha = String.valueOf(txt_senha.getPassword());
        
         if(usuario2.equals(user) && senha.equals(pass)){
             
                 JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Login",1);
             
                if(tipo.equals("Administrador")){
                   principal tela1 = new principal();
                   tela1.setLocationRelativeTo(null);
                   tela1.setVisible(true);
                   this.dispose();
               } else if(tipo.equals("Usuário")){
                   principal2 tela2 = new principal2();
                   tela2.setLocationRelativeTo(null);
                   tela2.setVisible(true);
                   this.dispose();
               }
                } else if(usuario2.trim().equals("") || senha.trim().equals("")) {
                  
                    JOptionPane.showMessageDialog(null, "Um ou mais campos estão vazios","Campos Vazios",2);
               
                   } else{
                    
            JOptionPane.showMessageDialog(null, "Dados não conferem", "Login",2);
            
        }
        return true;
    }
      
    
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        bt_entrar = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Balanço Geral de Mercadoria");
        setPreferredSize(new java.awt.Dimension(605, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(null);

        lbl_usuario.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Nome de Usuário:");
        jPanel1.add(lbl_usuario);
        lbl_usuario.setBounds(30, 90, 320, 44);

        titulo.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Insira suas credenciais:");
        jPanel1.add(titulo);
        titulo.setBounds(30, 10, 430, 60);
        jPanel1.add(txt_usuario);
        txt_usuario.setBounds(30, 150, 500, 30);

        lbl_senha.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_senha.setText("Senha:");
        jPanel1.add(lbl_senha);
        lbl_senha.setBounds(30, 210, 310, 50);
        jPanel1.add(txt_senha);
        txt_senha.setBounds(30, 270, 500, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Não possui cadastro? Clique aqui!");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 320, 390, 30);

        bt_entrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_entrar.setText("ENTRAR");
        bt_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_entrar);
        bt_entrar.setBounds(150, 400, 300, 70);

        bt_voltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 255, 255));
        bt_voltar.setText("VOLTAR");
        bt_voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(bt_voltar);
        bt_voltar.setBounds(150, 490, 300, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(Color.BLUE);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cadastro tela3 = new cadastro();
        tela3.setLocationRelativeTo(null);
        tela3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
        verifyFields();
    }//GEN-LAST:event_bt_entrarActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        Sistema tela1 = new Sistema();
        tela1.setLocationRelativeTo(null);
        tela1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_entrar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}