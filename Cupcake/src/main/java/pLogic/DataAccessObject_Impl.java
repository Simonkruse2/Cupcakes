/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pLogic;

import Data.Customer;
import Data.Recipe;
import Data.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class DataAccessObject_Impl {


    public ArrayList<User> getUser(String username) {
        User u = null;
        try {
            DBConnector c = new DBConnector();

            String query = "SELECT * FROM `Users` WHERE Name LIKE '" + username + "';";
            ArrayList<User> user = new ArrayList<>();
            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String _username = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                 
                 u = new User(_username,password, email);

            }
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public ArrayList<Recipe> getRecipes(String name) {
        try {
            DBConnector c = new DBConnector();
     //       String query = "SELECT * FROM cupcake.CupcakeRecipes;";
          String query = "SELECT Name, Toppings, Bottom FROM `cupcake`.`CupcakeRecipes` WHERE Name LIKE '" + name + "';";
            ArrayList<Recipe> recipes = new ArrayList<>();
            Connection connection = c.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String Name = rs.getString("Name");
                String toppings = rs.getString("Toppings");
                String bottom = rs.getString("Bottom");
                recipes.add(new Recipe(Name, toppings, bottom));
            }
            return recipes;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
