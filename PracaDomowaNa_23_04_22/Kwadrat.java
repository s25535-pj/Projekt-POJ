package PracaDomowaNa_23_04_22;


public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {

    public Kwadrat(int i, int i1) {
        super(i, i1);
    }

    public Kwadrat(int i) {
        super(i, i);
    }

    @Override
    public String toString() {
        return "kwadrat";
    }
}