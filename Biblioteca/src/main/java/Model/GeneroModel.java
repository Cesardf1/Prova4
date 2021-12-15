package Model;

public class GeneroModel {
    private int idGenero;
    private String nomeGenero;

    public GeneroModel() {
    }

    public GeneroModel(int idGenero, String nomeGenero) {
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }
}
