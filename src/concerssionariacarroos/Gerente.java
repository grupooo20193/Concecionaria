
package concerssionariacarroos;

import java.util.ArrayList;


public class Gerente extends Funcionario {
    
    private ArrayList<Carro> carros;
    
    public Gerente(){
        carros = new ArrayList<Carro>();
    }
    
    
    public void criaCarro(Carro carro){
        carros.add(carro);
    }
    
    public int quantidadeCarros(){
        return carros.size();
    }
    
    public void editaCarro(){
        
    }
    
    public void deletaCarro(Carro carro){
        carros.remove(carro);
    }
    
    public Carro getCarro(int posicao){
        return carros.get(posicao);
    }
    
    public void criaGerente(){
        
    }
    
    public void editaGerente(){
        
    }
    
    public void deletaGerente(){
        
    }
    
    
     /*public int buscaId(){
        
    }*/
    
}
