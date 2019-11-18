
package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Vendedor extends Funcionario {
    
    private ArrayList<Venda> vendas;
    private ArrayList<Cliente>clientes;

    public Vendedor(){
        vendas = new ArrayList<Venda>();
        clientes = new ArrayList<Cliente>();
    }

    public void criaVenda(Venda venda){
        vendas.add(venda);
        
    }

    public int quantidadeVendas(){
        return vendas.size();
    }


    public void deletaVenda(Venda venda){
        vendas.remove(venda);
    }

    public Venda getVenda(int posicao){
        return vendas.get(posicao);
    }
    
    public void criaCliente(Cliente cliente){
        clientes.add(cliente);
        
    }
    
    public int quantidadeClientes(){
        return clientes.size();
    }
    public void deletarCliente(Cliente cliente){
        clientes.remove(cliente);
   }
   
   public Cliente getCliente(int posicao){
        return clientes.get(posicao);
    }
   

      public void leVendedor(){
        Scanner teclado = new Scanner(System.in);
        String nomeFuncionario;
        String loginUsuario;
        String cargo;
    
        System.out.print("Digite o nome do gerente ");
        nomeFuncionario = teclado.nextLine();
        System.out.print("Informe o seu login ");
        loginUsuario = teclado.nextLine();
        System.out.println("Digite o cargo");
        cargo = teclado.nextLine();
        
    } 
}
