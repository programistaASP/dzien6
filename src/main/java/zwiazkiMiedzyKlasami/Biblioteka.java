package zwiazkiMiedzyKlasami;

public class Biblioteka {
    Egzemplarz[] egzemplarz;

    public Biblioteka(Egzemplarz[] egzemplarz) {
        this.egzemplarz = egzemplarz;
    }
    public String szukajPoTytule(String tytul) {
        for (int i = 0; i < egzemplarz.length; i++) {
            if (tytul.equals(egzemplarz[i].getTytul())) {
                System.out.println(tytul);
            }
        }
        return tytul;
    }
    public String szukajPoAutorze(String autor) {
        for (int i = 0; i < egzemplarz.length; i++) {
            if (autor.equals(egzemplarz[i].getAutor())) {
                System.out.println(autor);
            }
        }
        return autor;
    }
}
