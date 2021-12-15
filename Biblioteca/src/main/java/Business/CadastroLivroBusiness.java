package Business;

import Factory.ConnectionFactory;
import Model.LivroModel;
import Model.LivroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CadastroLivroBusiness {

    private Connection connection;

    public CadastroLivroBusiness()
    {
        this.connection = new ConnectionFactory().getConnection();
    }






    public void criarTabelaDeLivros()
    {
        String sql = "CREATE TABLE IF NOT EXISTS `bancodedados`.`livros` (\n" +
                "  `idLivros` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `idGenero` INT NULL,\n" +
                "  `idBiblioteca` INT NULL,\n" +
                "  `nomeLivro` VARCHAR(255) NULL,\n" +
                "  PRIMARY KEY (`idLivros`),\n" +
                "  INDEX `idGenero_idx` (`idGenero` ASC) VISIBLE,\n" +
                "  INDEX `idBiblioteca_idx` (`idBiblioteca` ASC) VISIBLE,\n" +
                "  CONSTRAINT `idGenero`\n" +
                "    FOREIGN KEY (`idGenero`)\n" +
                "    REFERENCES `bancodedados`.`generos` (`IdGenero`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE,\n" +
                "  CONSTRAINT `idBiblioteca`\n" +
                "    FOREIGN KEY (`idBiblioteca`)\n" +
                "    REFERENCES `bancodedados`.`bibliotecas` (`IdBiblioteca`)\n" +
                "    ON DELETE CASCADE\n" +
                "    ON UPDATE CASCADE);";

        try {


            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.execute();
            stmt.close();

            //System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String cadastrarLivro() {

        Scanner sc1 = new Scanner(System.in);
        LivroModel livroModel = new LivroModel();
        //Tentando e falhando em receber inputs externos

        System.out.println("Insira o nome do livro que quer adicionar a tabela");
        livroModel.setNomeLivro(sc1.nextLine());
        System.out.println("Insira o ID do gênero ao qual o livro pertence");
        livroModel.setIdGenero(sc1.nextInt());
        System.out.println("Insira o ID da biblioteca ao qual o livro pertence");
        livroModel.setIdBiblioteca(sc1.nextInt());
        //String QUERY = "INSERT INTO produtos VALUES (produto1.getNome(), produto1.getPreço())";


        String temp = "";
        String QUERY = "INSERT INTO Livros(nomeLivro,idGenero,idBiblioteca) VALUES (?,?,?)";

        try{
            // Connection conn = DriverManager.getConnection(url,user,password);

            PreparedStatement stmt = connection.prepareStatement(QUERY);
            stmt.setString(1, livroModel.getNomeLivro());
            stmt.setInt(2, livroModel.getIdGenero());
            stmt.setInt(3, livroModel.getIdBiblioteca());
            stmt.execute();

            System.out.println("Cadastro feito com sucesso");
            String mensagem = String.format("o livro '%s' foi adicionado a tabela",livroModel.getNomeLivro());
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