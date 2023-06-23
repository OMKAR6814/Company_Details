package org.jsp.company_details.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {

	@Id
	private int id;
	private String name;
	private String email;
    private long mno;
    private String loc;
    
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "company")
    private Address address; 
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
    private List<Employee> employee;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
    private List<Computer> computer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMno() {
		return mno;
	}

	public void setMno(long mno) {
		this.mno = mno;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public List<Computer> getComputer() {
		return computer;
	}

	public void setComputer(List<Computer> computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email + ", mno=" + mno + ", loc=" + loc
				+ ", address=" + address + ", employee=" + employee + ", computer=" + computer + "]";
	}
    
    
}
