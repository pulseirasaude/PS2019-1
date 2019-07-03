/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

import view.CadastroServico;

/**
 *
 * @author 20171bsi0367
 */
public class AplicacoesBD {
    public ArrayList ProcuraVeiculo (String procura){
        ArrayList<Veiculo> veiculoL = new ArrayList<Veiculo>();
        VeiculoBD veiculo = new VeiculoBD();
        
        
        try {
            veiculoL = veiculo.select("where nome ilike '%" + procura + "%'");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return veiculoL;
    }
    
    public ArrayList ProcuraFuncionario (String procura){
        ArrayList<Funcionario> funcionarioL = new ArrayList<Funcionario>();
        FuncionarioBD funcionario = new FuncionarioBD();
        
        
        try {
            funcionarioL = funcionario.select("where nome ilike '%" + procura + "%'");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return funcionarioL;
    }
    
    public ArrayList ProcuraFuncionarioID (String procura){
        ArrayList<Funcionario> funcionarioL = new ArrayList<Funcionario>();
        FuncionarioBD funcionario = new FuncionarioBD();
        
        
        try {
            funcionarioL = funcionario.select("where id ilike '%" + procura + "%'");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return funcionarioL;
    }
    
    public ArrayList ProcuraCliente (String procura){
        ClienteBD cliente = new ClienteBD();
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        
        try {
            Clientes = cliente.select("where nome ilike '%" + procura + "%'" );
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Clientes;    
    }
    
    public ArrayList ProcuraEndereco (String procura){
            EnderecoBD endO = new EnderecoBD();
            ArrayList<Endereco> endLista = new ArrayList<Endereco>();
            
            try {
                endLista = endO.select("where endereco ilike '%" + procura + "%'");
            } catch (SQLException ex) {
                Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            }
        return endLista;
    }
    
    public ArrayList ProcuraServico (String procura){
            ServicoBD servico = new ServicoBD();
            ArrayList<Servico> servicoL = new ArrayList<>();
        
            try {
                servicoL = servico.select("where id ilike '%" + procura + "%'");
            } catch (SQLException ex) {
                Logger.getLogger(AplicacoesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        return servicoL;
    }
    
    public void atualizaStatus(Servico x) throws SQLException{
        ServicoBD servico = new ServicoBD();
        servico.update(x);
    
    }
    public void cadastraServico(Servico serv) throws SQLException{
        ServicoBD servBD = new ServicoBD();
        try {
            servBD.insert(serv);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroServico.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    } 
    
}
