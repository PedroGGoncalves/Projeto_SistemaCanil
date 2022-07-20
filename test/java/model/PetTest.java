/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import projeto.model.Pet;


public class PetTest {
    
    public PetTest() {
    }

    /**
     * Test of getIdPet method, of class Pet.
     */
    @Test
    public void testGetIdPet() {
        System.out.println("getIdPet");
        Pet instance = new Pet();
        instance.setIdPet(1);
        long expResult = 1;
        long result = instance.getIdPet();
        assertEquals(expResult, result);
    }

    
}