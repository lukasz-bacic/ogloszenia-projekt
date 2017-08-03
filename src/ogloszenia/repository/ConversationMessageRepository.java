package ogloszenia.repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.Query;

import org.hibernate.Session;

import ogloszenia.model.Conversation;
import ogloszenia.model.ConversationMessage;
import ogloszeniar.hibernate.util.HibernateUtil;

public class ConversationMessageRepository {
	
	public static Integer persist(ConversationMessage conversationMessage) {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			session.getTransaction().begin();
			session.persist(conversationMessage);
			session.getTransaction().commit();
			return conversationMessage.getId();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return 0;
		} finally {
			session.close();
		}

	}
	
	public static List<ConversationMessage> findByConversationId(Integer id) {
		Session session = null;
		try {
			session = HibernateUtil.openSession();
			String hql = "SELECT  e FROM ConversationMessage e WHERE e.conversation.id=:id";
			Query query = session.createQuery(hql);
			query.setParameter("id",id);
			return  query.getResultList();
		} catch (Exception ex) {
			ex.printStackTrace();
			session.getTransaction().rollback();
			return Collections.emptyList();
		} finally {
			session.close();
		}
	}
	
	

}
