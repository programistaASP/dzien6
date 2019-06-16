package zwiazkiMiedzyKlasami;

public abstract class Egzemplarz {

    public String getTytul(){
        return tytul;

    }
    public String getAutor(){
        return autor;
    }



    public Egzemplarz(String tytul) {
        this.tytul = tytul;
    }
}
