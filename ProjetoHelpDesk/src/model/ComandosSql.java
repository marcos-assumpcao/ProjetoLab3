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