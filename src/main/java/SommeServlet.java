

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/somme")
public class SommeServlet extends HttpServlet {
	private int nbr1;
	private int nbr2;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean teste=true;
		if(request.getParameter("nbr1")!=null && !request.getParameter("nbr1").equals(""))
		{
			teste=false;
		}
		if(request.getParameter("nbr2")!=null && !request.getParameter("nbr2").equals(""))
		{
			teste=false;
		}
		if(teste) {
			request.setAttribute("message", "all fields are required");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else
		{
			System.out.println("calculating somme");
			nbr1=Integer.parseInt(request.getParameter("nbr1"));
			nbr2=Integer.parseInt(request.getParameter("nbr2"));
			request.setAttribute("somme", nbr1+nbr2);
			request.getRequestDispatcher("/somme.jsp").forward(request, response);
		}
	}

}
