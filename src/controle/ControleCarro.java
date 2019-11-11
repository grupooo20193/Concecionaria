/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import concerssionariacarroos.Carro;
import static java.lang.System.exit;
import java.util.ArrayList;

/**
 *
 * @author fabricioguidine
 */
public class ControleCarro {
    Carro c;
    private ArrayList<String> erros;
    String marcaCarro;
    String modeloCarro;
    String anoCarro;
    float valorCarro;
    
    public ControleCarro(String marcaCarro, String modeloCarro, String anoCarro, float valorCarro){
        this.c = new Carro();
        erros = new ArrayList<>();
        this.marcaCarro = marcaCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.valorCarro = valorCarro;
    }
    
    public void novoCarro(String marcaCarro, String modeloCarro, String anoCarro, float valorCarro){
        c.setMarcaCarro(marcaCarro);
        c.setModeloCarro(modeloCarro);
        c.setAnoCarro(anoCarro);
        c.setValorCarro(valorCarro);
        
    }
    
    public void verificaInfo(){
        verificaMarca();
        verificaModelo();
        verificaAno();
        verificaValor();
    }
        
    public void verificaMarca(){
        if(marcaCarro.isEmpty() == true){
            getErros().add("Campo marca vazio.");
        }
        for(int i=0; i<marcaCarro.length(); i++){
            if((Character.isAlphabetic(marcaCarro.charAt(i))) == false && (marcaCarro.charAt(i) != ' ')){
                getErros().add("Marca inválido.");
                exit(0);
            }
        }
    }
    
    public void verificaModelo(){
        if(modeloCarro.isEmpty() == true){
            getErros().add("Campo modelo vazio.");
        }
        for(int i=0; i<modeloCarro.length(); i++){
            if((Character.isAlphabetic(modeloCarro.charAt(i))) == false && (modeloCarro.charAt(i) != ' ')){
                getErros().add("Modelo inválido.");
                exit(0);
            }
        }    
    }
    
    public void verificaAno(){
        if(anoCarro.isEmpty() == true){
            getErros().add("Campo ano vazio.");
        }
        
        int ano = Integer.parseInt(anoCarro);
        
        if(ano < 2010){
            getErros().add("Ano inválido, permitido a partir de 2010");
        }
    }
     
    public void verificaValor(){
        if(valorCarro < 0){
            getErros().add("Valor inválido.");
        }
    }

    /**
     * @return the erros
     */
    public ArrayList<String> getErros() {
        return erros;
    }
    
   
}
