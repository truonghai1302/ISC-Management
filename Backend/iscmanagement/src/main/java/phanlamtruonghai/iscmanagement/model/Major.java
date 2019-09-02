package phanlamtruonghai.iscmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "majors")
@Indexed
public class Major {

	private long id;
	private String mjName;
	
	public Major() {
		
	}
	
	public Major(String mjName) {
		this.mjName = mjName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getMjName() {
		return mjName;
	}
	public void setMjName(String mjName) {
		this.mjName = mjName;
	}

	@Override
	public String toString() {
		return "Major [id=" + id + ", mjName=" + mjName + "]";
	}
	
}