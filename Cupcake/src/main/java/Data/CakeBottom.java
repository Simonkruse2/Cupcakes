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
public class CakeBottom {

    private String bottom;
    private int botPrice;

    public CakeBottom(String bottom, int botPrice) {
        this.bottom = bottom;
        this.botPrice = botPrice;
    }

    public String getBottom() {
        return bottom;
    }

    public int getBotPrice() {
        return botPrice;
    }

    @Override
    public String toString() {
        return bottom + " " + botPrice;
    }

    
}
