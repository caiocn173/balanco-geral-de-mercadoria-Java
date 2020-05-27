
package teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;






public class atri {
    
    public static String usuario;
    public static String senha;
    public static String tipo;
    public static String cpf;
    public static String email;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        atri.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        atri.senha = senha;
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        atri.tipo = tipo;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        atri.cpf = cpf;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        atri.email = email;
    }
    
    
    
    public void salvar(){
        
        try {
            FileWriter fw = new FileWriter("usuários.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome de usuário: " + this.getUsuario());
            pw.println("Senha: " + this.getSenha());
            pw.println("Tipo de Usuário: " + atri.getTipo());
            pw.println("Email: " + atri.getEmail());
            pw.println("CPF: " + atri.getCpf());
            pw.println("\n");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(atri.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
}
