package ogloszenia.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ogloszenie {
	
	@Id
	Integer id;


	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
