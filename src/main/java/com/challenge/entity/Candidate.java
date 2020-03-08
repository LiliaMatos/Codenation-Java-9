package com.challenge;

import javax.persistence.*;
import javax.validation.*;
import java.time.*;
import java.util.List;
import java.util.Calendar;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CANDIDATE", schema="public")
public class Candidate{
	
	@Column
	@NotNull
	@NotBlank
	private int user_id;

	@Column
	@NotNull
	@NotBlank
	private int accelaration_id;

	@Column
	@NotNull
	@NotBlank
	private float company_id;

	@Column
	@NotNull
	@NotBlank
	private int status;

	@Column(nullable =  false)
	@NotBlank
	@Temporal(TemporalType.DATE) 
	private Calendar crated_at;

	@ManytoOne
	@NotNull
	@JoinColumn(name = "user_id")
	private User  users;

	@ManyToOne
	@JoinColumn(name = "acceleration_id", nullable = false)
	private Acceleration  accelerations;

	@ManyToOne
	@JoinColumn(name = "company_id", nullable =false)
	private Company companies;

}