package Roman;

public class Kwadrat extends Figura {

    int bok = 2;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    protected double obliczSwojePole() {
        pole = bok*bok;

        return pole;
    }
}
