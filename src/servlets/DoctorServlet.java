package servlets;

import database.Doctor;
import database.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.RequestResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DoctorServlet",urlPatterns = {"/doctor"})
public class DoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Session session= HibernateUtils.getDatabaseSession();
        Transaction transaction=session.beginTransaction();

        Doctor doctor=new Doctor();
        String specialisation=request.getParameter("special");
        int docid=session.createQuery("from Doctor ").list().size()+1;
        String username=RequestResponseUtil.getCookie(request,"username");

        doctor.setDocName(username);
        doctor.setId(docid);
        doctor.setArea(specialisation);

        session.save(doctor);

        transaction.commit();
        session.close();

        request.getRequestDispatcher("/login.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
