
package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Vendedor extends Funcionario {
    
   public Vendedor(String nomeFumcionario, String loginUsuario, String Cargo) {
        super(nomeFumcionario,loginUsuario,Cargo);
    }
    
      public Vendedor leVendedor(){
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
        
         return new Vendedor(nomeFuncionario,loginUsuario,cargo);
    }
}
