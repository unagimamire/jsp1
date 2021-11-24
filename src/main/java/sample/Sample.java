package sample;
 
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class Sample01
 */
@WebServlet("/sample/Sample")
public class Sample extends HttpServlet{
private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
 
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
 
        out.println("<html>");
        out.println("<head>");
        out.println("<title>�T�[�u���b�g�̃T���v��</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>�T�[�u���b�g�̃T���v��</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}