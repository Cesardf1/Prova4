package Business;

import Factory.ConnectionFactory;
import Model.GeneroModel;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CadastroGeneroBusiness {

    private Connection connection;
    public CadastroGeneroBusiness(){this.connection = new ConnectionFactory().getConnection();}



    public void criarTabelaDeGeneros()
    {
        String sql = "CREATE TABLE IF NOT EXISTS Generos" +
                "(IdGenero int UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,nomeGenero varchar(255));";

        try {


            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();


            //System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String cadastrarGeneros() {

        Scanner sc1 = new Scanner(System.in);
        GeneroModel generoModel = new GeneroModel();
        //Tentando e falhando em receber inputs externos

        System.out.println("Insira o nome do gênero que quer adicionar a tabela");
        generoModel.setNomeGenero(sc1.nextLine());
        //String QUERY = "INSERT INTO produtos VALUES (produto1.getNome(), produto1.getPreço())";


        String temp = "";
        String QUERY = "INSERT INTO Generos(nomeGenero) VALUES (?)";

        try{
            // Connection conn = DriverManager.getConnection(url,user,password);

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, generoModel.getNomeGenero());
            stmt.execute();

            System.out.println("Alteração feita com sucesso");
            String mensagem = String.format("o gênero '%s' foi adicionado a tabela",generoModel.getNomeGenero());
            System.out.println(mensagem);
            System.out.println("\n");


        }
        catch(SQLException e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return temp;
    }


}
