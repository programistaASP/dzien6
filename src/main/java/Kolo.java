public class Kolo {
    public float promien;
    protected final double pi = 3.14159265359;

    public Kolo(float promien) {
        this.promien = promien;
    }

    protected final void wypiszPi() {
        System.out.println(pi);
    }

    public static void main(String[] args) {

    }

    public final double obliczPole() {
        return pi*promien*promien;

    }
}


