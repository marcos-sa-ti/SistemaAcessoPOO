/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.Funcionario;


/**
 *
 * @author CASA
 */
public class ValidadadorFuncionario {
    
    public static String validar(Funcionario novofuncionario) {

        if (novofuncionario == null) {
            return "Não foi informado um funcionário";
        }

        if (novofuncionario.getNome() == null || "".equals(novofuncionario.getNome())) {
            return "É necessário informar o nome do funcionario";
        }

        if (novofuncionario.getNumerorg()== null || "".equals(novofuncionario.getNumerorg())) {
            return "É necessario informar o RG";
        }
        if (novofuncionario.getNumerocpf()== null || "".equals(novofuncionario.getNumerocpf())) {
            return "É necessario informar o CPF";
        } 
        
        if (novofuncionario.getDatadenascimento()== null) {
            return "É necessário informar uma data de nascimento";
        }
        if (novofuncionario.getEmail()== null ||"".equals(novofuncionario.getEmail())) {
            return "É necessario informar o e-mail do funcionario";
        }
        if (novofuncionario.getCargo()== null || "".equals(novofuncionario.getCargo())) {
            return "É necessario informar o cargo do funcionario";
        }
        if (novofuncionario.getEmpresa()== null || "".equals(novofuncionario.getEmpresa())) {
            return "É necessario informar a empresa";
        }
        

             


    
        

        return null;
    }
}
