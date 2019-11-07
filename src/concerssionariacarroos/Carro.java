package concerssionariacarroos;

public class Carro {
    private int idCarro;
    private String marcaCarro;
    private String modeloCarro;
    private String anoCarro;
    private float valorCarro;
    //walkiria// 
    private Venda venda;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    private Gerente gerente;
    

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    //walkiria//
    
    /**
     * @return the idCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param idCarro the idCarro to set
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    /**
     * @return the marcaCarro
     */
    public String getMarcaCarro() {
        return marcaCarro;
    }

    /**
     * @param marcaCarro the marcaCarro to set
     */
    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    /**
     * @return the modeloCarro
     */
    public String getModeloCarro() {
        return modeloCarro;
    }

    /**
     * @param modeloCarro the modeloCarro to set
     */
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    /**
     * @return the anoCarro
     */
    public String getAnoCarro() {
        return anoCarro;
    }

    /**
     * @param anoCarro the anoCarro to set
     */
    public void setAnoCarro(String anoCarro) {
        this.anoCarro = anoCarro;
    }

    /**
     * @return the valorCarro
     */
    public float getValorCarro() {
        return valorCarro;
    }

    /**
     * @param valorCarro the valorCarro to set
     */
    public void setValorCarro(float valorCarro) {
        this.valorCarro = valorCarro;
    }
    
    
    public void adicionarCarro(){
        
    }
    public void editarCarro(){
        
    }
    
    public void excluirCarro(){
        
    }
    
    /*public int buscaId(){
        
    }*/

  
    
    
}
