package com.xworkz.vendor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "vendor_table")
@Entity
@NamedQueries({
	  @NamedQuery(name="getLoginNameAndPassword",
			  query="select vendor from VendorEntity vendor where vendor.loginName=:bd and vendor.password=:psd"),
	  @NamedQuery(name="getEmail",
	         query="select vendor from VendorEntity vendor where vendor.email=:em"),
	  @NamedQuery(name="updatePasswordByEmail",
	         query="update  VendorEntity  set password=:psd where email=:em " )

	  
})
public class VendorEntity implements Serializable {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "loginName")
	private String loginName;
	@Column(name = "password")
	private String password;
	@Column(name = "address")
	private String address;
	@Column(name = "gstNo")
	private String gstNo;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdAt")
	private LocalDateTime createdAt;
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "updatedAt")
	private LocalDateTime updatedAt;
	public VendorEntity(String name, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt) {
		super();
		this.name = name;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
	}

	

}
