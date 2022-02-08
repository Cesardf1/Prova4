package Business;


import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;


public class ListarJogosCategoriaBusiness {

    private Connection connection;

    public ListarJogosCategoriaBusiness() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarJogosDoCategoria() {

        int idEncontrado = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome da categoria desejada");
        String nome = sc1.nextLine();
        String QUERY = String.format("SELECT * FROM categorias WHERE nomeCategoria = '%s' ", nome);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                idEncontrado = rs.getInt("idCategoria");

            }

        } catch (SQLException e) {

        }


        String QUERY2 = String.format("SELECT * FROM jogos WHERE idCategoria = %d", idEncontrado);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY2);
            ResultSet rs = stmt.executeQuery(QUERY2);


            while (rs.next()) {
                System.out.println("O nome do jogo é: " + rs.getString("nomeJogo"));


            }
            System.out.println("");
        } catch (SQLException e) {

        }
        return "return";



    }
}
