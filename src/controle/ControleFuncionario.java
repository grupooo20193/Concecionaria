/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import concerssionariacarroos.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author walki
 */
public class ControleFuncionario {
    
    String nome;
    String cargo;
    String cpf;
    String senha;
    
    Funcionario funcionario;
    
    public ControleFuncionario(){}
    
    public ControleFuncionario(String nome, String cargo, String cpf, String senha){
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.senha = senha;
        
        
    }
    
    public void criaFuncionario(){
        if(verificaInfo()==true){
        funcionario = new Funcionario(cpf, nome, cargo, senha);
        }
        else
            JOptionPane.showMessageDialog(null, "Erro");
    }
    
    public boolean verificaInfo(){
        if (nome.isEmpty()){
            return false;
        }
        if (cpf.isEmpty()){
            return false;
        }
        if (senha.isEmpty()){
            return false;
        }
        return true;
    }
    
}
