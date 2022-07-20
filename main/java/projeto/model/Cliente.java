/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

public class Cliente  {

     private long idCliente;
    private String nome;
    private String endereco;
    private String temPet;
    private String email;
     private int idade;
     
     public Cliente() {

    }
     
     public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getTemPet() {
        return temPet;
    }

    public void setTemPet(String temPet) {
        this.temPet = temPet;
    }
    
      public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        hash = 23 * hash + (int) (this.idCliente ^ (this.idCliente >>> 32));
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome
                + ", endereco=" + endereco + ", temPet=" + temPet + ",email="
                + email + ", idade=" + idade +  '}';
    }
}

