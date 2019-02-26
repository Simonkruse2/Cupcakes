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
public class Customer extends User{
    private int balance;
    private String email;

    public Customer(String username, String password, int balance, String email) {
        super(username, password);
        this.balance = balance;
        this.email = email;
    }


}
