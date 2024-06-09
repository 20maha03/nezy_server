package com.nezy_groups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table")
public class Topic {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String topic_name_ta;
	private String topic_name_en;
	private int subject_id_ta;
	private int subject_id_en;
	private int exam_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic_name_ta() {
		return topic_name_ta;
	}
	public void setTopic_name_ta(String topic_name_ta) {
		this.topic_name_ta = topic_name_ta;
	}
	public String getTopic_name_en() {
		return topic_name_en;
	}
	public void setTopic_name_en(String topic_name_en) {
		this.topic_name_en = topic_name_en;
	}
	public int getSubject_id_ta() {
		return subject_id_ta;
	}
	public void setSubject_id_ta(int subject_id_ta) {
		this.subject_id_ta = subject_id_ta;
	}
	public int getSubject_id_en() {
		return subject_id_en;
	}
	public void setSubject_id_en(int subject_id_en) {
		this.subject_id_en = subject_id_en;
	}
	public int getExam_id() {
		return exam_id;
	}
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", topic_name_ta=" + topic_name_ta + ", topic_name_en=" + topic_name_en
				+ ", subject_id_ta=" + subject_id_ta + ", subject_id_en=" + subject_id_en + ", exam_id=" + exam_id
				+ "]";
	}
	
	
	
	

}
