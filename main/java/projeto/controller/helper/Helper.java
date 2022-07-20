package projeto.controller.helper;

import projeto.controller.command.CadastrarPet;
import projeto.controller.command.ICommand;

public class Helper {

    private Helper() {
    }

    public static ICommand getCommand(String cmd) {
        ICommand command = null;

        switch (cmd) {
            case "/CadastrarPet": {
                System.out.println("Comando criado!");
                command = new CadastrarPet();
            }
            break;
        }

        return command;
    }

}