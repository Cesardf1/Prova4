package Business;

import Factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ListarJogosCategoriaEmpresaBusiness {

    private Connection connection;

    public ListarJogosCategoriaEmpresaBusiness() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarJogosDoCategoria() {

        int idEncontrado1 = 0;
        int idEncontrado2 = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome da categoria desejada");
        String nome1 = sc1.nextLine();
        System.out.println("Digite o nome da empresa que deseja checar");
        String nome2 = sc1.nextLine();
        String QUERY = String.format("SELECT * FROM categorias WHERE nomeCategoria = '%s' ", nome1);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                idEncontrado1 = rs.getInt("idCategoria");

            }

        } catch (SQLException e) {

        }

        String QUERY2 = String.format("SELECT * FROM empresas WHERE nomeEmpresa = '%s' ", nome2);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY2);
            ResultSet rs = stmt.executeQuery(QUERY2);


            while (rs.next()) {
                idEncontrado2 = rs.getInt("idEmpresa");

            }

        } catch (SQLException e) {

        }



        String QUERY3 = String.format("SELECT * FROM jogos WHERE idCategoria = %d AND idEmpresa = %d", idEncontrado1,idEncontrado2);

        System.out.println("os jogos encontrados que atendem aos parametros pedidos são:");


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY3);
            ResultSet rs = stmt.executeQuery(QUERY3);


            while (rs.next()) {
                System.out.println(rs.getString("nomeJogo"));
               
            }
            System.out.println("");
        } catch (SQLException e) {

        }
        return "return";


    
    }
}