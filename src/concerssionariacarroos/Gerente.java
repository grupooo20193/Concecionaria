
package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Gerente extends Funcionario{
    
    private ArrayList<Carro> carros;
    private ArrayList<Vendedor> vendedores;

    public Gerente(){
        carros = new ArrayList<Carro>();
        vendedores = new ArrayList<Vendedor>();
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

    public void criaVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public int quantidadeVendedores(){
        return vendedores.size();
    }

    public void deletaVendedor(Vendedor vendedor){
        vendedores.remove(vendedor);
    }

    public Vendedor getVendedor(int posicao){
        return vendedores.get(posicao);
    }
 
      public void leGerente(){
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