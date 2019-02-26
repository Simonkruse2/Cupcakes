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
public class Admin extends User{
    
    private boolean admin;
    public Admin(String username, String password, boolean admin) {
        super(username, password);
        this.admin = admin;
    }
}
