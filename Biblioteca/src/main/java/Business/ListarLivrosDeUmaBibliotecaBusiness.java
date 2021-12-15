package Business;

import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;

public class ListarLivrosDeUmaBibliotecaBusiness {

    private Connection connection;

    public ListarLivrosDeUmaBibliotecaBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarLivrosDaBiblioteca() {

        int idEncontrado = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome da biblioteca desejada");
        String nome = sc1.nextLine();
        String QUERY = String.format("SELECT * FROM bibliotecas WHERE nomeBiblioteca = '%s' ", nome);
        ;

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                idEncontrado = rs.getInt("idBiblioteca");

            }

        } catch (SQLException e) {

        }

       // System.out.println("Digite o ID da biblioteca desejada");
        String QUERY2 = String.format("SELECT * FROM livros WHERE idBiblioteca = %d", idEncontrado);
        //String QUERY = "SELECT * FROM livros";

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY2);
            ResultSet rs = stmt.executeQuery(QUERY2);


            while (rs.next()) {
                System.out.println("O nome do livro é: " + rs.getString("nomeLivro"));
                System.out.println("O id do seu gênero é: " + rs.getInt("idGenero") + "\n");
                //   System.out.println("O id da biblioteca onde se encontra é: " +rs.getInt("idBiblioteca")+"\n");

            }

        } catch (SQLException e) {

        }
        return "return";
    }

     /*
        System.out.println("Digite o ID da biblioteca desejada");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM livros WHERE idBiblioteca = %d", id);
        //String QUERY = "SELECT * FROM livros";

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do livro é: " + rs.getString("nomeLivro"));
                System.out.println("O id do seu gênero é: " + rs.getInt("idGenero") + "\n");
                //   System.out.println("O id da biblioteca onde se encontra é: " +rs.getInt("idBiblioteca")+"\n");

            }

        } catch (SQLException e) {

        }*/
       // return "return";


}

