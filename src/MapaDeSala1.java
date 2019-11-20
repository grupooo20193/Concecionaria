/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import java.util.Scanner;

/**
 *
 * @author miche
 */
public class MapaDeSala1 {
    /*int quantMatriculados;
    int horario;
    int capacidade;
    
    public void disponibilidade(int quantMatriculados, int horario){
        if(quantMatriculados >= 60 || quantMatriculados <= 300){
            if(horario >= 7 && horario <= 13 || horario <= 13 && horario <= 21){
                if(capacidade >= 60){
                    
                }
            }
        }
    }*/
}
    
    /*int opcao = 0;
	do {
		System.out
				.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Venda         |");
		System.out.println("                  |     2 - Vendedor      |");
		System.out.println("                  |     3 - Compra        |");
		System.out.println("                  |     4 - Produto       |");
		System.out.println("                  |     5 - Cliente       |");
		System.out.println("                  |     6 - Fornecedor    |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");

		opcao = Console.readInt("Opção -> ");
		System.out.print("\n");
		switch (opcao) {
		case 1:
			break;
		case 2:
			fornecedor();
			break;
                   //case3 , 4  , etc...
		case 5:
			cliente();
			break;
		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);

    public static void main(String[] args) {
        /*int quantMatriculados = 0;
        int horario = 0;
        int cont = 0;
        int local = 60;
      //quantidade de aluno e sua capacidadde
      //criar funçoes
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos matriculados");
        quantMatriculados = teclado.nextInt();

        System.out.println("Informe um horario");
        horario = teclado.nextInt();

        if (local != quantMatriculados) {

            if (quantMatriculados == 60) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) { // modificar o horario
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 70) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 80) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 & horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 90) {
                if (local == 60 || local == 70 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 100) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 105) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 150) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 154) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados == 300) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                }
                System.out.println("Local Reservado:" + cont);
            } else {
                System.out.println("Reservar Local:" + cont);
            }

            if (quantMatriculados < 60) {
                if (local == 60 || local == 70 || local == 80 || local == 90 || local == 100 || local == 105 || local == 150 || local == 154 || local == 154 || local == 300) {
                    if (horario == 7 && horario <= 13 || horario == 13 && horario <= 21) {
                        local = quantMatriculados;
                        cont = cont + local;
                        cont++;
                    }
                    System.out.println("Local Reservado:" + cont);
                } else {
                    System.out.println("Reservar Local:" + cont);
                }
            }
        }*/
    /*}
}

