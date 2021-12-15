package Business;

import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;

public class PesquisarLivroBusiness
{
    private Connection connection;

    public PesquisarLivroBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ProcurarLivroPorID() {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o ID do livro que deseja encontrar");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM livros WHERE idLivros = %d",id);
        //String QUERY = "SELECT * FROM livros";

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do livro é: " + rs.getString("nomeLivro"));
                System.out.println("O id do seu gênero é: " +rs.getInt("idGenero")+"\n");
                System.out.println("O id da biblioteca onde se encontra é: " +rs.getInt("idBiblioteca")+"\n");

            }

        }
        catch(SQLException e){

        }
        return "return";
    }


}


