
package concerssionariacarroos;


public class Funcionario {
     
    private String idFuncionario;
    private String nomeFuncionario;
    private String cargoFuncionario;
    private String senhaFuncionario;
   // BancoDeDadosFuncionario bancoDeDadosFuncionario = new BancoDeDadosFuncionario();
    
    /**
     * Construtor da classe 
     * @param id cpf do funcionario String
     * @param nome nome do funcionario String
     * @param usuario cargo do funcionario String
     * @param senha sehna para logar no sistema String
     */
    public Funcionario(String id, String nome, String usuario, String senha){
        this.idFuncionario = id;
        this.nomeFuncionario = nome;
        this.cargoFuncionario = usuario;
        this.senhaFuncionario = senha;
    }
    
    /**
     * Retorna o ID do funcionario, sendo este o cpf
     * @return idFuncionario String
     */
    public String getIdFuncionario() {
        return idFuncionario;
    }
    
    /**
     * Altera o id do funcionario
     * @param idFuncionario id do funcionario
     */
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    /**
     * Retorna o nome do funcionario
     * @return nomeFuncionario String
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getUsuarioFuncionario() {
        return cargoFuncionario;
    }

    public void setUsuarioFuncionario(String usuarioFuncionario) {
        this.cargoFuncionario = usuarioFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    
    
   /* public void retornaFuncionarios(){
        for(int i=0; i < bancoDeDadosFuncionario.quantidadeVendedores(); i++){
            System.out.println(bancoDeDadosFuncionario.getVendedores(i).getNomeFuncionario());
            System.out.println("");
        }
        System.out.println(bancoDeDadosFuncionario.getGerente());
    }  */
     
}
