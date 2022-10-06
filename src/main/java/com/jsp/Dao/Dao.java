package com.jsp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jas.prsnAadharDto.pancard;
import com.jas.prsnAadharDto.person;


public class Dao 
{
public void savePerson(person p)
{
	EntityManagerFactory wmf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = wmf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	em.persist(p);
	et.commit();
}
public void linkPancard(int id,pancard pa)
{
	EntityManagerFactory wmf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = wmf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	person p=em.find(person.class, id);
	p.setPancard(pa);
	pa.setPerson(p);
	et.begin();
	em.merge(p);
	em.persist(pa);
	et.commit();
}
public static void main(String[] args)
{
	Dao d=new Dao();
	
	person p=new person();
	p.setEmail("Tkr@gmail.com");
	p.setName("Tanmaya kumar roul");
	p.setGender("male");
	p.setPancard(null);
//	d.savePerson(p);
	pancard pa=new pancard();
	pa.setColor("red");
	pa.setPanNo("123AB");
	d.linkPancard(1, pa);
	
}
//what is@joincolumn how its works
//whit is the use of mappedby attribute
//what is the use of name attribute
//how will you check the exception which is related to foregn key
//
}
