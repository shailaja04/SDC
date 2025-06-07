package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String product = (String) session.getAttribute("product");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Product in your cart: " + product + "</h1>");
    }
}
