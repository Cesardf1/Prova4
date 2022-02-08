package Business;

import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;

public class ListarJogosDeUmaEmpresaBusiness {

    private Connection connection;

    public ListarJogosDeUmaEmpresaBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarJogosDaEmpresa() {

        int idEncontrado = 0;
        String nomeEncontrado = "";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome da empresa desejada");
        String nome = sc1.nextLine();
        String QUERY = String.format("SELECT * FROM empresas WHERE nomeEmpresa = '%s' ", nome);
        ;

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                idEncontrado = rs.getInt("idEmpresa");

            }

        } catch (SQLException e) {

        }

        



        String QUERY3 = String.format("SELECT * FROM jogos WHERE idEmpresa = %d", idEncontrado);


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY3);
            ResultSet rs = stmt.executeQuery(QUERY3);


            while (rs.next()) {
                System.out.println("O nome do jogo é: " + rs.getString("nomeJogo"));
                System.out.println("O id do seu gênero é: " + rs.getInt("idCategoria") + "\n");
                //   System.out.println("O id da empresa onde se encontra é: " +rs.getInt("idEmpresa")+"\n");

            }

        } catch (SQLException e) {

        }
        return "return";
    }

     /*
        System.out.println("Digite o ID da empresa desejada");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM jogos WHERE idEmpresa = %d", id);
        //String QUERY = "SELECT * FROM jogos";

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do jogo é: " + rs.getString("nomeJogo"));
                System.out.println("O id do seu gênero é: " + rs.getInt("idCategoria") + "\n");
                //   System.out.println("O id da empresa onde se encontra é: " +rs.getInt("idEmpresa")+"\n");

            }

        } catch (SQLException e) {

        }*/
       // return "return";


}

