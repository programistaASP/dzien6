package zwiazkiMiedzyKlasami;

public class Czasopismo extends Egzemplarz {
    Autor autor;
    private String tytul;
    private String autor;
    private String imie;

    public Czasopismo(Autor autor, String tytul) {
        super(tytul);
        this.autor = autor;
    }
}
