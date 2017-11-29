
package controller;

import com.huseyn.services.CreateFamilyService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Family;

public class CreateFamilyServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
      int id = Integer.parseInt(req.getParameter("familyid"));
      String name = req.getParameter("family");
      Family f = new Family(id, name);
      CreateFamilyService familyService = new CreateFamilyService();
      familyService.createFamily(f);
        
    }

}
