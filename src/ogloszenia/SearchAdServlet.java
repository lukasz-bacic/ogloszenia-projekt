package ogloszenia;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogloszenia.model.Advertisement;
import ogloszenia.repository.AdvertisementRepository;

/**
 * Servlet implementation class SearchAdServlet
 */

public class SearchAdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String location;
		String phrase;
		
		location=req.getParameter("location");
		phrase = req.getParameter("phrase");
		
		phrase = (phrase == null) ? "" : phrase;
		
		if(location == null || location.isEmpty()) {
			resp.sendRedirect("search-results.jsp?phrase=" + phrase);
		}else {
			resp.sendRedirect("search-results.jsp?phrase=" + phrase + "&location=" + location);
		}
		
	}

}
