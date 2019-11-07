
package concerssionariacarroos;

import java.util.ArrayList;


public class Vendedor extends Funcionario {
    
    private ArrayList<Venda> vendas;
    
    public Vendedor(){
        vendas = new ArrayList<Venda>();
    }
    
    public void criaVenda(Venda venda){
        vendas.add(venda);
    }
    
    public int quantidadeVendas(){
        return vendas.size();
    }
    
    public void editaVenda(){
        
    }
    
    public void deletaVenda(Venda venda){
        vendas.remove(venda);
    }
    
    public Venda getVenda(int posicao){
        return vendas.get(posicao);
    }
    
    public int buscaId(){
        return 0;
    }
}
