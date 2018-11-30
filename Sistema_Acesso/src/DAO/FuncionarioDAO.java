/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Classes.Funcionario;
import ConexaoBD.ConexaoBanco;

/**
 *
 * @author CASA
 */
public class FuncionarioDAO {
    
          public static void inserir(Funcionario novofuncionario)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO funcionario (nome, numerodocumento, numerocpf"
                + "dataNascimento, email, cargo, empresa,)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?,)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConexaoBanco.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, novofuncionario.getNome());
            preparedStatement.setString(2, novofuncionario.getNumerocpf());
            preparedStatement.setString(3, novofuncionario.getNumerocpf());
            Timestamp t = new Timestamp (novofuncionario.getDatadenascimento().getTime());
            preparedStatement.setTimestamp(4, t);
            preparedStatement.setString(5, novofuncionario.getCargo());
            preparedStatement.setString(6, novofuncionario.getEmail());
            preparedStatement.setString(7, novofuncionario.getEmpresa());
            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }  
    
    
    
}
