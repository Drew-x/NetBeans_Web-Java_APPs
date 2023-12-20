<%-- 
    Document   : emailJSP
    Created on : Apr 29, 2019, 2:46:56 PM
    Author     : I-KingDrew-I
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form method="post" action="emailServlet">
            
            <table>
              
               
                
                <tr>
                    <td align="right"> <b>To:</b></td>
                    <td> <input type="text" name="email" size="40" > </td> 
                    
                </tr>
                
             
                <tr>
                    <td align="right"> <b>Subject:</b></td>
                    <td> <input type="text" name="subject" size="40" > </td> 

                </tr>
              
              
                <tr>
                    <td align="right"> <b>Message:</b></td>
                    
                    <td> 
                        <textarea name="message" cols="40" rows="7"> </textarea> 
                    </td> 
                
                </tr>
               
                <tr>
                    <td ></td>
                    <td><input type="submit" value="Send" name="submitButton" /> </td>
                </tr>
               
            </table>
            
            
        </form>
        
    </body>
</html>
