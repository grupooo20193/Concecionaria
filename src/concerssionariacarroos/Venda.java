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
    
    public class Cliente extends Venda{
        
    }
    
    public class Vendedor extends Venda{
        
    }
    
   //os metodos alterar, editar que seram feitos na tela da interface por isso retirei
}
