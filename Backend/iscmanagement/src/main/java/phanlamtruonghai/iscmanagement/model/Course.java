package phanlamtruonghai.iscmanagement.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "courses")
@Indexed
public class Course {
	private long id;
	private String Topic;
    @Field(termVector = TermVector.YES, analyze=Analyze.YES, store=Store.NO)
	@Type(type = "text")
	private Date Start;
	private Date End;
	private String Description;
	
	public Course() {}

	public Course(String topic, Date start, Date end, String description) {
		Topic = topic;
		Start = start;
		End = end;
		Description = description;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "topic", nullable = false)
	public String getTopic() {
		return Topic;
	}

	public void setTopic(String topic) {
		Topic = topic;
	}

	@Column(name = "start", nullable = false)
	public Date getStart() {
		return Start;
	}

	public void setStart(Date start) {
		Start = start;
	}

	@Column(name = "end", nullable = false)
	public Date getEnd() {
		return End;
	}

	public void setEnd(Date end) {
		End = end;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", Topic=" + Topic + ", Start=" + Start + ", End=" + End + ", Description="
				+ Description + "]";
	}
	
	
	
	
}
