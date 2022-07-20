/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;

public class DaoFactory {
    private DaoFactory(){        
    }
    
    public static PetDAO getPetDAO(){
        return new PetDAOImpl();
    }
}
