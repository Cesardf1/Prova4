package Business;


import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;


public class ListarLivrosGeneroBusiness {

    private Connection connection;

    public ListarLivrosGeneroBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarLivrosDoGenero() {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o ID da genero desejado");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM livros WHERE idGenero = %d", id);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do livro é: " + rs.getString("nomeLivro"));
                System.out.println("O id da biblioteca onde se encontra é: " +rs.getInt("idBiblioteca")+"\n");

            }

        } catch (SQLException e) {

        }
        return "return";
    }

}
