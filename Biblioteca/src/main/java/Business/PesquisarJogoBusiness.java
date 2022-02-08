package Business;

import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;

public class PesquisarJogoBusiness
{
    private Connection connection;

    public PesquisarJogoBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ProcurarJogoPorID() {


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o ID do jogo que deseja encontrar");
        int id = sc1.nextInt();
        String QUERY = String.format("SELECT * FROM jogos WHERE idJogos = %d",id);
        //String QUERY = "SELECT * FROM jogos";

        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("O nome do jogo é: " + rs.getString("nomeJogo"));
                System.out.println("O id da sua categoria é: " +rs.getInt("idCategoria")+"");
                System.out.println("O id da empresa onde se encontra é: " +rs.getInt("idEmpresa")+"");

            }

        }
        catch(SQLException e){

        }
        return "return";
    }


}


