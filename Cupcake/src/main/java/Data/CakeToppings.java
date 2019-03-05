/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author jacobfolkehildebrandt
 */
public class CakeToppings {
    private String topping;
    private int topPrice;
    

    public CakeToppings(String topping, int topPrice) {
        this.topping = topping;
        this.topPrice = topPrice;

    }

    public String getTopping() {
        return topping;
    }

    public int getTopPrice() {
        return topPrice;
    }

    @Override
    public String toString() {
        return topping + " " + topPrice;
    }

    
}
