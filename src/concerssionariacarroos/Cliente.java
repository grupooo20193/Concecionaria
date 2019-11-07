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
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String estadoCliente;
    private String cidadeCliente;
    private String cepCliente;

    
    public Cliente(){}
    
    public  Cliente(String nomeCliente, String telefoneCliente, String enderecoCliente, String estadoCliente, String cepCliente, String cidadeCliente){
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
        this.estadoCliente = estadoCliente;
        this.cepCliente = cepCliente;
        this.cidadeCliente = cidadeCliente;
    }
    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the telefoneCliente
     */
    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    /**
     * @param telefoneCliente the telefoneCliente to set
     */
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    /**
     * @return the enderecoCliente
     */
    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    /**
     * @param enderecoCliente the enderecoCliente to set
     */
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    /**
     * @return the estadoCliente
     */
    public String getEstadoCliente() {
        return estadoCliente;
    }

    /**
     * @param estadoCliente the estadoCliente to set
     */
    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    /**
     * @return the cidadeCliente
     */
    public String getCidadeCliente() {
        return cidadeCliente;
    }

    /**
     * @param cidadeCliente the cidadeCliente to set
     */
    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    /**
     * @return the cepCliente
     */
    public String getCepCliente() {
        return cepCliente;
    }

    /**
     * @param cepCliente the cepCliente to set
     */
    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }
    
    
    public void adicionarCliente(){
        
    }
    
    public void editarClinte(){
        
    }
    
    public void deletarCliente(){
        
    }
    
    /*private int buscaId(){
    }*/
}

