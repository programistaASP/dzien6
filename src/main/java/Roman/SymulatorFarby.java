package Roman;

public class SymulatorFarby {

    public static int obliczZapotrzebowanieNaFarbe(Figura[] tablicafigur, double pojemnoscPojemnika) {
        double pojemnosc = pojemnoscPojemnika;
        double suma = 0;
        for (int i = 0; i < tablicafigur.length; i++) {
            suma += tablicafigur[i].obliczSwojePole();
        }
        double zapotrzebowanieNaFarbe = suma / pojemnoscPojemnika;
        int zapotrzebowanie = (int) zapotrzebowanieNaFarbe;
        System.out.println(zapotrzebowanie+1);
        return zapotrzebowanie;
    }


}
