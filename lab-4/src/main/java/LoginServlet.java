

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String validUserId;
    private String validPassword;

    public void init() throws ServletException {
        validUserId = getInitParameter("validUserId");
        validPassword = getInitParameter("validPassword");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving user ID and password from the submitted form
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");

        // Validating user ID and password
        if (userId.equals(validUserId) && password.equals(validPassword)) {
            out.println("<html><head><title>Login Successful</title></head><body>");
            out.println("<h2>Login Successful</h2>");
            out.println("<p>Welcome, " + userId + "!</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><head><title>Login Failed</title></head><body>");
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Invalid user ID or password. Please try again.</p>");
            out.println("</body></html>");
        }
    }

}
