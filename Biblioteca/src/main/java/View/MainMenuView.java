package View;

import Controller.MainMenuController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenuView {
    static MainMenuController controller = new MainMenuController();
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    public static void MainMenuView() throws IOException {

        String option = "";

        do {
            System.out.println("1. Empresas");
            System.out.println("2. Categorias");
            System.out.println("3. Jogos");


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

                case "6":
                    controller.Selecao(option);
                    break;

                case "7":
                    controller.Selecao(option);
                    break;

                case "8":
                    controller.Selecao(option);
                    break;



                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (!option.equals("9"));
    }

    /*public static void logIn(String tpLogin) throws IOException {
        String usuario = "";
        String senha = "";

        System.out.println("Digite seu usuario");
        usuario = obj.readLine();
        System.out.println("Digite sua senha");
        senha = obj.readLine();

        if (usuario != "" && senha != "") {
            loginController.logIn(tpLogin, usuario, senha);
        }
    }*/

    }


