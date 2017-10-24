
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Prueba01
 */
@WebServlet(
		description = "MiPrimerServletPara Prueba", 
		urlPatterns = { "/Prueba01" }
		)
	public class Prueba01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String dato = "";
		dato = request.getParameter("nombre");
		Persona persona = new Persona();
		Gson gson = new Gson();
		persona = gson.fromJson(dato, Persona.class);
		
		PrintWriter miPrintWriter = new PrintWriter(response.getWriter());
		
		System.out.println(persona.getNombre());
		miPrintWriter.println(dato);
	}

}
