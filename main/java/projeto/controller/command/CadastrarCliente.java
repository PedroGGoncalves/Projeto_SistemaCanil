package projeto.controller.command;

import projeto.model.Cliente;
import projeto.service.ClienteService;
import projeto.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarCliente implements ICommand {

    private ClienteService service;

    public CadastrarCliente() {
        this.service = ServiceFactory.getClienteService();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "index.html";

        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String temPet = request.getParameter("temPet");
        String email= request.getParameter("email");
        String idade= request.getParameter("idade");

        System.out.println("DADOS: "
                + nome + " - "
                + endereco + " - "
                + temPet + " - "
                + email + " - "
                + idade
        );

        Cliente c = new Cliente();
        
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setTemPet(temPet);
        c.setEmail(email);
        c.setIdade(Integer.parseInt(idade));
        boolean value = false;
        
        boolean b = this.service.save(c);

        return page;
    }

}
