package zwiazkiMiedzyKlasami;

public class Main {
    public static void main(String[] args) {
        Książka książka = new Książka(new Autor("J.K", "Rollings"),"Harry Potter");
        Książka książka1 = new Książka(new Autor("Jan", "Kochanowski"),"Pan Tadeusz");
        Książka książka2 = new Książka(new Autor("Józek", "Kalinowski"),"Czapelka");
        Czasopismo czasopismo = new Czasopismo(new Autor("Mietek", "Setek"), "Wprost");
        Książka książka3 = new Książka(new Autor("J.K", "Rollings"),"Harry Potter");


        Egzemplarz[] tablicaEgzemplarzy = new Egzemplarz[] {książka, książka1, książka2, czasopismo, książka3};
        Biblioteka miejska = new Biblioteka(tablicaEgzemplarzy);
        miejska.szukajPoTytule("Harry Potter");
        miejska.szukajPoAutorze("Józek");
    }
}
