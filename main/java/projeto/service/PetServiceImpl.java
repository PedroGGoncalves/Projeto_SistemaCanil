/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.service;

import java.util.ArrayList;
import java.util.List;
import projeto.dao.PetDAO;
import projeto.dao.DaoFactory;
import projeto.model.Pet;


public class PetServiceImpl implements PetService {

    private PetDAO dao = DaoFactory.getPetDAO();

    @Override
    public boolean save(Pet entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
    

    public Pet findById(Long id) {
        Pet entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }

    
    public List<Pet> findAll() {
        List<Pet> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

}
