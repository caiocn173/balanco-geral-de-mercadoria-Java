package teste;

import java.io.FileWriter;
import java.io.PrintWriter;

public class atri3 {
    
    public static String nome;
    public static String cpf;
    public static String telefone;
    public static String email;
    public static String estado;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        atri3.nome = nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void setCpf(String cpf) {
        atri3.cpf = cpf;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        atri3.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        atri3.email = email;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        atri3.estado = estado;
    }
    
    public void salvarCli2(){
            
            try{
            
            FileWriter fw = new FileWriter("dados dos clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Cliente:");
            pw.println("Nome: " + atri3.getNome());
            pw.println("CPF: " + atri3.getCpf());
            pw.println("Telefone: " + atri3.getTelefone());
            pw.println("Email: " + atri3.getEmail());
            pw.println("Estado: " + atri3.getEstado());   
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
        atri3.nomeFor = nomeFor;
    }

    public static String getCnpj() {
        return cnpj;
    }

    public static void setCnpj(String cnpj) {
        atri3.cnpj = cnpj;
    }

    public static String getTelefoneFor() {
        return telefoneFor;
    }

    public static void setTelefoneFor(String telefoneFor) {
        atri3.telefoneFor = telefoneFor;
    }

    public static String getEmailFor() {
        return emailFor;
    }

    public static void setEmailFor(String emailFor) {
        atri3.emailFor = emailFor;
    }

    public static String getEstadoFor() {
        return estadoFor;
    }

    public static void setEstadoFor(String estadoFor) {
        atri3.estadoFor = estadoFor;
    }

    public void salvarFor(){
            
            try{
            
            FileWriter fw = new FileWriter("dados dos fornecedores.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Fornecedor:");
            pw.println("Nome: " + atri3.getNomeFor());
            pw.println("CNPJ: " + atri3.getCnpj());
            pw.println("Telefone: " + atri3.getTelefoneFor());
            pw.println("Email: " + atri3.getEmailFor());
            pw.println("Estado: " + atri3.getEstadoFor());   
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
        atri3.descricao = descricao;
    }

    public static String getCodProd() {
        return codProd;
    }

    public static void setCodProd(String codProd) {
        atri3.codProd = codProd;
    }

    public static String getPrecoUnit() {
        return precoUnit;
    }

    public static void setPrecoUnit(String precoUnit) {
        atri3.precoUnit = precoUnit;
    }

    public static String getQuantEst() {
        return quantEst;
    }

    public static void setQuantEst(String quantEst) {
        atri3.quantEst = quantEst;
    }

    public static String getEstoqueMax() {
        return estoqueMax;
    }

    public static void setEstoqueMax(String estoqueMax) {
        atri3.estoqueMax = estoqueMax;
    }

    public static String getRadio() {
        return radio;
    }

    public static void setRadio(String radio) {
        atri3.radio = radio;
    }
    
    
    
    public void salvarProd(){
        
        try{
            
            FileWriter fw = new FileWriter("dados dos produtos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Produto:");
            pw.println("Descrição: " + atri3.getDescricao());
            pw.println("Código do Produto: " + atri3.getCodProd());
            pw.println("Preço Unitário: R$" + atri3.getPrecoUnit());
            pw.println("Quantidade em estoque: " + atri3.getQuantEst());
            pw.println("Estoque Máximo: " + atri3.getEstoqueMax());   
            pw.println("Produto é perecível? " + atri3.getRadio());   
            pw.println("\n");
            pw.flush();
            pw.close();
            fw.close();
            
        }catch(Exception e){
            
        }
            
        
    }
    
}
