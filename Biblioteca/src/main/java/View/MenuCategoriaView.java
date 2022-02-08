package View;

import Controller.MenuCategoriaController;
import Controller.MenuEmpresaController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuCategoriaView {

    static MenuCategoriaController controller = new MenuCategoriaController();
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    public static String MenuCategoriaView() throws IOException {



        String option = "";

        do {
            System.out.println("1. Cadastrar Categoria");
            System.out.println("2. Listar Categorias Cadastradas em uma Empresa");
            System.out.println("3. Editar Nome de uma Categoria");

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
