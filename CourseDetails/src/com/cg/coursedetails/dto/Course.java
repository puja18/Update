package com.cg.coursedetails.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Course_Details")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "cid")
	private int cId;
	private String cName;
	private Double cFees;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Double getcFees() {
		return cFees;
	}
	public void setcFees(Double cFees) {
		this.cFees = cFees;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cFees=" + cFees
				+ "]";
	}
	
	

}
