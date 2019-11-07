package concerssionariacarroos;


import concerssionariacarroos.Cliente;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miche
 */
public class Venda {
    //walkiria
    private int idVendas;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Carro> carros;
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Venda(){
        carros = new ArrayList<Carro>();
    }
    
    
    public void criaCarro(Carro carro){
        carros.add(carro);
    }
    
    public int quantidadeCarros(){
        return carros.size();
    }
    
    public void deletaCarro(Carro carro){
        carros.remove(carro);
    }
    
    public Carro getCarro(int posicao){
        return carros.get(posicao);
    }
    

    //walkiria

    /**
     * @return the idVendas
     */
    public int getIdVendas() {
        return idVendas;
    }

    /**
     * @param idVendas the idVendas to set
     */
    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }
    
   
    
    public void adicionarVenda(){
        
    }
    
    public void editarVenda(){
        
    }
    
    public void deletarVenda(){
        
    }
    
    public void listarVenda(){
        
    }
}
