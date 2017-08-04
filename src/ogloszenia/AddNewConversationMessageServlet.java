package ogloszenia;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogloszenia.model.Conversation;
import ogloszenia.model.ConversationMessage;
import ogloszenia.model.User;
import ogloszenia.repository.ConversationMessageRepository;
import ogloszenia.repository.ConversationRepository;
import ogloszenia.repository.UserRepository;

/**
 * Servlet implementation class AddNewConversationMessageServlet
 */
public class AddNewConversationMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer userId=0;
		userId =(Integer) req.getSession().getAttribute("userId");
		
		
		Integer conversationId = 0;
		String text = "";
	

		try {
			conversationId = Integer.valueOf(req.getParameter("conversationId"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		text = req.getParameter("message");

		// pobieramy konwrsacje
		Optional<Conversation> conversationTmp = ConversationRepository.findById(conversationId);
		if (conversationTmp.isPresent()) {
			Conversation conversation = conversationTmp.get();
			ConversationMessage newMessage = new ConversationMessage(text, conversation);
			Optional<ConversationMessage> conversationMessageOptional=	ConversationMessageRepository.persist(newMessage, userId);
			
			if(conversationMessageOptional.isPresent())
				resp.sendRedirect("czat.jsp?conversationId="+conversationMessageOptional.get().getConversation().getId());


		}

	}

}
