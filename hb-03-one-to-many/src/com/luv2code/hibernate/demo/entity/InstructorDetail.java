package com.luv2code.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")

public class InstructorDetail {
	
	//annaonation the class as entity and map to the db table
	
	//define the fields
	
	//annotate the fields with db column names
	
	//create constructors
	
	//generate getter/setter method
	
	//generate tostring method
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	
	@Column(name="hobby")
	private String hobby;
	
	//add new field for instructor(also add getter/setter)
	
	//add @onetoone annotation
	
	@OneToOne(mappedBy="instructorDetail",cascade=CascadeType.ALL)
	private Instructor instructor;
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public InstructorDetail() {
		
	}
	
	//generate tostring method

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
	
	//generate getter/setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	//constructor

	public InstructorDetail(String youtubeChannel, String hobby) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
