package Controller;

import Business.*;
import View.MenuCategoriaView;
import View.MenuEmpresaView;
import View.MenuJogoView;

import java.io.IOException;

public class MainMenuController {
    public void Selecao(String op) throws IOException {


        if (op.equals("1"))
        {
            MenuEmpresa();
        }


        if (op.equals("2"))
        {
            MenuCategoria();
        }


        if (op.equals("3"))
        {
           MenuJogo();
        }


        if (op.equals("4"))
        {

        }



    }

    public String CadastrarEmpresaController()
    {
        CadastroEmpresaBusiness cadastroEmpresaBusiness = new CadastroEmpresaBusiness();
        cadastroEmpresaBusiness.criarTabelaDeEmpresas();
        return cadastroEmpresaBusiness.cadastrarEmpresa();
    }

    public String CadastrarCategoriaController()
    {
        CadastroCategoriaBusiness cadastroCategoriaBusiness = new CadastroCategoriaBusiness();
        cadastroCategoriaBusiness.criarTabelaDeCategorias();
        return cadastroCategoriaBusiness.cadastrarCategorias();
    }




    public String EditarCategoriaController()
    {
        EditarCategoriaBusiness editarCategoriaBusiness = new EditarCategoriaBusiness();
        return editarCategoriaBusiness.editarTabela();
    }

    public String PesquisarJogoController()
    {
        PesquisarJogoBusiness pesquisarJogoBusiness = new PesquisarJogoBusiness();
         return pesquisarJogoBusiness.ProcurarJogoPorID();

    }
    public String ListarJogosDeUmaEmpresaController()
    {
        ListarJogosDeUmaEmpresaBusiness listarJogosDeUmaEmpresaBusiness = new ListarJogosDeUmaEmpresaBusiness();
        return listarJogosDeUmaEmpresaBusiness.ListarJogosDaEmpresa();
    }

    public String ListarJogosDoCategoriaController()
    {
        ListarJogosCategoriaBusiness listarJogosCategoriaBusiness = new ListarJogosCategoriaBusiness();
        return listarJogosCategoriaBusiness.ListarJogosDoCategoria();

    }

    public String ListarEmpresasController()
    {
        ListarEmpresasBusiness listarEmpresasBusiness = new ListarEmpresasBusiness();
        return listarEmpresasBusiness.ListarEmpresas();
    }

    public String MenuEmpresa() throws IOException
    {
        MenuEmpresaView menuEmpresaView = new MenuEmpresaView();
        return menuEmpresaView.MenuEmpresaView();
    }

    public String MenuCategoria() throws IOException
    {
       MenuCategoriaView menuCategoriaView = new MenuCategoriaView();
       return menuCategoriaView.MenuCategoriaView();
    }

    public String MenuJogo() throws IOException
    {
        MenuJogoView menuJogoView = new MenuJogoView();
        return menuJogoView.MenuJogoView();
    }

    public String CadastrarJogoController ()
    {
        CadastroJogoBusiness cadastroJogoBusiness = new CadastroJogoBusiness();
        cadastroJogoBusiness.criarTabelaDeJogos();
        return cadastroJogoBusiness.cadastrarJogo();
    }
}
