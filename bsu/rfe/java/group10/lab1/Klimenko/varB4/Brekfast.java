package bsu.rfe.java.group10.lab1.Klimenko.varB4;

public abstract class Brekfast implements Nutritious {

    String name = null;

    public Brekfast(String name) {
        this.name = name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Brekfast)) return false;
        if (name == null || ((Brekfast) arg0).name == null) return false;
        return name.equals(((Brekfast) arg0).name);
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

