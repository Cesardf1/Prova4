package Business;

import Factory.ConnectionFactory;
import Model.CategoriaModel;
import Model.JogoModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class EditarJogoBusiness {

    private Connection connection;

    public EditarJogoBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String editarJogo(){
        Scanner sc1 = new Scanner(System.in);sc1.useLocale(Locale.US);
        
        JogoModel jogo1 = new JogoModel();
        System.out.println("Insira o nome do jogo que quer editar na tabela");
        String nomeJogoOriginal = sc1.nextLine();
        System.out.println("Insira o novo nome");
        jogo1.setNomeJogo(sc1.nextLine());
        System.out.println("Insira o id da nova categoria");
        jogo1.setIdCategoria(sc1.nextInt());
        System.out.println("Insira o id da nova empresa");
        jogo1.setIdEmpresa(sc1.nextInt());


        String QUERY = "UPDATE jogos SET nomeJogo = ?, idCategoria = ?, idEmpresa = ?  WHERE nomeJogo = ?";
        try{

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, jogo1.getNomeJogo());
            stmt.setString(4,nomeJogoOriginal);
            stmt.setInt(2,jogo1.getIdCategoria());
            stmt.setInt(3,jogo1.getIdEmpresa());
            stmt.execute();

            System.out.println("Alteração feita com sucesso");
            String mensagem = String.format("'%s' foi substituído por '%s'",nomeJogoOriginal,jogo1.getNomeJogo());
            System.out.println(mensagem);
            System.out.println();

        }catch(SQLException e){

            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }
        return nomeJogoOriginal;
    }
}