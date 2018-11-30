/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author marcos.sbrito2
 */

// Classe FUNCIONARIOS que está herdando da classe PESSOA
public class Funcionario extends Pessoa {
    private String cargo;
    private String empresa;
    private String departamento;

    public String getCargo() {
        return cargo;
    }

   public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
     
}

