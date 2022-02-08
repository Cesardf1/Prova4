package View;

import Controller.MenuJogoController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuJogoView {

    static MenuJogoController controller = new MenuJogoController();
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    public static String MenuJogoView() throws IOException {



        String option = "";

        do {
            System.out.println("1. Cadastrar Jogo");
            System.out.println("2. Listar Jogos de Determinada Categoria e Empresa");
            System.out.println("3. Buscar jogo por ID");
            System.out.println("4. Editar Jogo");
            System.out.println("5. Deletar Jogo");

            option = obj.readLine();
            System.out.println("\n");

            switch (option) {

                case "1":
                    controller.Selecao(option);
                    break;

                case "2":
                    controller.Selecao(option);
                    break;

                case "3":
                    controller.Selecao(option);
                    break;

                case "4":
                    controller.Selecao(option);
                    break;

                case "5":
                    controller.Selecao(option);
                    break;



                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (!option.equals("9"));
        return option;
    }
}
