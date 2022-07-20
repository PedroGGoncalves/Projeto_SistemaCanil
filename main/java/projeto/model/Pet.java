/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

public class Pet  {

     private long idPet;
    private String nome;
    private String raca;
    private String tamanho;
    private String url;
     private int idade;
     
     public Pet() {

    }
     
     public long getIdPet() {
        return idPet;
    }

    public void setIdPet(long idPet) {
        this.idPet = idPet;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
      public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
     public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.idPet ^ (this.idPet >>> 32));
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pet other = (Pet) obj;
        if (this.idPet != other.idPet) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Pet{" + "idPet=" + idPet + ", nome=" + nome
                + ", raca=" + raca + ", tamanho=" + tamanho + ",url="
                + url + ", idade=" + idade +  '}';
    }
}
