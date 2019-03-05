//package Presentation;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import Logic.DataAccessObject_Impl;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author simon
// */
//@WebServlet(urlPatterns = {"/FrontController"})
//public class FrontController extends HttpServlet {
//
//    DataAccessObject_Impl d = new DataAccessObject_Impl();
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet FrontController</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet FrontController at " + request.getContextPath() + "</h1>");
//            out.println("<form method='POST' action=>");
//            out.println("Username: <br>");
//            out.println("<input type'text' name='Username' Value='indtast navn'>");
//            out.println(" <br> Password: <br>");
//            out.println("<input type'password' name='Password' Value='indtast kode'><br>");
//            out.println("<input type='submit' value='Submit'");
//            out.println("</form>");
//
//            out.println("<p>");
//            String name = request.getParameter("Name");
//            String toppings = request.getParameter("toppings");
//            String bottom = request.getParameter("bottom");
//            String price = request.getParameter("price");
//
//            //udskriver recipes -- start
//            out.println("<table>");
//            //overskfiter - start
//            out.println("<tr>");
//            out.println("<th>");
//            out.println("Name");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("Toppings");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("Bottom");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("Choose recipe");
//            out.println("</th>");
//            out.println("<tr>");
//            //overskfiter - slut
//
//            //indhold af recipe - start
//            out.println("<td>");
//            out.println(d.getRecipes(name));
//            out.println("</td>");
//            out.println("<td>");
//            out.println(d.getRecipes(toppings));
//            out.println("</td>");
//            out.println("<td>");
//            out.println(d.getRecipes(bottom));
//            out.println("</td>");
//            //indhold af recipe - start
//
//            //combo-box - start
//            out.println("<td>");
//            out.println("<select name='recipe'>");
//            for (Object recipe : d.getRecipes(name)) {
//                out.println("<option value='+ " + recipe + " +'>");
//                out.println("</option>");
//            }
//                    
//            out.println("</select>");
//            out.println("</td>");
//            //combo-box - slut
//            out.println("</tr>");
//            out.println("</table>");
//
//            //udskriver recipes -- slut
//            out.println("</p>");
//            out.println("</body>");
//            out.println("</html>");
//
//            String username = request.getParameter("Username");
//            out.println("User: " + d.getUser(username));
//            out.println("<form method='POST' action=?Username=renz@178.62.232.91>");
//            out.println("Choose User:");
//            out.println("<button>");
//            out.println("Renz");
//            out.println("</button>");
//            out.println("</form>");
//            /*    
//                HttpSession session = request.getSession();
//        Boolean loggedIn = (Boolean) session.getAttribute("loggedIn");
//        if(loggedIn == null || !loggedIn)
//        {
//            PageLogin.generateLogin(response);
//        }
//        String action = request.getParameter("action");
//        if (null == action)
//        {
//            PageMain.generateMain(response);
//        } else
//        {
//            switch (action)
//            {
//                case "hello":
//                    PageHello.generateHello(response);
//                    break;
//                case "buy":
//                    PageBuy.generateBuy(response);
//                    break;
//                case "login":
//                    session.setAttribute("loggedIn", true);
//                    PageLoggedIn.generateLoggedIn(response);
//                    break;
//            }
//        }
//        } 
//             */
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
