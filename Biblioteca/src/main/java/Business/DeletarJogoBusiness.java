package Business;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class DeletarJogoBusiness {

    private Connection connection;

    public DeletarJogoBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void DeletarJogo(){
        Scanner sc1 = new Scanner(System.in);sc1.useLocale(Locale.US);
        System.out.println("Insira o nome do jogo que quer deletar");
        String nomeJogoOriginal = sc1.nextLine();
        String QUERY = String.format("DELETE FROM jogos WHERE nomeJogo = '%s' ",nomeJogoOriginal);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.execute();
            System.out.println("Deletado com sucesso");

        } catch (SQLException e) {

        }
    }

}
