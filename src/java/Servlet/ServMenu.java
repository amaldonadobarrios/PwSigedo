/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;


import Logica.grilla.LogicgrillaDenArma;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 31424836
 */
public class ServMenu extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        String action = request.getParameter("action") != null ? request.getParameter("action") : "";

        switch (action) {

            case "pagehome":
                this.pagehome(request, response);
                break;
            case "login":
                this.pagelogin(request, response);
                break;
            default:
                this.pagelogin(request, response);
                break;

        }

        // response.setContentType("text/html;charset=UTF-8");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void forwar(String jsp, HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher(jsp).forward(req, resp);
    }

    private void pagehome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
        
        //request.setAttribute("objResumen", LogicResumenRNSP.getInstance().getResumen());
        request.setAttribute("breadcrumb", "Principal");
        request.setAttribute("body", "home");
        forwar("template.jsp", request, response);
    }

    private void pagedenap(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {
       
        request.setAttribute("breadcrumb", "Denuncias por Perdida de Armas");
        request.setAttribute("body", "denap");
        forwar("template.jsp", request, response);
    }

    private void pagelogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         forwar("jsp/dinamico/login.html", request, response);
    }
}
