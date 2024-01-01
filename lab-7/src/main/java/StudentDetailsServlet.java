import beans.StudentBean;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentDetailsServlet")
public class StudentDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollNo");
        String gender = request.getParameter("gender");
        String semester = request.getParameter("semester");

        // Create a StudentBean and set values
        StudentBean student = new StudentBean();
        student.setName(name);
        student.setRollNo(rollNo);
        student.setGender(gender);
        student.setSemester(semester);

        // Set the StudentBean as a request attribute
        request.setAttribute("student", student);

        // Forward to the JSP for rendering
        request.getRequestDispatcher("display-student-details.jsp").forward(request, response);
    }
}