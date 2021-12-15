package Business;

import Factory.ConnectionFactory;
import Model.GeneroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class EditarGeneroBusiness {

    private Connection connection;

    public  EditarGeneroBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String editarTabela(){
        Scanner sc1 = new Scanner(System.in);sc1.useLocale(Locale.US);
        GeneroModel genero1 = new GeneroModel();
        System.out.println("Insira o nome do gênero que quer editar na tabela");
        String nomeGeneroOriginal = sc1.nextLine();
        System.out.println("Insira o novo nome");
        genero1.setNomeGenero(sc1.nextLine());


        String QUERY = "UPDATE generos SET nomeGenero = ? WHERE nomeGenero = ?";
        try{

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, genero1.getNomeGenero());
            stmt.setString(2,nomeGeneroOriginal);
            stmt.execute();

            System.out.println("Alteração feita com sucesso");
            String mensagem = String.format("'%s' foi substituído por '%s'",nomeGeneroOriginal,genero1.getNomeGenero());
            System.out.println(mensagem);

        }catch(SQLException e){

            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }
        return nomeGeneroOriginal;
    }
}
