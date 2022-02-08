package Controller;

import Business.*;

import java.io.IOException;

public class MenuJogoController {

    public void Selecao(String op) throws IOException {

        if (op.equals("1"))
        {
            CadastrarJogoController();
        }

        if (op.equals("2"))
        {
            ListarJogosCategoriaEmpresaController();
        }

        if (op.equals("3"))
        {
            PesquisarJogoController();
        }

        if (op.equals("4"))
        {
            EditarJogoController();
        }

        if (op.equals("5"))
        {
            DeletarJogoController();
        }
    }

    public String CadastrarJogoController ()
    {
        CadastroJogoBusiness cadastroJogoBusiness = new CadastroJogoBusiness();
        cadastroJogoBusiness.criarTabelaDeJogos();
        return cadastroJogoBusiness.cadastrarJogo();
    }

    public String ListarJogosCategoriaEmpresaController()
    {
        ListarJogosCategoriaEmpresaBusiness listarJogosCategoriaEmpresaBusiness = new ListarJogosCategoriaEmpresaBusiness();
        return listarJogosCategoriaEmpresaBusiness.ListarJogosDoCategoria();
    }

    public void PesquisarJogoController()
    {
        PesquisarJogoBusiness pesquisarJogoBusiness = new PesquisarJogoBusiness();
        pesquisarJogoBusiness.ProcurarJogoPorID();
    }

    public void EditarJogoController()
    {
        EditarJogoBusiness editarJogoBusiness = new EditarJogoBusiness();
        editarJogoBusiness.editarJogo();
    }

    public void DeletarJogoController()
    {
        DeletarJogoBusiness deletarJogoBusiness = new DeletarJogoBusiness();
        deletarJogoBusiness.DeletarJogo();
    }

    }
