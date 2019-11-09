    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package concerssionariacarroos;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class Carro {
    private int idCarro;
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
    private BigDecimal valorCarro;

    public Carro(){}
    
    /**
     * @return the idCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param idCarro the idCarro to set
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    /**
     * @return the marcaCarro
     */
    public String getMarcaCarro() {
        return marcaCarro;
    }

    /**
     * @param marcaCarro the marcaCarro to set
     */
    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    /**
     * @return the modeloCarro
     */
    public String getModeloCarro() {
        return modeloCarro;
    }

    /**
     * @param modeloCarro the modeloCarro to set
     */
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    /**
     * @return the anoCarro
     */
    public String getAnoCarro() {
        return anoCarro;
    }

    /**
     * @param anoCarro the anoCarro to set
     */
    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    /**
     * @return the valorCarro
     */
    public BigDecimal getValorCarro() {
        return valorCarro;
    }

    /**
     * @param valorCarro the valorCarro to set
     */
    public void setValorCarro(BigDecimal valorCarro) {
        this.valorCarro = valorCarro;
    }
    
     public Carro(int idCarro,String marcaCarro,String anoCarro, String modeloCarro, BigDecimal valorCarro){
        super();
        this.idCarro = idCarro;
        this.marcaCarro = marcaCarro;
        this.anoCarro = anoCarro;
        this.modeloCarro = modeloCarro;
        this.valorCarro = valorCarro;
        
    }
    
     //os metodos alterar, editar seram feitos na tela da interface por isso retirei
    // por isso preciso da tela de cadastro de carro
    // retirei tambem a busca por id vai dar muito trabalho
}

    

