package ogloszenia;

import org.hibernate.Session;

import ogloszenia.model.Ogloszenie;
import ogloszeniar.hibernate.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session s = HibernateUtil.openSession().getSession();
		
		Ogloszenie o  = s.find(Ogloszenie.class, 1);

	}

}
