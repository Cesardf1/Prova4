package View;

import Controller.MenuEmpresaController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuEmpresaView {

    static MenuEmpresaController controller = new MenuEmpresaController();
    static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
    public static String MenuEmpresaView() throws IOException {



            String option = "";

            do {
                System.out.println("1. Cadastrar Empresa");
                System.out.println("2. Listar Empresas Cadastradas");
                System.out.println("3. Editar Nome de uma Empresa");
                System.out.println("4. Retornar ao menu anterior");

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




                    default:
                        System.out.println("Opcao invalida");
                        break;
                }
            } while (!option.equals("9"));
        return option;
    }
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




