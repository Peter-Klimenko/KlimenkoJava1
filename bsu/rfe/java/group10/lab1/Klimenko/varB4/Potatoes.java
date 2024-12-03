package bsu.rfe.java.group10.lab1.Klimenko.varB4;
import java.util.Scanner;
public class Potatoes extends Brekfast {

    private String type;
    Scanner in = new Scanner(System.in);
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Potatoes(String type) {
        super("Картошка");
        this.type = type;
    }

    public int calculateCalories(int totalCalories) {
        if (this.type.equals("варенная")) {
            totalCalories = 76;
            System.out.println(this + " 76 ккалорий");
        } else if (this.type.equals("жаренная")) {
            totalCalories = 200;
            System.out.println(this + " 200 ккалорий");
        } else  if (this.type.equals("фри")){
            totalCalories = 312;
            System.out.println(this + " 312 ккалорий");
        }
        else
        {
        	System.out.println(this + " ккалорий:");
        	totalCalories = in.nextInt();
        }
        return totalCalories;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Potatoes)) return false;
            return type.equals(((Potatoes) arg0).type);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " типа '" + type.toUpperCase() + "'";
    }
}
