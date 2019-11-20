package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Funcionario {

    private BancoDeDadosFuncionario funcionarios = new BancoDeDadosFuncionario();
    private  ModelosCarros carros = new ModelosCarros();

    public void adicionaCarro(Carro carro) {
        
    }

    public int quantidadeCarros() {
        return carros.quantidadeCarros();
    }

    public void deletaCarro(Carro carro) {
        carros.deletaCarro(carro);
    }

    public void adicionaVendedor(Vendedor vendedor) {
        funcionarios.adicionaFuncionario(vendedor);
    }

    public int quantidadeVendedores() {
        return funcionarios.quantidadeVendedores();
    }

    public void deletaVendedor(Vendedor vendedor) {
        funcionarios.deletaVendedor(vendedor);
    }

    
    
    public void retornaFuncionarios(){
        
        System.out.println(funcionarios.getGerente());
    }
}
