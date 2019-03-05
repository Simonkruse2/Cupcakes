/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.User;
import Logic.DataAccessObject_Impl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author simon
 */
@WebServlet(name = "Cupcake", urlPatterns = {"/Cupcake"})
public class Controller extends HttpServlet {

    DataAccessObject_Impl d = new DataAccessObject_Impl();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String origin = request.getParameter("origin");

        switch (origin) {

//            case "index":
//                index(request, response);
//                break;
            
            case "login":
                login(request, response);
                break;

            case "createCustomer":
                createCustomer(request,response);
                break;

            case "invoice":
                invoice(request,response);
                break;

            case "shoppingCart":
                shoppingCart(request,response);
                break;

            case "admin":
                admin(request,response);
                break;

            default:
                throw new AssertionError();
        }

    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String username = (String) request.getParameter("Username");
        String password = (String) request.getParameter("Password");
        request.getSession().setAttribute("Username", username);
        request.getSession().setAttribute("Password", password);
        Boolean valid = d.checkLogin(username, password);
        
        switch (valid ? "logged in" : "not logged in") {
            case "logged in":
                session.setAttribute("logged in", d.getUser(username));
                request.getRequestDispatcher("shop.jsp").forward(request, response);
                break;

            case "not logged in":
                request.getRequestDispatcher("index.jsp");
                break;
            default:
                throw new AssertionError();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String username = (String) request.getParameter("Username");
        String password = (String) request.getParameter("Password");
        String email = (String) request.getParameter("Email");
        
       // d.createCustomer(username, password, email);
        request.getRequestDispatcher("shop.jsp");
    }

    private void invoice(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void shoppingCart(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void admin(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
