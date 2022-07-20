package projeto.controller.command;

import projeto.model.Pet;
import projeto.service.PetService;
import projeto.service.ServiceFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CadastrarPet implements ICommand {

    private PetService service;

    public CadastrarPet() {
        this.service = ServiceFactory.getPetService();
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String page = "index.html";

        String nome = request.getParameter("nome");
        String raca = request.getParameter("raca");
        String tamanho = request.getParameter("tamanho");
        String url = request.getParameter("url");
        String idade= request.getParameter("idade");

        System.out.println("DADOS: "
                + nome + " - "
                + raca + " - "
                + tamanho + " - "
                + url + " - "
                + idade
        );

        Pet c = new Pet();
        
        c.setNome(nome);
        c.setRaca(raca);
        c.setTamanho(tamanho);
        c.setUrl(url);
        c.setIdade(Integer.parseInt(idade));
        boolean value = false;
        
        boolean b = this.service.save(c);

        return page;
    }

}
