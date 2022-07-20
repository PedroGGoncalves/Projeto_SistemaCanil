package projeto.dao;

import projeto.model.Cliente;
import java.util.List;

public interface ClienteDAO {

    final String INSERT_PET = "INSERT INTO cliente(nome, endereco, temPet, email, idade "
            + "VALUES(?,?,?,?,?)";
    
   final String FIND_BY_ID = "SELECT id_pet, nome, endereco, temPet, email, idade "
            + "FROM pet WHERE id_pet = ?";

    final String FIND_ALL = "SELECT id_cliente, nome, endereco, temPet, email, idade "
            + "FROM pet";
    public boolean save(Cliente cliente);

    public Cliente findById(Long idCliente);

    public List<Cliente> findAll();
}
