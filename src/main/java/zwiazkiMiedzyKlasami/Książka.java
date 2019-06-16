package zwiazkiMiedzyKlasami;

public class Książka extends Egzemplarz {
    Autor autor;
    public String tytul;
    private String autor;
    private String imie;


    public Książka( Autor autor, String tytul) {
        super(tytul);
        this.autor = autor;
    }
}
