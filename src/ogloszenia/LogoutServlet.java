package ogloszenia;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogloszenia.model.User;
import ogloszenia.repository.UserRepository;

/**
 * Servlet implementation class LogoutServlet
 */

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer userId = null;
        userId = (Integer) req.getSession().getAttribute("userId");

        if (userId != null) {
            
                req.getSession().setAttribute("userId", null);
                resp.sendRedirect("index.jsp");
            
        } else {
            //resp.getWriter().write("Nikt nie jest zalogowany.");
            resp.sendRedirect("index.jsp");
        }
    }

}
