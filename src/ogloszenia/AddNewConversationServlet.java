package ogloszenia;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ogloszenia.model.Advertisement;
import ogloszenia.model.Conversation;
import ogloszenia.model.ConversationMessage;
import ogloszenia.repository.AdvertisementRepository;
import ogloszenia.repository.ConversationMessageRepository;
import ogloszenia.repository.UserRepository;

/**
 * Servlet implementation class AddNewMessageServlet
 */
public class AddNewConversationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Integer userId=0;
		userId =(Integer) req.getSession().getAttribute("userId");
		
		String text;
		Integer idAdvertisement = 0;

		text = req.getParameter("message");
		try {
			idAdvertisement = Integer.valueOf(req.getParameter("idAdvertisement"));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
		Optional<Advertisement> ad = AdvertisementRepository.findById(idAdvertisement);
		if (text.isEmpty() || !ad.isPresent()) {
			PrintWriter writer = res.getWriter();
			writer.write("Error!!");
		} else {
			Conversation conversation = new Conversation();
			conversation.setMessageDate(LocalDate.now());
			conversation.setAdvertisementId(ad.get());
			conversation.setConversationSender(UserRepository.findById(userId).get());
			conversation.setConversationReceiver(ad.get().getOwner());
			ConversationMessage conversationMessage = new ConversationMessage(text, conversation);
			
			Optional<ConversationMessage> conversationMessageOptional = 
					ConversationMessageRepository.persist(conversationMessage, userId);
			if(conversationMessageOptional.isPresent())
			res.sendRedirect("czat.jsp?conversationId="+conversationMessageOptional.get().getConversation().getId());
			
		}

	}

}
