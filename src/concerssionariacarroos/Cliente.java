
package concerssionariacarroos;
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String estadoCliente;
    private String cidadeCliente;
    private String cepCliente;
    private Venda venda;

    
    public Cliente(){}
    
    public  Cliente(String nomeCliente, String telefoneCliente, String enderecoCliente, String estadoCliente, String cepCliente, String cidadeCliente, Venda venda){
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
        this.estadoCliente = estadoCliente;
        this.cepCliente = cepCliente;
        this.cidadeCliente = cidadeCliente;
        this.venda = venda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }


    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }


    public String getEstadoCliente() {
        return estadoCliente;
    }


    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }


    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }
    
    
}


