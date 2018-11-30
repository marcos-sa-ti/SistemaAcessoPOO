/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.ValidadadorFuncionario;
import Classes.Funcionario;
import DAO.FuncionarioDAO;

/**
 *
 * @author CASA
 */
public class ServicoFuncionario {
    
    public static String cadastrarCliente(Funcionario novofuncFuncionario) {

        String resposta = null;

        try {

            resposta = ValidadadorFuncionario.validar(novofuncFuncionario);
            
        } catch (NullPointerException e) {
           
            

        }
        if (resposta == null) {

            try {

                FuncionarioDAO.inserir(novofuncFuncionario);

            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        }
        return resposta;
    }

    
}
