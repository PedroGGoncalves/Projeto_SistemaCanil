/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.service;

import java.util.ArrayList;
import java.util.List;
import projeto.dao.ClienteDAO;
import projeto.dao.DaoFactory;
import projeto.model.Cliente;


public class ClienteServiceImpl implements ClienteService {

    private ClienteDAO dao = DaoFactory.getClienteDAO();

    @Override
    public boolean save(Cliente entity) {
        boolean b = false;

        if (dao != null) {
            dao.save(entity);
            b = true;
        }

        return b;
    }
    

    public Cliente findById(Long id) {
        Cliente entity = null;

        if (dao != null) {
            entity = dao.findById(id);
        }

        return entity;
    }

    
    public List<Cliente> findAll() {
        List<Cliente> lista = null;

        if (dao != null) {
            lista = new ArrayList<>();
            lista = dao.findAll();
        }

        return lista;
    }

}
