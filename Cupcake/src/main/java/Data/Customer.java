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

    public Customer(int balance, String username, String password, String email) {
        super(username, password, email);
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" + "balance=" + balance + '}';
    }



    

}
