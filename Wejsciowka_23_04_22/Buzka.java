package Wejsciowka_23_04_22;

import java.util.Objects;

public class Buzka implements PrzedstawiaEmocje, Rysowalny {

    char c;
    public Buzka(char c) {
        this.c = c;
    }
    @Override
    public boolean czySieUsmiecha() {
        return true;
    }

    @Override
    public void przestanSieUsmiechac() {
        this.c = '(';
    }

    @Override
    public void draw() {
        System.out.println(":-" + c);

    }
    public void draw(int i) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usmiech)) return false;
        Usmiech buzka = (Usmiech) o;
        return c == buzka.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }
}