/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Endereco;

/**
 *
 * @author walla
 */
public class EnderecoCliente {
    
    public Endereco select(int idCli) throws SQLException{
        Connection c;
        Endereco endereco = new Endereco();
        Statement stmt;
        c = ConexaoBD.getInstance();
        stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ENDERECO "
                + "INNER JOIN ENDERECO_CLIENTE AS EC ON(ENDERECO.ID = EC.ID_ENDERECO) "
                + "INNER JOIN CLIENTE AS CLI ON("+idCli+" = EC.ID_CLIENTE)");
        if (rs.next()) {

            //OS DOIS CAMPOS PREENCHIDOS NAO ACEITAM NULL, PROCURAR SOLUÇÃO
            
            endereco.setId(rs.getInt("id"));
            endereco.setNome(rs.getString("ENDERECO"));
            endereco.setLogradouro(rs.getString("LOGRADOURO"));
            endereco.setNumero(rs.getInt("NUMERO"));
            endereco.setCep(rs.getString("CEP"));
            endereco.setComplemento(rs.getString("COMPLEMENTO"));
            endereco.setCidade(rs.getString("CIDADE"));
            endereco.setEstado(rs.getString("ESTADO"));
        }
        
        rs.close();
        stmt.close();
        c.close();
        return endereco;
    }
     
}
