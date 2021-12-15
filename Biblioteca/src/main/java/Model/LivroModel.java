package Model;

public class LivroModel {
    private int idLivro;
    private int idGenero;
    private int idBiblioteca;
    private String nomeLivro;
   // private String generoLivro;
   // private String bibliotecaPertencente;

    public LivroModel() {
    }

    public LivroModel(int idLivro, int idGenero, int idBiblioteca, String nomeLivro) {
        this.idLivro = idLivro;
        this.idGenero = idGenero;
        this.idBiblioteca = idBiblioteca;
        this.nomeLivro = nomeLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
}
