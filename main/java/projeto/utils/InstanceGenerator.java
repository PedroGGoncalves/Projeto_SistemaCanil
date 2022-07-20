package projeto.utils;

import projeto.model.Pet;

/**
 *
 * @author Samuel Bastos Buchdid
 */
public class InstanceGenerator {
    
    private InstanceGenerator(){
        
    }
    
    public static Pet getCategoria(String nome,String raca, String tamanho,String url, int idade){
        Pet c = new Pet();
        
        c.setNome(nome);
        c.setRaca(raca);
        c.setTamanho(tamanho);
        c.setUrl(url);
        c.setIdade(idade);
        
        return c;
    }
    
}
