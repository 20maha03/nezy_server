package com.nezy_groups.models;
import jakarta.persistence.Column;
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
    private Long id;
    
    @Column(name = "question_ta")
    private String questionTa;
    
    @Column(name = "question_en")
    private String questionEn;
    
    @Column(name = "option1_ta")
    private String option1Ta;
    
    @Column(name = "option1_en")
    private String option1En;
    
    @Column(name = "option2_ta")
    private String option2Ta;
    
    @Column(name = "option2_en")
    private String option2En;
    
    @Column(name = "option3_ta")
    private String option3Ta;
    
    @Column(name = "option3_en")
    private String option3En;
    
    @Column(name = "option4_ta")
    private String option4Ta;
    
    @Column(name = "option4_en")
    private String option4En;
    
    @Column(name = "correct_answer_ta")
    private String correctAnswerTa;
    
    @Column(name = "correct_answer_en")
    private String correctAnswerEn;
    
    @Column(name = "explaination_ta")
    private String explainationTa;
    
    @Column(name = "explaination_en")
    private String explainationEn;
    
    @Column(name = "subject_id") 
    private Long subjectId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionTa() {
		return questionTa;
	}

	public void setQuestionTa(String questionTa) {
		this.questionTa = questionTa;
	}

	public String getQuestionEn() {
		return questionEn;
	}

	public void setQuestionEn(String questionEn) {
		this.questionEn = questionEn;
	}

	public String getOption1Ta() {
		return option1Ta;
	}

	public void setOption1Ta(String option1Ta) {
		this.option1Ta = option1Ta;
	}

	public String getOption1En() {
		return option1En;
	}

	public void setOption1En(String option1En) {
		this.option1En = option1En;
	}

	public String getOption2Ta() {
		return option2Ta;
	}

	public void setOption2Ta(String option2Ta) {
		this.option2Ta = option2Ta;
	}

	public String getOption2En() {
		return option2En;
	}

	public void setOption2En(String option2En) {
		this.option2En = option2En;
	}

	public String getOption3Ta() {
		return option3Ta;
	}

	public void setOption3Ta(String option3Ta) {
		this.option3Ta = option3Ta;
	}

	public String getOption3En() {
		return option3En;
	}

	public void setOption3En(String option3En) {
		this.option3En = option3En;
	}

	public String getOption4Ta() {
		return option4Ta;
	}

	public void setOption4Ta(String option4Ta) {
		this.option4Ta = option4Ta;
	}

	public String getOption4En() {
		return option4En;
	}

	public void setOption4En(String option4En) {
		this.option4En = option4En;
	}

	public String getCorrectAnswerTa() {
		return correctAnswerTa;
	}

	public void setCorrectAnswerTa(String correctAnswerTa) {
		this.correctAnswerTa = correctAnswerTa;
	}

	public String getCorrectAnswerEn() {
		return correctAnswerEn;
	}

	public void setCorrectAnswerEn(String correctAnswerEn) {
		this.correctAnswerEn = correctAnswerEn;
	}

	public String getExplainationTa() {
		return explainationTa;
	}

	public void setExplainationTa(String explainationTa) {
		this.explainationTa = explainationTa;
	}

	public String getExplainationEn() {
		return explainationEn;
	}

	public void setExplainationEn(String explainationEn) {
		this.explainationEn = explainationEn;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", questionTa=" + questionTa + ", questionEn=" + questionEn + ", option1Ta="
				+ option1Ta + ", option1En=" + option1En + ", option2Ta=" + option2Ta + ", option2En=" + option2En
				+ ", option3Ta=" + option3Ta + ", option3En=" + option3En + ", option4Ta=" + option4Ta + ", option4En="
				+ option4En + ", correctAnswerTa=" + correctAnswerTa + ", correctAnswerEn=" + correctAnswerEn
				+ ", explainationTa=" + explainationTa + ", explainationEn=" + explainationEn + ", subjectId="
				+ subjectId + "]";
	}
}
