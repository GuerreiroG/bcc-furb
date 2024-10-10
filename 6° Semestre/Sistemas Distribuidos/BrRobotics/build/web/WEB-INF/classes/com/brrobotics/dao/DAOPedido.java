/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brrobotics.dao;

import com.brrobotics.modelo.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author joaosantanna
 */
public class DAOPedido {

    private static final DAOPedido INSTANCE = new DAOPedido();

    public static DAOPedido getInstance() {
        return INSTANCE;
    }

    private Connection openConnection() {

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            String url = "jdbc:derby://localhost:1527/BrRobotics";
            String user = "root";
            String pass = "root";

            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public Pedido insert(Pedido pedido) {

        Connection conn = null;

        PreparedStatement stmt = null;

        try {

            conn = openConnection();

            stmt = conn.prepareStatement("INSERT INTO pedidos (CLIENTE, ENDERECO, ESTADO, ITENS, TOTAL) VALUES (?, ?, ?, ?, ? )", // 
                    Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, pedido.getCliente());
            stmt.setString(2, pedido.getEndereco());
            stmt.setString(3, pedido.getEstado());
            stmt.setString(4, pedido.getItens());
            stmt.setDouble(5, pedido.getTotal());

            if (stmt.executeUpdate() == 1) {

                //Obtendo o id incremental...
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        pedido.setCodigo(rs.getInt(1));
                    }
                }

                return pedido;
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            throw new RuntimeException(e);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
