package Business;

import Factory.ConnectionFactory;
import Model.EmpresaModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;

public class EditarNomeEmpresaBusiness {

    private Connection connection;

    public EditarNomeEmpresaBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }


    public String editarTabela(){
        Scanner sc1 = new Scanner(System.in);sc1.useLocale(Locale.US);
        EmpresaModel categoria1 = new EmpresaModel();
        System.out.println("Insira o nome da empresa que quer editar na tabela");
        String nomeEmpresaOriginal = sc1.nextLine();
        System.out.println("Insira o novo nome");
        categoria1.setNomeEmpresa(sc1.nextLine());


        String QUERY = "UPDATE empresas SET nomeEmpresa = ? WHERE nomeEmpresa = ?";
        try{

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, categoria1.getNomeEmpresa());
            stmt.setString(2,nomeEmpresaOriginal);
            stmt.execute();

            System.out.println("Alteração feita com sucesso");
            String mensagem = String.format("'%s' foi substituído por '%s'",nomeEmpresaOriginal,categoria1.getNomeEmpresa());
            System.out.println(mensagem);

        }catch(SQLException e){

            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }
        return nomeEmpresaOriginal;
}
}