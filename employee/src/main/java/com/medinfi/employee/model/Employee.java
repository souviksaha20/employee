package com.medinfi.employee.model;



import java.io.*;
import javax.persistence.*;
import javax.xml.bind.annotation.*;

import org.springframework.stereotype.Component;

@Table
@Entity
@XmlRootElement(name = "employee")
@Component
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Designation;
	@Column(name="number")
	private long phone;
	
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

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	


}
