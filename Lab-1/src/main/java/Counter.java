

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Counter
 */
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Counter() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }

        counter++;

        session.setAttribute("counter", counter);

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Page Counter Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Page Counter</h2>");
        out.println("<p>This page has been accessed " + counter + " times.</p>");
        out.println("</body>");
        out.println("</html>");
    }

}
