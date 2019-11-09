
package concerssionariacarroos;

import java.util.ArrayList;
import java.util.Scanner;


public class Gerente extends Funcionario{
    
     public Gerente(String nomeFumcionario, String loginUsuario, String Cargo) {
        super(nomeFumcionario,loginUsuario,Cargo);
    }
    
      public Gerente leGerente(){
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
        
         return new Gerente(nomeFuncionario,loginUsuario,cargo);
    }
}