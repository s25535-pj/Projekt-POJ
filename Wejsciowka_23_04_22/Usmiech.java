package Wejsciowka_23_04_22;

public class Usmiech extends Buzka implements Skalowalny {

    public Usmiech(){
        super(')');

    }
    @Override
    public void draw(int times) {
        System.out.print(":-" + ")".repeat(times));
        System.out.println();

    }

}

