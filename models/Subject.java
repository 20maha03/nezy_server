package com.nezy_groups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
     
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String subject_name_ta;
	private String subject_name_en;
	
	@OneToOne
	@JoinColumn(name = "topic_id")
	private Topic topic;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject_name_ta() {
		return subject_name_ta;
	}
	public void setSubject_name_ta(String subject_name_ta) {
		this.subject_name_ta = subject_name_ta;
	}
	public String getSubject_name_en() {
		return subject_name_en;
	}
	public void setSubject_name_en(String subject_name_en) {
		this.subject_name_en = subject_name_en;
	}
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", subject_name_ta=" + subject_name_ta + ", subject_name_en=" + subject_name_en + "]";
	}
}
