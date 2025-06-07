package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String product = request.getParameter("product");
        HttpSession session = request.getSession();
        session.setAttribute("product", product);
        response.sendRedirect("cart.html");
    }
}
