package Roman;

public class Kolo extends Figura {
    protected final double pi= 3.14;
    protected double promien = 4;

    public Kolo(int promien) {

        this.promien = promien;
    }

    @Override
    protected double obliczSwojePole() {
        pole = pi*(promien*promien);
        return pole;
    }
}
