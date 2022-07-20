/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;
import projeto.model.Pet;
import projeto.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PetDAOImpl implements PetDAO {
    @Override
    public boolean save(Pet pet) {

        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(INSERT_PET);
                pstm.setString(1, pet.getNome());
                pstm.setString(2, pet.getRaca());
                pstm.setString(3, pet.getTamanho());
                pstm.setString(4, pet.getUrl());
                pstm.setInt(5, pet.getIdade());

                pstm.executeUpdate();

                b = true;
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return b;
    }
    
     @Override
    public Pet findById(Long idPet) {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Pet pet = null;

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_BY_ID);
                pstm.setLong(1, idPet);
                res = pstm.executeQuery();

                while (res.next()) {
                    pet = new Pet();
                    pet.setIdPet(res.getLong(1));
                    pet.setNome(res.getString(2));
                    pet.setRaca(res.getString(3));
                    pet.setTamanho(res.getString(4));
                    pet.setUrl(res.getString(4));
                    pet.setIdade(res.getInt(4));
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return pet;
    }

    @Override
    public List<Pet> findAll() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        List<Pet> lista = new ArrayList<>();

        con = FabricaConexao.getConexao();

        if (con != null) {
            try {
                pstm = con.prepareStatement(FIND_ALL);                
                res = pstm.executeQuery();
                                
                while (res.next()) {                    
                    Pet pet = new Pet();
                    pet.setIdPet(res.getLong(1));
                    pet.setNome(res.getString(2));
                    pet.setRaca(res.getString(3));
                    pet.setTamanho(res.getString(4));
                    pet.setUrl(res.getString(4));
                    pet.setIdade(res.getInt(4));
                    
                    lista.add(pet);
                }
            } catch (SQLException ex) {
                System.out.println("Message: " + ex);
            }
        }

        return lista;
    }
}
