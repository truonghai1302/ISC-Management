package phanlamtruonghai.iscmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	private long id;
	private String stdName;
	private String stdCode;
	private String stdEmail;
	private int stdId;
	private String stdAddress;
	private String stdGender;
	
	public Student() {
		
	}
	
	public Student(String stdName, String stdCode, String stdEmail, int stdId, String stdAddress, String stdGender) {
		this.stdName = stdName;
		this.stdCode = stdCode;
		this.stdEmail = stdEmail;
		this.stdId = stdId;
		this.stdAddress = stdAddress;
		this.stdGender = stdGender;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	@Column(name = "code", nullable = false)
	public String getStdCode() {
		return stdCode;
	}
	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}
	
	@Column(name = "email", nullable = false)
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	
	@Column(name = "id_card", nullable = false)
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	@Column(name = "address", nullable = false)
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	
	@Column(name = "gender", nullable = false)
	public String getStdGender() {
		return stdGender;
	}
	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", stdCode=" + stdCode + ", stdEmail=" + stdEmail
			+ ",stdId=" + stdId + ",stdAddress=" + stdAddress + ",stdGender=" + stdGender + "]";
	}
	
}
