package com.challenge;


import javax.persistence.*;
import javax.validation.*;
import java.time.*;
import java.util.List;
import java.util.Calendar;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ACCELERATION", schema="public")
public class Acceleration{
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;

	/*varchar(100)*/
	@Column(length = 100)
	private String name;

	/*varchar(50)*/
	@Column(nullable = false, length = 50, unique = true)
	private String slug;


	@Column
	@NotNull
	@NotBlank
	private int challenge_id;

	@Column(nullable = false)
	@NotBlank
	@Temporal(TemporalType.DATE) 
	private Calendar crated_at;

	@OneToMany(mappedBy = "accelerations")
	private List<Candidate> candidates;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "challenge_id")
	private Challenge  challenges;
}