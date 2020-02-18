package com.via.springbootweb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="findAllCourses", query="from Course e")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	
	String title;	
	String summary;

	String category;
	String price;
	public Course(){}
	public Course(int id, String title, String summary, String category, String price) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.category = category;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", summary=" + summary + ", category=" + category + ", price="
				+ price + "]";
	}
	
}
