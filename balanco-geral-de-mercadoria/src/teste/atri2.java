package teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class atri2 {
    
    public static String nome;
    public static String cpf;
    public static String telefone;
    public static String email;
    public static String estado;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        atri2.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        atri2.cpf = cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        atri2.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        atri2.email = email;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        atri2.estado = estado;
    }
    
    
    public void salvarCli(){
            
            try{
            
            FileWriter fw = new FileWriter("dados dos clientes (Admin).txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Cliente:");
            pw.println("Nome: " + atri2.getNome());
            pw.println("CPF: " + atri2.getCpf());
            pw.println("Telefone: " + atri2.getTelefone());
            pw.println("Email: " + atri2.getEmail());
            pw.println("Estado: " + atri2.getEstado());   
            pw.println("\n");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(Exception e){
            
        }      
        }
    
    public static String nomeFor;
    public static String cnpj;
    public static String telefoneFor;
    public static String emailFor;
    public static String estadoFor;

    public static String getNomeFor() {
        return nomeFor;
    }

    public static void setNomeFor(String nomeFor) {
        atri2.nomeFor = nomeFor;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        atri2.cnpj = cnpj;
    }

    public static String getTelefoneFor() {
        return telefoneFor;
    }

    public static void setTelefoneFor(String telefoneFor) {
        atri2.telefoneFor = telefoneFor;
    }

    public static String getEmailFor() {
        return emailFor;
    }

    public static void setEmailFor(String emailFor) {
        atri2.emailFor = emailFor;
    }

    public static String getEstadoFor() {
        return estadoFor;
    }

    public static void setEstadoFor(String estadoFor) {
        atri2.estadoFor = estadoFor;
    }
    
    public void salvarFor(){
            
            try{
            
            FileWriter fw = new FileWriter("dados dos fornecedores(Admin).txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Fornecedor:");
            pw.println("Nome: " + atri2.getNomeFor());
            pw.println("CNPJ: " + atri2.getCnpj());
            pw.println("Telefone: " + atri2.getTelefoneFor());
            pw.println("Email: " + atri2.getEmailFor());
            pw.println("Estado: " + atri2.getEstadoFor());   
            pw.println("\n");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(Exception e){
            
        }      
        }
    
    public static String descricao;
    public static String codProd;
    public static String precoUnit;
    public static String quantEst;
    public static String estoqueMax;
    public static String radio;

    public static String getDescricao() {
        return descricao;
    }

    public static void setDescricao(String descricao) {
        atri2.descricao = descricao;
    }

    public static String getCodProd() {
        return codProd;
    }

    public static void setCodProd(String codProd) {
        atri2.codProd = codProd;
    }

    public static String getPrecoUnit() {
        return precoUnit;
    }

    public static void setPrecoUnit(String precoUnit) {
        atri2.precoUnit = precoUnit;
    }

    public static String getQuantEst() {
        return quantEst;
    }

    public static void setQuantEst(String quantEst) {
        atri2.quantEst = quantEst;
    }

    public static String getEstoqueMax() {
        return estoqueMax;
    }

    public static void setEstoqueMax(String estoqueMax) {
        atri2.estoqueMax = estoqueMax;
    }

    public static String getRadio() {
        return radio;
    }

    public static void setRadio(String radio) {
        atri2.radio = radio;
    }
    
    
    
    public void salvarProd(){
        
        try{
            
            FileWriter fw = new FileWriter("dados dos produtos (Admin).txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Produto:");
            pw.println("Descrição: " + atri2.getDescricao());
            pw.println("Código do Produto: " + atri2.getCodProd());
            pw.println("Preço Unitário: R$" + atri2.getPrecoUnit());
            pw.println("Quantidade em estoque: " + atri2.getQuantEst());
            pw.println("Estoque Máximo: " + atri2.getEstoqueMax());   
            pw.println("Produto é perecível? " + atri2.getRadio());   
            pw.println("\n");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(IOException e){
            
        }
            
        
    }
    
}
