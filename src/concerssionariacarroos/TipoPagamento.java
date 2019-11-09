/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerssionariacarroos;

import java.util.Date;

/**
 *
 * @author miche
 */
public class TipoPagamento extends Pagamento {
  public TipoPagamento(Date dataPagamento) {
        super(dataPagamento);
     }
    
    //implementar a forma de pagamento 
    public Pagamento FormaPagamento(){
       return null;
    }  
 
}
