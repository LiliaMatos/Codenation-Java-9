package com.challenge;

import javax.persistence.*;
import javax.validation.*;
import java.time.*;
import java.util.List;
import java.util.Calendar;
  
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CHALLENGE", schema="public")
public class Challenge{
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;

	/*varchar(100)*/
	@Column(nullable = false, length = 100, unique = true)
	private String name;

	/*varchar(50)*/
	@Column(nullable = false, length = 50, unique = true)
	private String slug;

	@Column(nullable = false)
	@NotBlank
	@Temporal(TemporalType.DATE) 
	private Calendar crated_at;

	@OneToMany(mappedBy = "Challenge")
	private List<Acceleration>accelerations;

	@OneToMany(mappedBy = "Challenge")
	private List<Submission>submissions;

}