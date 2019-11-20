/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concerssionariacarroos;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author miche
 */
public class ConcessionariaJSONObject {
    public static void main(String[] args) {
        try {
            Carro carro = new Carro();
            Cliente cliente = new Cliente();
            Funcionario funcionario = new Funcionario() {};
            
            carro.setAnoCarro("2019");
            carro.setIdCarro(1);
            carro.setMarcaCarro("ford");
            carro.setModeloCarro("Mustang");
            carro.setValorCarro((float) 315.900);
            
            cliente.setNomeCliente("Gleiph");
            cliente.setCepCliente("111111");
            cliente.setCidadeCliente("Juiz de Fora");
            cliente.setIdCliente(1);
            cliente.setTelefoneCliente("123456789");
            cliente.setEstadoCliente("Minas Gerais");
            cliente.setEnderecoCliente("Av Rio Branco");
            
            funcionario.setIdFuncionario(1);
            funcionario.setNomeFuncionario("Jose");
            funcionario.setLoginUsuario("1234");
        
            
            JSONObject jsonObj = new JSONObject();
            
            jsonObj.put("ano",carro.getAnoCarro());
            jsonObj.put("idCarro", carro.getIdCarro());
            jsonObj.put("marca carro",carro.getMarcaCarro());
            jsonObj.put("modelo carro",carro.getModeloCarro());
            jsonObj.put("valor carro", carro.getValorCarro());
            
            jsonObj.put("nome cliente",cliente.getNomeCliente());
            jsonObj.put("cep cliente",cliente.getCepCliente());
            jsonObj.put("cidade cliente", cliente.getCidadeCliente());
            jsonObj.put("idCliente", cliente.getIdCliente());
            jsonObj.put("telefone cliente", cliente.getTelefoneCliente());
            jsonObj.put("estado cliente", cliente.getEstadoCliente());
            jsonObj.put("endereco do cliente", cliente.getEnderecoCliente());
            
            jsonObj.put("idFuncionario", funcionario.getIdFuncionario());
            jsonObj.put("nome funcionario", funcionario.getNomeFuncionario());
            jsonObj.put("login usuario", funcionario.getLoginUsuario());
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
            
    }
}
