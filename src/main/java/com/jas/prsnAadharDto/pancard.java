package com.jas.prsnAadharDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class pancard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String PanNo;
private String color;
@OneToOne
@JoinColumn(name="myPerson")
private person person;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPanNo() {
	return PanNo;
}
public void setPanNo(String panNo) {
	PanNo = panNo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public person getPerson() {
	return person;
}
public void setPerson(person person) {
	this.person = person;
}


}
