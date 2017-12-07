/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FamilyDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Family;


public class LoginServlet extends HttpServlet {
 
    FamilyDao dao = new FamilyDao();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("loginid"));
        String family = request.getParameter("family");
       
        Family f = dao.loginFamily(id, family);

        
        System.out.println("family" +f);
        if(f!=null){
            HttpSession session = request.getSession();
            session.setAttribute("fname", f.getFamily());
            session.setAttribute("fid", f.getId());
        response.sendRedirect("family.jsp");
        }
        else{
        response.sendRedirect("index.jsp");
        }
        
    }


}
