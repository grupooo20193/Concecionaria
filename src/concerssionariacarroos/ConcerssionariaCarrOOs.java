
package concerssionariacarroos;


public class ConcerssionariaCarrOOs {

    public static void main(String[] args) {
        
        //instanciação
        Gerente gerente1 = new Gerente();    
        gerente1.setIdFuncionario(2);
        gerente1.setNomeFuncionario("Augustos");
        gerente1.setUsuarioFuncionario("augusto.gmail.com");
        gerente1.setSenhaFuncionario("12345");
        
        Carro carro1=new Carro();
        carro1.setIdCarro(1);
        carro1.setMarcaCarro("VW");
        carro1.setModeloCarro("gol");
        carro1.setAnoCarro("2019");
        carro1.setValorCarro(30000);
        carro1.setGerente(gerente1);
        gerente1.criaCarro(carro1);
        
        Carro carro2=new Carro();
        carro2.setIdCarro(2);
        carro2.setMarcaCarro("Chevrolet");
        carro2.setModeloCarro("Celta");
        carro2.setAnoCarro("2019");
        carro2.setValorCarro(20000);
        carro2.setGerente(gerente1);
        carro2.setVenda(venda1);
        gerente1.criaCarro(carro2);
        
        System.out.println("Carros disponiveis: ");
        for(int i=0; i<gerente1.quantidadeCarros(); i++){
             System.out.println(gerente1.getCarro(i).getModeloCarro());
        }
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setIdFuncionario(2);
        vendedor1.setNomeFuncionario("Carlos");
        vendedor1.setUsuarioFuncionario("carlos.gmail.com");
        vendedor1.setSenhaFuncionario("999");
        
        Venda venda1 = new Venda();
        venda1.setIdVendas(0);
        //venda1.setCliente() ;
        venda1.setVendedor(vendedor1);
        vendedor1.criaVenda(venda1);
        //carro
        
        Venda venda2 = new Venda();
        venda1.setIdVendas(0);
        //venda1.setCliente() ;
        venda1.setVendedor(vendedor1);
        vendedor1.criaVenda(venda1);
        venda1.criaCarro(carro1);
        
        
        System.out.println("Vendas: ");
        for(int i=0; i<vendedor1.quantidadeVendas();i++){
            System.out.println(vendedor1.getVenda(i).getIDVenda());
        }
        
        
    
       
        
    }
    
}
