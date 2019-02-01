package servlets;

import database.HibernateUtils;
import database.UserDetails;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LoginServlet",urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("ctext");
        String password = request.getParameter("cpassword");


        Session session = HibernateUtils.getDatabaseSession();
        Transaction transaction = session.beginTransaction();


        Query query = session.createQuery("FROM UserDetails where username=:username and password=:password");
        query.setParameter("username", username);
        query.setParameter("password", password);
        List<UserDetails> UserDetailsList = (List<UserDetails>) query.list();

        transaction.commit();
        session.close();

        if (UserDetailsList.size() == 1) {
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            out.println("login success");
        }
        else{
            response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            out.println("login failure");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
