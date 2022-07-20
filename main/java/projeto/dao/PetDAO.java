/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

import projeto.model.Pet;
import java.util.List;

public interface PetDAO {

    final String INSERT_PET = "INSERT INTO pet(nome, raca, tamanho, url, idade "
            + "VALUES(?,?,?,?,?)";
    
   final String FIND_BY_ID = "SELECT id_pet, nome, raca, tamanho, url, idade "
            + "FROM pet WHERE id_pet = ?";

    final String FIND_ALL = "SELECT id_pet, nome, raca, tamanho, url, idade "
            + "FROM pet";
    public boolean save(Pet pet);

    public Pet findById(Long idPet);

    public List<Pet> findAll();
}
