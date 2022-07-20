/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.service;

import java.util.List;
import projeto.model.Pet;


public interface PetService {

     List<Pet> findAll();

    Pet findById(Long id);
    boolean save(Pet entity);
    
}
