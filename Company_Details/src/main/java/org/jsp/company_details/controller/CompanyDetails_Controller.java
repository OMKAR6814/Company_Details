package org.jsp.company_details.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.company_details.dao.CompanyDetails_Dao;
import org.jsp.company_details.dto.Address;
import org.jsp.company_details.dto.Company;
import org.jsp.company_details.dto.Computer;
import org.jsp.company_details.dto.Employee;
import org.jsp.company_details.dto.Skill;

public class CompanyDetails_Controller {

	public static void main(String[] args) {
		
		//company
		Company comp=new Company();
		comp.setId(100001);
		comp.setName("skybag");
		comp.setEmail("skybag@gmail.com");
		comp.setMno(89789868);
		comp.setLoc("mahape");
		
		
		//address
		Address add=new Address();
		add.setAid(10001);
		add.setPincode(400701);
		add.setState("Maharashtra");
		add.setCompany(comp);
		comp.setAddress(add);
		
		
		//objects of skills for first employee
		Skill s1=new Skill();
		s1.setId(1);
		s1.setSname("coding");
		s1.setProficiency(3);
		
		Skill s2=new Skill();
		s2.setId(2);
		s2.setSname("communication");
		s2.setProficiency(2);
		
		List<Skill> ls1=new ArrayList<Skill>();
		ls1.add(s1);
		ls1.add(s2);
		
		//objects of skills for second employee
		Skill s3=new Skill();
		s3.setId(3);
		s3.setSname("coding");
		s3.setProficiency(3);
		
		Skill s4=new Skill();
		s4.setId(4);
		s4.setSname("communication");
		s4.setProficiency(2);
		
		List<Skill> ls2=new ArrayList<Skill>();
		ls2.add(s3);
		ls2.add(s4);
		
		//objects of skills for third employee
		Skill s5=new Skill();
		s5.setId(5);
		s5.setSname("coding");
		s5.setProficiency(3);
		
		Skill s6=new Skill();
		s6.setId(6);
		s6.setSname("communication");
		s6.setProficiency(2);
		
		List<Skill> ls3=new ArrayList<Skill>();
		ls3.add(s5);
		ls3.add(s6);
		
		//first object of employee and computer
		Employee emp1=new Employee();
		emp1.setEid(1001);
		emp1.setEname("sumita");
		emp1.setMno(69707697);
		emp1.setAddress("kalyan");
		emp1.setSkill(ls1);
		emp1.setCompany(comp);
		
		Computer c1=new Computer();
		c1.setCid(101);;
		c1.setBrand("HP");
		c1.setPrice(45000);
		c1.setCompany(comp);
		c1.setEmployee(emp1);
		
		emp1.setComputer(c1);
		
		//second object of employee and computer
		Employee emp2=new Employee();
		emp2.setEid(1002);
		emp2.setEname("neha");
		emp2.setMno(69707697);
		emp2.setAddress("kalyan");
		emp2.setSkill(ls2);
		emp2.setCompany(comp);
		
		Computer c2=new Computer();
		c2.setCid(102);;
		c2.setBrand("asus");
		c2.setPrice(40000);
		c2.setCompany(comp);
		c2.setEmployee(emp2);
		
		emp2.setComputer(c2);
		
		//third object of employee and computer
		Employee emp3=new Employee();
		emp3.setEid(1003);
		emp3.setEname("mayuri");
		emp3.setMno(69707697);
		emp3.setAddress("ghansoli");
		emp3.setSkill(ls3);
		emp3.setCompany(comp);
		
		Computer c3=new Computer();
		c3.setCid(103);
		c3.setBrand("mac");
		c3.setPrice(55000);
		c3.setCompany(comp);
		c3.setEmployee(emp3);
		
		emp3.setComputer(c3);
		
		
		List<Employee> le=new ArrayList<Employee>();
		le.add(emp1);
		le.add(emp2);
		le.add(emp3);
		
		List<Computer> lc=new ArrayList<Computer>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		
		
		comp.setEmployee(le);
		comp.setComputer(lc);

		
		CompanyDetails_Dao dao=new CompanyDetails_Dao();
		
		dao.saveCompanyDetails(comp);
//		dao.findCompanyDetailsById(100001);
//		dao.updateCompanyDetails(comp);
//		dao.findAllCompanyDetails();
//		dao.RemoveCompanyById(100001);

	}

}
