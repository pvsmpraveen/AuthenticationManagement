package servlets;

import database.HibernateUtils;
import database.Patient;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.RequestResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PatientServlet",urlPatterns = {"/patient"})
public class PatientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Session session= HibernateUtils.getDatabaseSession();
        Transaction transaction=session.beginTransaction();

        Patient patient=new Patient();

        int patid=session.createQuery("from Patient ").list().size()+1;
        String username= RequestResponseUtil.getCookie(request,"username");
        int age=Integer.parseInt(request.getParameter("cage"));
        String sex=request.getParameter("abc");

        patient.setId(patid);
        patient.setAge(age);
        patient.setSex(sex);
        patient.setName(username);

        session.save(patient);

        transaction.commit();
        session.close();

        request.getRequestDispatcher("/login.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
