package formulaire;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FormulaireServlet
 */
@WebServlet("/FormulaireServlet")
public class FormulaireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String leftText = request.getParameter("leftText");
		String rightText = request.getParameter("rightText");
		
		
		 if (request.getParameter("toRight") != null) {
			 request.setAttribute("leftText", leftText);
			 request.getRequestDispatcher("formulaire.jsp").forward(request, response);
	     } 
		 if (request.getParameter("toLeft") != null) {
			 request.setAttribute("rightText", rightText);
	    	 request.getRequestDispatcher("formulaire.jsp").forward(request, response);
	            
		
	}

} }
