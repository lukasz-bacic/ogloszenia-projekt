package ogloszenia.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import ogloszenia.model.CATEGORY;
import ogloszenia.model.dto.CategoryDTO;

public class CategoryRepository {
	
	/*
	 * ELEKTRONIKA,MOTORYZACJA,NIERUCHOMOSCI,MODA,SPORT_I_REKREACJA,MUZYKA_I_EDUKACJA,USLUGI,PRACA

	 */

	public static List<CategoryDTO> findAll() {
		List<CategoryDTO> categories = new ArrayList<>();
		categories.add(new CategoryDTO("Elektronika", "fa-gamepad", CATEGORY.ELEKTRONIKA));
		categories.add(new CategoryDTO("Motoryzacja", "fa-car", CATEGORY.MOTORYZACJA));

		return categories;
	}
	
	public static CategoryDTO findByCategory(CATEGORY category) {
		
		return findAll().stream().
				filter(e -> e.getCategory().equals(category)).
				findFirst().get();
	}

}
