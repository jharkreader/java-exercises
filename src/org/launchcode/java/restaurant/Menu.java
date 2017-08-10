package org.launchcode.java.restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

    private String menuTitle;
    private Date previousUpdate;
    private ArrayList<MenuItem> menuContents;

    public Menu(String title) {
        this.menuTitle = title;
        menuContents = new ArrayList<>();
        previousUpdate = new Date();

    }

    public String getMenuTitle() {
        return menuTitle;
    }

    void setMenuTitle(String aMenuTitle) {
        menuTitle = aMenuTitle;
    }

    public Date getPreviousUpdate() {
        return previousUpdate;
    }
// No setter method, this happens when menu items are added

    public void getMenuContents() {
        System.out.println(menuTitle + "\n");
        for (MenuItem item : menuContents) {
            System.out.println(item.toString() + "\n");
        }
    }

    public void addMenuContents(MenuItem... items) {

        int newItemCounter = 0;

        for (MenuItem item : items) {
            menuContents.add(item);
            newItemCounter++;
        }

        //for loop to check menu items against date, update isNew
        for (int i=0; i < (menuContents.size()-newItemCounter); i++) {
            if (menuContents.get(i).getDateAdded().before(previousUpdate)) {
                menuContents.get(i).setNewItem(false);
            }
        }
        previousUpdate = new Date();
    }

    public void removeMenuItem(MenuItem anItem) {
        menuContents.remove(anItem);
        anItem.setNewItem(true);
    }

    public void testAddMenuContents(MenuItem... items) {

        // Set "New" flag to false on existing menu items
        for (MenuItem item : menuContents) {
            item.setNewItem(false);
        }

        // Adds items that are not already on the menu
        for (MenuItem item : items) {
            if (menuContents.size() > 0) {
                for (MenuItem menuObject : menuContents) {
                    if (!item.equals(menuObject)) {
                        item.setNewItem(true);
                        menuContents.add(item);
                    }
                }
            }
            else {
                menuContents.add(item);
            }
        }
        previousUpdate = new Date();
    }
}

