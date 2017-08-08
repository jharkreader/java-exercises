package org.launchcode.java.restaurant;

public class Main {

    public static void main(String[] args) {

        Menu newMenu = new Menu("Summer Menu");
        MenuItem tiramisu = new MenuItem("tiramisu", "italian dessert", 6.99, MenuItem.Type.DESSERT);
        MenuItem rackOfLamb = new MenuItem("rack of lamb", "tastes like murder", 27.99, MenuItem.Type.MAIN);
        MenuItem hipsterFadFood = new MenuItem("THE thing", "Full of bacon, sriracha, and fair trade kombucha", 14.95, MenuItem.Type.APPETIZER);

        System.out.println(tiramisu.isNewItem());
        System.out.println(tiramisu.getDateAdded());

        newMenu.addMenuContents(tiramisu);

        newMenu.getMenuContents();

        newMenu.addMenuContents(hipsterFadFood);

        newMenu.getMenuContents();

    }
}
