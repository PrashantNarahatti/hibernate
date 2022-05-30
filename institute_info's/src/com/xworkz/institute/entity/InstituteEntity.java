package com.xworkz.institute.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@Table(name = "institute_table")
@Entity
public class InstituteEntity implements Serializable 
{

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "owner")
	private String owner;
	@Column(name = "hrName")
	private String hrName;
	@Column(name = "email")
	private String email;
	@Column(name = "phoneNo")
	private double phoneNo;
	@Column(name = "location")
	private String location;
	@Column(name = "started")
	private double started;
	@Column(name = "courseName")
	private String courseName;
	@Column(name = "courseInMonths")
	private int courseInMonths;
	@Column(name = "noOfTrainies")
	private int noOfTrainies;
	@Column(name = "noOfTrainers")
	private int noOfTrainers;
	@Column(name = "noOfBranches")
	private int noOfBranches;
	@Column(name = "rating")
	private float rating;
	@Column(name = "fees")
	private double fees;
	@Column(name = "updatedAt")
	private  LocalDateTime updatedAt;
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "cratedBy")
	private String cratedBy;
	@Column(name = "cratedAt")
	private LocalDateTime cratedAt;
	
	public InstituteEntity(String name, String owner, String hrName, String email, double phoneNo, String location,
			double started, String courseName, int courseInMonths, int noOfTrainies, int noOfTrainers, int noOfBranches,
			float rating, double fees, LocalDateTime updatedAt, String updatedBy, String cratedBy,
			LocalDateTime cratedAt) {
		super();
		this.name = name;
		this.owner = owner;
		this.hrName = hrName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.location = location;
		this.started = started;
		this.courseName = courseName;
		this.courseInMonths = courseInMonths;
		this.noOfTrainies = noOfTrainies;
		this.noOfTrainers = noOfTrainers;
		this.noOfBranches = noOfBranches;
		this.rating = rating;
		this.fees = fees;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.cratedBy = cratedBy;
		this.cratedAt = cratedAt;
	}
	

	
	

}
