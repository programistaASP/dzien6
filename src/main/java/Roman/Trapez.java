package Roman;

public class Trapez extends Figura {

    int gora = 4;
    int dol = 5;
    int wysokosc = 3;

    public Trapez(int gora, int dol, int wysokosc) {
        this.gora = gora;
        this.dol = dol;
        this.wysokosc = wysokosc;
    }

    @Override
    protected double obliczSwojePole() {
        pole = ((gora+dol)*wysokosc)/2;
        return pole;
    }
}
