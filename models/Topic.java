package com.nezy_groups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "topic")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String topic_name_ta;
	private String topic_name_en;
	private int subject_id;
	
	@OneToOne
	@JoinColumn(name = "exam_id")
	private Exam exam;
	
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
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", topic_name_ta=" + topic_name_ta + ", topic_name_en=" + topic_name_en
				+ ", subject_id=" + subject_id + ", exam=" + exam + "]";
	}
}
