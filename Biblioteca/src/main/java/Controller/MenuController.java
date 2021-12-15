package Controller;

import Business.*;

public class MenuController {
    public void Selecao(String op)
    {
        if (op.equals("1"))
        {
            CadastrarBibliotecaController();

        }

        if (op.equals("2"))
        {
            CadastrarGeneroController();

        }

        if (op.equals("3"))
        {
            CadastrarLivroController();

        }

        if (op.equals("4"))
        {
            EditarGeneroController();

        }

        if (op.equals("5"))
        {
            PesquisarLivroController();

        }

        if (op.equals("6"))
        {
            ListarLivrosDeUmaBibliotecaController();

        }

        if (op.equals("7"))
        {
            ListarLivrosDoGeneroController();

        }

    }

    public String CadastrarBibliotecaController()
    {
        CadastroBibliotecaBusiness cadastroBibliotecaBusiness = new CadastroBibliotecaBusiness();
        cadastroBibliotecaBusiness.criarTabelaDeBibliotecas();
        return cadastroBibliotecaBusiness.cadastrarBiblioteca();
    }

    public String CadastrarGeneroController()
    {
        CadastroGeneroBusiness cadastroGeneroBusiness = new CadastroGeneroBusiness();
        cadastroGeneroBusiness.criarTabelaDeGeneros();
        return cadastroGeneroBusiness.cadastrarGeneros();
    }

    public String CadastrarLivroController()
    {
        CadastroLivroBusiness cadastroLivroBusiness = new CadastroLivroBusiness();
        cadastroLivroBusiness.criarTabelaDeLivros();
        return cadastroLivroBusiness.cadastrarLivro();

    }
    public String EditarGeneroController()
    {
        EditarGeneroBusiness editarGeneroBusiness = new EditarGeneroBusiness();
        return editarGeneroBusiness.editarTabela();
    }
    public String PesquisarLivroController()
    {
        PesquisarLivroBusiness pesquisarLivroBusiness = new PesquisarLivroBusiness();
         return pesquisarLivroBusiness.ProcurarLivroPorID();

    }
    public String ListarLivrosDeUmaBibliotecaController()
    {
        ListarLivrosDeUmaBibliotecaBusiness listarLivrosDeUmaBibliotecaBusiness = new ListarLivrosDeUmaBibliotecaBusiness();
        return listarLivrosDeUmaBibliotecaBusiness.ListarLivrosDaBiblioteca();
    }
    public String ListarLivrosDoGeneroController()
    {
        ListarLivrosGeneroBusiness listarLivrosGeneroBusiness = new ListarLivrosGeneroBusiness();
        return listarLivrosGeneroBusiness.ListarLivrosDoGenero();

    }
}
