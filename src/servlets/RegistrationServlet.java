package servlets;

import database.HibernateUtils;
import database.UserDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet",urlPatterns = {"/register"})
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Session session = HibernateUtils.getDatabaseSession();
        Transaction transaction = session.beginTransaction();

        String username = request.getParameter("ctext");
        String password = request.getParameter("cpassword");
        String role = request.getParameter("abc");

        System.out.println(username+password+role);

        UserDetails userDetails = new UserDetails();
        userDetails.setUsername(username);
        userDetails.setPassword(password);
        userDetails.setRole(role);

        response.addCookie(new Cookie("username",username));

        session.save(userDetails);

        if (role.equals("doctor")) {
            request.setAttribute("username",username);
            request.getRequestDispatcher("/doctor.jsp").forward(request, response);
        }
        if (role.equals("patient")) {
            request.setAttribute("username",username);
            request.getRequestDispatcher("/patient.jsp").forward(request,response);
        }

        transaction.commit();
        session.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
