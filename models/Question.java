package com.nezy_groups.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question_ta;
    private String question_en;
    private String option1_ta;
    private String option1_en;
    private String option2_ta;
    private String option2_en;
    private String option3_ta;
    private String option3_en;
    private String option4_ta;
    private String option4_en;
    private String correct_answer_ta;
    private String correct_answer_en;
    private String explaination_ta;
    private String explaination_en;
    
    

    public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getQuestion_ta() {
		return question_ta;
	}



	public void setQuestion_ta(String question_ta) {
		this.question_ta = question_ta;
	}



	public String getQuestion_en() {
		return question_en;
	}



	public void setQuestion_en(String question_en) {
		this.question_en = question_en;
	}



	public String getOption1_ta() {
		return option1_ta;
	}



	public void setOption1_ta(String option1_ta) {
		this.option1_ta = option1_ta;
	}



	public String getOption1_en() {
		return option1_en;
	}



	public void setOption1_en(String option1_en) {
		this.option1_en = option1_en;
	}



	public String getOption2_ta() {
		return option2_ta;
	}



	public void setOption2_ta(String option2_ta) {
		this.option2_ta = option2_ta;
	}



	public String getOption2_en() {
		return option2_en;
	}



	public void setOption2_en(String option2_en) {
		this.option2_en = option2_en;
	}



	public String getOption3_ta() {
		return option3_ta;
	}



	public void setOption3_ta(String option3_ta) {
		this.option3_ta = option3_ta;
	}



	public String getOption3_en() {
		return option3_en;
	}



	public void setOption3_en(String option3_en) {
		this.option3_en = option3_en;
	}



	public String getOption4_ta() {
		return option4_ta;
	}



	public void setOption4_ta(String option4_ta) {
		this.option4_ta = option4_ta;
	}



	public String getOption4_en() {
		return option4_en;
	}



	public void setOption4_en(String option4_en) {
		this.option4_en = option4_en;
	}



	public String getCorrect_answer_ta() {
		return correct_answer_ta;
	}



	public void setCorrect_answer_ta(String correct_answer_ta) {
		this.correct_answer_ta = correct_answer_ta;
	}



	public String getCorrect_answer_en() {
		return correct_answer_en;
	}



	public void setCorrect_answer_en(String correct_answer_en) {
		this.correct_answer_en = correct_answer_en;
	}


	public String getExplaination_ta() {
		return explaination_ta;
	}



	public void setExplaination_ta(String explaination_ta) {
		this.explaination_ta = explaination_ta;
	}



	public String getExplaination_en() {
		return explaination_en;
	}



	public void setExplaination_en(String explaination_en) {
		this.explaination_en = explaination_en;
	}



	@Override
    public String toString() {
        return "Question [id = " + id + ", question_ta = " + question_ta + ", question_en = " + question_en + ", option1_ta = "
                + option1_ta + ", option1_en = " + option1_en + ", option2_ta = " + option2_ta + ", option2_en = "
                + option2_en + ", option3_ta = " + option3_ta + ", option3_en = " + option3_en + ", option4_ta = "
                + option4_ta + ", option4_en = " + option4_en + ", correct_answer_ta = " + correct_answer_ta
                + ", correct_answer_en = " + correct_answer_en + ", explaination_ta = " + explaination_ta + ", explaination_en = "+explaination_en +"]";
    }
	
}
