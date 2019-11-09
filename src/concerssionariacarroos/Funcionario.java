/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerssionariacarroos;

/**
 *
 * @author miche
 */
public abstract class Funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private String loginUsuario;
    private String cargo;
   
    
    
    public Funcionario(){}
    
     public  Funcionario(String nomeFumcionario, String loginUsuario, String Cargo){
        this.nomeFuncionario = nomeFumcionario;
        this.loginUsuario = loginUsuario;
        this.cargo = cargo;
    }

    /**
     * @return the idFuncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    /**
     * @return the loginUsuario
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * @param loginUsuario the loginUsuario to set
     */
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

     
}
