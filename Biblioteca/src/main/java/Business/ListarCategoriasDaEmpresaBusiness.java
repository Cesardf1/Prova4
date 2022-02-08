package Business;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListarCategoriasDaEmpresaBusiness {

    private Connection connection;

    public ListarCategoriasDaEmpresaBusiness() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarCategoriasEmpresa() {

        int idEncontrado = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o id da empresa desejada");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT DISTINCT idCategoria FROM jogos WHERE idEmpresa = '%d' ", id);
        System.out.println("A empresa possui categorias com os seguintes IDs:\n");


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);



            while (rs.next()) {
                idEncontrado = rs.getInt("idCategoria");
                System.out.println(idEncontrado);


            }

        } catch (SQLException e) {

        }

        System.out.println("");

        return "return";


     /*   System.out.println("Digite o ID da categoria desejado");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM jogos WHERE idCategoria = %d", id);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do jogo é: " + rs.getString("nomeJogo"));
                System.out.println("O id da biblioteca onde se encontra é: " +rs.getInt("idEmpresa")+"\n");

            }

        } catch (SQLException e) {

        }
        return "return";
    }

}*/
    }
}