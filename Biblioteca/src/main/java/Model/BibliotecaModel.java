package Model;

public class BibliotecaModel {
    private int idBiblioteca;
    private String nomeBiblioteca;
    //private String generosBiblioteca;


    public BibliotecaModel() {
    }

    public BibliotecaModel(int idBiblioteca, String nomeBiblioteca) {
        this.idBiblioteca = idBiblioteca;
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }
}

