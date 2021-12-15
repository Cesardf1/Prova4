package Controller;

import Business.CadastroBibliotecaBusiness;

public class MenuController {
    public void Selecao(String op)
    {
        if (op.equals("1"))
        {
            CadastrarBibliotecaController();

        }

        if (op.equals("2"))
        {


        }

        if (op.equals("3"))
        {


        }

        if (op.equals("4"))
        {


        }

        if (op.equals("5"))
        {


        }

        if (op.equals("6"))
        {


        }

        if (op.equals("7"))
        {


        }

    }

    public String CadastrarBibliotecaController()
    {
        CadastroBibliotecaBusiness cadastroBibliotecaBusiness = new CadastroBibliotecaBusiness();
        cadastroBibliotecaBusiness.criarTabelaDeBibliotecas();
        return cadastroBibliotecaBusiness.cadastrarBiblioteca();
    }
}
