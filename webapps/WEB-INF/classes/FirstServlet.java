import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {}

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1>Hello Servlet</h1>");
      out.println("<p>This is my first servlet.<p>");
   }

   public void destroy() {}
}