package Model;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String generoLivro;
    private String bibliotecaPertencente;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, String generoLivro, String bibliotecaPertencente) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.generoLivro = generoLivro;
        this.bibliotecaPertencente = bibliotecaPertencente;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getBibliotecaPertencente() {
        return bibliotecaPertencente;
    }

    public void setBibliotecaPertencente(String bibliotecaPertencente) {
        this.bibliotecaPertencente = bibliotecaPertencente;
    }
}
