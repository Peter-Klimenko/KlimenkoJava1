package bsu.rfe.java.group10.lab1.Klimenko.varB4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        List<Brekfast> foodList = new ArrayList<>();
        
        System.out.println("Введите типы картофеля (варенная, жаренная, фри) или 'exit' для завершения:");

        while (foodList.size() < 20) {
            String input = in.nextLine().toLowerCase();
            if (input.equals("exit")) {
                break;
            }
                	foodList.add(new Potatoes(input));   
        }

        for (String arg : args) {
            String[] parts = arg.split("-");
            if (parts.length == 2 && parts[0].equals("")) {
                foodList.add(new Potatoes(parts[1]));
            }
        }

        Collections.sort(foodList, new PotatoesComparator());

        int totalCalories = 0;
        for (Brekfast item : foodList) {
            if (item != null) {
                totalCalories += item.calculateCalories(totalCalories);
            }
        }
        System.out.println("Всего: " + totalCalories + " ккалорий");
        System.out.println("Всего хорошего!");
    }
}