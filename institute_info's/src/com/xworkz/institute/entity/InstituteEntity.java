package com.xworkz.institute.entity;
import java.io.Serializable;
import javax.persistence.Column;
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

	public InstituteEntity(String name, String owner, String hrName, String email, double phoneNo, String location,
			double started, String courseName, int courseInMonths, int noOfTrainies, int noOfTrainers, int noOfBranches,
			float rating, double fees) {
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
	}

}
