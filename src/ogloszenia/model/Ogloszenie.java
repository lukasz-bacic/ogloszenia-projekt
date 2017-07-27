package ogloszenia.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ogloszenie {
	/*
	tytul
    zdjecie
    wlasciciel
    cena
    tresc
    data od
    data do
    czy aktywne
    czy premium
    city name
    ocena od osoby kupujacej
    kategoria
    liczba wyswietlen
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true)
	Integer id;
	
	String title;
	
	String img;
	
	String owner; // TODO User ENTITY
	
	BigDecimal price;
	
	String text;
	
	Integer dateFrom;
	
	Integer dateTo;
	
	Boolean isActive;
	
	Boolean isPremium;
	
	String cityName;
	
	Integer rating;
	
	String category;
	
	Integer views;
	
	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Integer dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Integer getDateTo() {
		return dateTo;
	}

	public void setDateTo(Integer dateTo) {
		this.dateTo = dateTo;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsPremium() {
		return isPremium;
	}

	public void setIsPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

}
