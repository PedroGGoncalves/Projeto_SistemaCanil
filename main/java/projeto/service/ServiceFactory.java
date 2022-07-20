/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.service;


public class ServiceFactory {
    
    private ServiceFactory(){        
    }
    
    public static PetService getPetService(){
        return new PetServiceImpl();
    }
    
}

