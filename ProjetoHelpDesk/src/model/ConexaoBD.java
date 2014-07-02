/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Assumpcao, Ubirajara Oliveira, Vinicius Souza
 */
public class ConexaoBD {
    Connection conn;

    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Ok");
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERRO DRIVER");
        }

        String serverName = "localhost";
        String database = "bdhelpdesk";
        //String database = "helpdesk";
        String url = "jdbc:mysql://" + serverName + "/" + database;
        String user = "root";
        String password = "";

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão Ok");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO COM BD");
        }
    }
}