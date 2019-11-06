package com.bwei.beans;

public class Movie {

	private Integer id;
	
	private String name;
	
	private String author;
	
	private String price;
	
	private String datetime;
	
	private Integer time;
	
	private String type;
	
	private String year;
	
	private String ope;
	
	private String note;

	public Movie(Integer id, String name, String author, String price, String datetime, Integer time, String type,
			String year, String ope, String note) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.datetime = datetime;
		this.time = time;
		this.type = type;
		this.year = year;
		this.ope = ope;
		this.note = note;
	}

	public Movie() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getOpe() {
		return ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", datetime="
				+ datetime + ", time=" + time + ", type=" + type + ", year=" + year + ", ope=" + ope + ", note=" + note
				+ "]";
	}
	
	
}
