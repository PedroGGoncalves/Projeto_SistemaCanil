/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;
import projeto.model.Cliente;
import projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public boolean save(Cliente cliente) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_PET);
                pstm.setString(1, cliente.getNome());
                pstm.setString(2, cliente.getEndereco());
                pstm.setString(3, cliente.getTemPet());
                pstm.setString(4, cliente.getEmail());
                pstm.setInt(5, cliente.getIdade());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
     @Override
    public Cliente findById(Long idCliente) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Cliente cliente = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idCliente);
                res = pstm.executeQuery();

                while (res.next()) {
                    cliente = new Cliente();
                    cliente.setIdCliente(res.getLong(1));
                    cliente.setNome(res.getString(2));
                    cliente.setEndereco(res.getString(3));
                    cliente.setTemPet(res.getString(4));
                    cliente.setEmail(res.getString(5));
                    cliente.setIdade(res.getInt(6));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return cliente;
    }

    @Override
    public List<Cliente> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Cliente> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Cliente cliente = new Cliente();
                   cliente.setIdCliente(res.getLong(1));
                    cliente.setNome(res.getString(2));
                    cliente.setEndereco(res.getString(3));
                    cliente.setTemPet(res.getString(4));
                    cliente.setEmail(res.getString(5));
                    cliente.setIdade(res.getInt(6));
                    
                    lista.add(cliente);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    }
}