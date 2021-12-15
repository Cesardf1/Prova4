package Business;

import Factory.ConnectionFactory;
import Model.BibliotecaModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CadastroBibliotecaBusiness {

    private Connection connection;

    public CadastroBibliotecaBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    BibliotecaModel bibliotecaModel = new BibliotecaModel();




    public void criarTabelaDeBibliotecas()
    {
        String sql = "CREATE TABLE IF NOT EXISTS Bibliotecas" +
                "(IdBiblioteca int UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,nomeBiblioteca varchar(255));";

        try {


            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();
            stmt.close();

            //System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String cadastrarBiblioteca() {

        Scanner sc1 = new Scanner(System.in);
        BibliotecaModel bibliotecaModel = new BibliotecaModel();
        //Tentando e falhando em receber inputs externos

        System.out.println("Insira o nome da biblioteca que quer adicionar a tabela");
        bibliotecaModel.setNomeBiblioteca(sc1.nextLine());
        //String QUERY = "INSERT INTO produtos VALUES (produto1.getNome(), produto1.getPreço())";


        String temp = "";
        String QUERY = "INSERT INTO Bibliotecas(nomeBiblioteca) VALUES (?)";

        try{
           // Connection conn = DriverManager.getConnection(url,user,password);

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, bibliotecaModel.getNomeBiblioteca());
            stmt.execute();

            stmt.close();


        }
        catch(SQLException e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return temp;
    }
}
