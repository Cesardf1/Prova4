package Business;

import Factory.ConnectionFactory;

import java.sql.*;
import java.util.Scanner;

public class ListarEmpresasBusiness {

    private Connection connection;

    public ListarEmpresasBusiness() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public String ListarEmpresas() {

        int idEncontrado = 0;
        String nomeEncontrado = "";
        Scanner sc1 = new Scanner(System.in);

        String QUERY = String.format("SELECT * FROM empresas ");


        try {

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            ResultSet rs = stmt.executeQuery(QUERY);


            while (rs.next()) {
                System.out.println("Empresa: " + rs.getString("nomeEmpresa"));
                System.out.println("ID:" + rs.getInt("IdEmpresa"));

            }

            System.out.println("\n");
        } catch (SQLException e) {

        }


        return "return";

    }
}