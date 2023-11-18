import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addEmployee")
public class EmployeeServlet extends HttpServlet {
    private List<Employee> employees = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        LocalDate dob = LocalDate.parse(request.getParameter("dob"));
        String email = request.getParameter("email");
        LocalDate joiningDate = LocalDate.parse(request.getParameter("joiningDate"));

        Employee employee = new Employee(id, name, dob, email, joiningDate);
        LeaveCalculator.calculateLeaves(employee);
        employees.add(employee);

        // Forward to a JSP or send response back to client
        // The response can include a success message or redirection to the employee list page
    }

    // Additional methods like doGet to display employees, etc.
}

