package Roman;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(7);
        Kolo kolo = new Kolo(6);
        Trapez trapez = new Trapez(4,3,7);


        Figura[] tablicafigur = new Figura[]{kwadrat,kolo, trapez};

        SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicafigur, 22);
    }
}
