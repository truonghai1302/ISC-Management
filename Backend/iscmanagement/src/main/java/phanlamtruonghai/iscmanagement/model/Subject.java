package phanlamtruonghai.iscmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "subjects")
@Indexed
public class Subject {

    private long id;
    private String subCode;
	private String subName;
	private int subScorepass;
    private int subTime;
	
	public Subject() {
		
	}
	
	public Subject(String subCode,String subName,  int subScorepass, int subTime) {
        this.subCode = subCode;
        this.subName = subName;
		this.subScorepass = subScorepass;
		this.subTime = subTime;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    
    @Column(name = "code", nullable = false)
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	@Column(name = "name", nullable = false)
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	
	
	@Column(name = "score_pass", nullable = false)
	public int getSubScorepass() {
		return subScorepass;
	}
	public void setSubScorepass(int subScorepass) {
		this.subScorepass = subScorepass;
	}
	
	@Column(name = "time", nullable = false)
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	
	

	@Override
	public String toString() {
		return "Subject [id=" + id + ",subTime=" + subTime + ", subName=" + subName + ", subCode=" + subCode + ", subScorepass=" + subScorepass
			+ "]";
	}
	
}