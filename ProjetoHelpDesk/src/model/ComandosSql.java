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
 * @@author Marcos Assumpcao, Ubirajara Oliveira, Vinicius Souza
 */
public class ComandosSql {

    Statement stm;
    ResultSet rs;
    ConexaoBD c = new ConexaoBD();

    public ArrayList<Cliente> ExecQuery(String sql) throws Exception {
        ArrayList<Cliente> list = new ArrayList<Cliente>();

        try {
            c.conectar();
            stm = c.conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Cliente cliente = new Cliente();
                System.out.println(rs.getInt("idCliente"));
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setTelefone(rs.getInt("telefone"));
                cliente.setRamal(rs.getInt("ramal"));
                cliente.setCelular(rs.getInt("celular"));
                cliente.setSetor(rs.getString("setor"));
                cliente.setEmail(rs.getString("email"));
                list.add(cliente);
            }
        } catch (SQLException e) {
            throw new Exception(" sem Sucesso");
        }
        return list;
    }

    public ArrayList<Funcionario> ExecQueryFunc(String sql) throws Exception {
        ArrayList<Funcionario> list = new ArrayList<Funcionario>();

        try {
            c.conectar();
            stm = c.conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                System.out.println(rs.getInt("idFuncionario"));
                funcionario.setIdFuncionario(rs.getInt("idFuncionario"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setTelefone(rs.getInt("telefone"));
                funcionario.setRamal(rs.getInt("ramal"));
                funcionario.setCelular(rs.getInt("celular"));
                funcionario.setSetor(rs.getString("setor"));
                funcionario.setEmail(rs.getString("email"));
                list.add(funcionario);
            }
        } catch (SQLException e) {
            throw new Exception(" sem Sucesso");
        }
        return list;
    }

    public ArrayList<Gerente> ExecQueryGer(String sql) throws Exception {
        ArrayList<Gerente> list = new ArrayList<Gerente>();

        try {
            c.conectar();
            stm = c.conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Gerente gerente = new Gerente();
                System.out.println(rs.getInt("idGerente"));
                gerente.setIdCliente(rs.getInt("idGerente"));
                gerente.setNome(rs.getString("nome"));
                gerente.setEndereco(rs.getString("endereco"));
                gerente.setBairro(rs.getString("bairro"));
                gerente.setCidade(rs.getString("cidade"));
                gerente.setTelefone(rs.getInt("telefone"));
                gerente.setRamal(rs.getInt("ramal"));
                gerente.setCelular(rs.getInt("celular"));
                gerente.setSetor(rs.getString("setor"));
                gerente.setEmail(rs.getString("email"));
                list.add(gerente);
            }
        } catch (SQLException e) {
            throw new Exception(" sem Sucesso");
        }
        return list;
    }

    public void ExecSQL(String sql) throws Exception {
        try {
            c.conectar();
            stm = c.conn.createStatement();

            int result = stm.executeUpdate(sql);
            if (result > 0) {
                throw new Exception(" com Sucesso");
            }
        } catch (SQLException e) {
            throw new Exception(" sem Sucesso");
        }
    }
}
