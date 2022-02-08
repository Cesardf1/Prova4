package Controller;

import Business.*;
import View.MainMenuView;

import java.io.IOException;

public class MenuEmpresaController {

    public void Selecao(String op) throws IOException {

        if (op.equals("1")) {
            CadastrarEmpresaController();

        }

        if (op.equals("2")) {
            ListarEmpresasController();

        }

        if (op.equals("3")) {
            EditarNomeDaEmpresaController();

        }

        if (op.equals("4")) {
            MainMenu();

        }


    }

    public String CadastrarEmpresaController()
    {
        CadastroEmpresaBusiness cadastroEmpresaBusiness = new CadastroEmpresaBusiness();
        cadastroEmpresaBusiness.criarTabelaDeEmpresas();
        return cadastroEmpresaBusiness.cadastrarEmpresa();
    }

    public String ListarEmpresasController()
    {
        ListarEmpresasBusiness listarEmpresasBusiness = new ListarEmpresasBusiness();
        return listarEmpresasBusiness.ListarEmpresas();
    }

    public String EditarNomeDaEmpresaController()
    {
        EditarNomeEmpresaBusiness editarNomeEmpresaBusiness = new EditarNomeEmpresaBusiness();
        return editarNomeEmpresaBusiness.editarTabela();
    }
    public void MainMenu() throws IOException {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.MainMenuView();
    }


}