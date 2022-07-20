/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.service;

import java.util.List;
import projeto.model.Cliente;


public interface ClienteService {

     List<Cliente> findAll();

    Cliente findById(Long id);
    boolean save(Cliente entity);
    
}
