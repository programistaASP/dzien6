
public class MojeKolo extends Kolo {


    public MojeKolo(float promien) {
        super(promien);
        obliczPole();
    }

    public final double obliczPole(float promien){
        return pi*promien*promien;

    }


}
