///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Presentation;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import Logic.DataAccessObject_Impl;
//
///**
// *
// * @author simon
// */
//@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
//public class LoginServlet extends HttpServlet {
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
//            String username =  request.getParameter("Username");
//            String password =  request.getParameter("Password");
//            String email =  request.getParameter("Email");
//      //      String username = (String) request.getSession().getAttribute("Username");
//      //      String password = (String) request.getSession().getAttribute("Password");
//            d.createCustomer(username, password, email);
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet LoginServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
//            out.println("<h1>Username: " + username + "  -  and you are " + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
////        try (PrintWriter out = response.getWriter()) {
////            String username = (String) request.getParameter("Username");
////            String password = (String) request.getParameter("Password");
////      //      String username = (String) request.getSession().getAttribute("Username");
////      //      String password = (String) request.getSession().getAttribute("Password");
////            Boolean valid = d.checkLogin(username, password);
////            out.println("<!DOCTYPE html>");
////            out.println("<html>");
////            out.println("<head>");
////            out.println("<title>Servlet LoginServlet</title>");            
////            out.println("</head>");
////            out.println("<body>");
////            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
////            out.println("<h1>Username: " + username + "  -  and you are " + (valid? "logged in" : "NOT logged in") +"</h1>");
////            out.println("</body>");
////            out.println("</html>");
////        }
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
