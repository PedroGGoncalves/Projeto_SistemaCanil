package projeto.utils;

import projeto.model.Pet;


public class InstanceGenerator {
    
    private InstanceGenerator(){
        
    }
    
    public static Pet getPet(String nome,String raca, String tamanho,String url, int idade){
        Pet c = new Pet();
        
        c.setNome(nome);
        c.setRaca(raca);
        c.setTamanho(tamanho);
        c.setUrl(url);
        c.setIdade(idade);
        
        return c;
    }
    
}
