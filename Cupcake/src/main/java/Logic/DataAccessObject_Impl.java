/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Recipe;
import Data.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import logic.DBConnector;

/**
 *
 * @author simon
 */
public class DataAccessObject_Impl {
    
    public static void main(String[] args) {
        DataAccessObject_Impl g = new DataAccessObject_Impl();
        g.getRecipes("lol", "p", "g");
    }
    public User getUser(String username) {
        User u = null;
        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * " + "FROM `user` WHERE username = '" + username + "' ;";
            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
           
                String password = rs.getString("password");
                u = new User(username, password);

            }
            return u;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<User> getUsers() {

        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * " + "FROM `user`;";
            ArrayList<User> team = new ArrayList<>();
            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int userID = rs.getInt("user_id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                boolean admin = rs.getBoolean("admin");
                team.add(new User(username, password));

            }
            return team;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public ArrayList<Recipe> getRecipes(String name,String toppings,String bottom) {
        try {
            DBConnector c = new DBConnector();

            String query = "SELECT Name, Toppings, Bottom FROM `cupcake`.`CupcakeRecipes`;";
            ArrayList<Recipe> recipes = new ArrayList<>();
            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                name = rs.getString("Name");
                toppings = rs.getString("Toppings");
                bottom = rs.getString("Bottom");
                recipes.add(new Recipe(name, toppings, bottom));
            }
            return recipes;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}