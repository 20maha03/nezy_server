package com.nezy_groups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "name")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
    
	private String exam_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", exam_name=" + exam_name + "]";
	}
	
}
