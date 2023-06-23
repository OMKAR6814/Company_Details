package org.jsp.company_details.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Skill {

	@Id
	private int id;
	private String sname;
	private int proficiency;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getProficiency() {
		return proficiency;
	}
	public void setProficiency(int proficiency) {
		this.proficiency = proficiency;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", sname=" + sname + ", proficiency=" + proficiency + "]";
	}
	
	
}
