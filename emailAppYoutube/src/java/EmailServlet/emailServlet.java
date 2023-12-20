/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailServlet;

import SessionJavaBean.MailSenderBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author I-KingDrew-I
 */
public class emailServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // Create a reference to session  bean "MailSenderBean"
    @EJB
    private MailSenderBean mailSender;
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        // Where you handle passed in values
        
        String toEmail = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        
      //*******************************************************************************     
         // ADDING EMAIL INFORMATION
        //Properties to be read from external file or database or sever properties
     
        String fromEmail = "govdrewx@gmail.com";
        String userName = "govdrewx";
        String passWord = "Nigger1@";
        
     //*******************************************************************************      
        
        
        try (PrintWriter out = response.getWriter()) {
            

        //*******************************************************************************   
            // Code to connect to statless session bean "MailSenderBean"
            
            mailSender.sendEmail(fromEmail, userName, passWord, toEmail, subject, message);
            
            //!! You must first create a reffence to session bean in oder to call the sendEmail function
            //Make sure the parrameter names match the once in the Sevlet
            
        //*******************************************************************************   
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>"); // Start of <html>
            
            out.println("<head>");// Start of <head>
            out.println("<title> Mail Statues</title>");            
            out.println("</head>"); // End of <head>
          
            out.println("<body>");// Start of <body>
            out.println("<h1>Servlet emailServlet at " + request.getContextPath() + "</h1>");
            out.println("<p> This is example code to see if it is running correctly </p> <br> <br> ");
            out.println("Email has been succifully send<br>");
            
            out.println("To return <a href = 'emailJSP.jsp'> Click Here </a> ");
            out.println("</body>"); // End of <body>
           
            
            out.println("</html>");// END of <html>
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
