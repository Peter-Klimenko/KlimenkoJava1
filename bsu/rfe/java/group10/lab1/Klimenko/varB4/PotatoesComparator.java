package bsu.rfe.java.group10.lab1.Klimenko.varB4;

import java.util.Comparator;

public class PotatoesComparator implements Comparator<Brekfast> {
    public int compare(Brekfast o1, Brekfast o2) {
        if (o1 instanceof Potatoes && o2 instanceof Potatoes) {
            Potatoes p1 = (Potatoes) o1;
            Potatoes p2 = (Potatoes) o2;
            return p1.getType().compareTo(p2.getType());
        }
        return 0;
    }
}
