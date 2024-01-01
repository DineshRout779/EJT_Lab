

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentDetails
 */
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving form parameters
        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollNo");
        String sex = request.getParameter("sex");
        String semester = request.getParameter("semester");

        // Retrieving hobbies as an array
        String[] hobbies = request.getParameterValues("hobbies");

        // Retrieving the selected programming languages
        String programmingLanguage = request.getParameter("programmingLanguage");

        // HTML response
        out.println("<html>");
        out.println("<head><title>Student Details</title></head>");
        out.println("<body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Roll No:</strong> " + rollNo + "</p>");
        out.println("<p><strong>Sex:</strong> " + sex + "</p>");
        out.println("<p><strong>Semester:</strong> " + semester + "</p>");
        
        if (hobbies != null && hobbies.length > 0) {
            out.println("<p><strong>Hobbies:</strong> ");
            for (String hobby : hobbies) {
                out.println(hobby + " ");
            }
            out.println("</p>");
        }

        if (programmingLanguage != null && !programmingLanguage.isEmpty()) {
            out.println("<p><strong>Programming Language Known:</strong> " + programmingLanguage + "</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }

}
