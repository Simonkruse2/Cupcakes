/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author simon
 */
public class Recipe {
    
    private String name;
    private String toppings;
    private String bottom;

    public Recipe(String name, String toppings, String bottom) {
        this.name = name;
        this.toppings = toppings;
        this.bottom = bottom;
    }
    public String getName() {
        return name;
    }

    public String getToppings() {
        return toppings;
    }

    public String getBottom() {
        return bottom;
    }

    @Override
    public String toString() {
        return "Recipe{" + "name=" + name + ", toppings=" + toppings + ", bottom=" + bottom + '}';
    }


    
    
}
