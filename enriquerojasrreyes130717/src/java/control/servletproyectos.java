/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidades.Proyecto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ConexionModelo;
import modelo.dao.daoproyectos;

/**
 *
 * @author KikeVostro
 */
public class servletproyectos extends HttpServlet {

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
        recuperarAccion(request, response);
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet servletproyectos</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet servletproyectos at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }
    
    public void recuperarAccion(HttpServletRequest request, HttpServletResponse response) {
        String accion = request.getParameter("accion");
        if (accion.equals("Guardar")) {
            guardarProyectos(request, response);
        }
    }
    
    public void guardarProyectos(HttpServletRequest request, HttpServletResponse response) {
        String nombre = request.getParameter("nombre");
        String fechadeinicio = request.getParameter("fechadeinicio");
//        Integer fechafinal = Integer.parseInt(zonac);
        String fechafinal = request.getParameter("fechafinal");
        String director = request.getParameter("director");
        String cliente = request.getParameter("cliente");
        String descripcion = request.getParameter("descripcion");
        String valor = request.getParameter("valor");
        Proyecto project = new Proyecto();
        project.setNombre(nombre);
        project.setFechaI(fechadeinicio);
        project.setFechaF(fechafinal);
        project.setDirector(director);
        project.setCliente(cliente);
        project.setDescripcion(descripcion);
        project.setValor(valor);
        ConexionModelo conexion = ConexionModelo.getConexion();
        daoproyectos daoproject = new daoproyectos(conexion.getFabricaConexion());
        daoproject.create(project);
        try {
            response.sendRedirect("web/Proyectos/agregar.jsp?mensaje=Ok, Proyecto Agregado");
        } catch (IOException ex) {
            //despues la hacemos
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

}
