package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        int heure = Integer.parseInt(request.getParameter("heure"));

        String name = nom + " " + prenom + " !!";

        String morning = "Good morning ";
        String afternoon = "Good afternoon ";
        String evening = "Good evening ";
        String night = "Good night ";

        String message;


        if (heure < 12) {
            message = morning + name;
        }
        else if (heure >= 12 && heure < 18) {
            message = afternoon + name;
        }
        else if (heure >= 18 && heure < 22) {
            message = evening + name;
        }
        else {
            message = night + name;
        }
        request.setAttribute("sample", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
}
