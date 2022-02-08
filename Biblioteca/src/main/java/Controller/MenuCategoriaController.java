package Controller;

import Business.*;
import View.MainMenuView;

import java.io.IOException;

public class MenuCategoriaController {

    public void Selecao(String op) throws IOException {

        if (op.equals("1")) {
            CadastrarCategoriaController();

        }

        if (op.equals("2")) {
            ListarCategoriasEmpresaController();

        }

        if (op.equals("3")) {
            EditarCategoriaController();

        }

        if (op.equals("4")) {
            MainMenu();

        }


    }

    public String CadastrarCategoriaController()
    {
        CadastroCategoriaBusiness cadastroCategoriaBusiness = new CadastroCategoriaBusiness();
        cadastroCategoriaBusiness.criarTabelaDeCategorias();
        return cadastroCategoriaBusiness.cadastrarCategorias();
    }


    public String ListarCategoriasEmpresaController()
    {
        ListarCategoriasDaEmpresaBusiness listarCategoriasDaEmpresaBusiness = new ListarCategoriasDaEmpresaBusiness();
        return listarCategoriasDaEmpresaBusiness.ListarCategoriasEmpresa();
    }

    public String EditarCategoriaController()
    {
        EditarCategoriaBusiness editarCategoriaBusiness = new EditarCategoriaBusiness();
        return editarCategoriaBusiness.editarTabela();
    }

    public void MainMenu() throws IOException {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.MainMenuView();
    }

}