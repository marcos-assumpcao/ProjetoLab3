/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author lasaccomori
 */
public class ComandosSql {
    Statement stm;
    ResultSet rs;
    ConexaoBD c = new ConexaoBD();
    
    public ArrayList<Cliente> ExecQuery (String sql) throws Exception{
         ArrayList<Cliente> list = new ArrayList<>();
         
        try{
            c.conectar(); 
            stm = c.conn.createStatement();
            rs = stm.executeQuery(sql);
        
            while (rs.next()){
                
                Cliente cliente = new Cliente();
                /*cliente.idCliente = (rs.getInt("idCliente"));
                cliente.nome = (rs.getString("nome"));
                cliente.endereco = (rs.getString("endereco"));
                cliente.bairro = (rs.getString("bairro"));
                cliente.cidade = (rs.getString("cidade"));
                cliente.telefone = (rs.getInt("telefone"));
                cliente.ramal = (rs.getInt("ramal"));
                cliente.celular = (rs.getInt("celular"));
                cliente.setor = (rs.getString("setor"));
                cliente.email = (rs.getString("email"));
            */

                System.out.println(rs.getInt("idCliente"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getNString("cidade"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setRamal(rs.getInt("ramal"));
                cliente.setCelular(rs.getInt("celular"));
                cliente.setSetor(rs.getString("setor"));
                cliente.setEmail(rs.getString("email"));
                
            list.add(cliente);
        }
        }catch (SQLException e){                 
            throw new Exception(" sem Sucesso");
        }
        return list;
    }
    
    public void ExecSQL(String sql) throws Exception{ 
        try{
            c.conectar(); 
            stm = c.conn.createStatement();
        
            int result = stm.executeUpdate(sql);
            if (result > 0){
                throw new Exception(" com Sucesso");             
            }
       
        }catch (SQLException e){                      
            throw new Exception(" sem Sucesso");
        }
    }
}
