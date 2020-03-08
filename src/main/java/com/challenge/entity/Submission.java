package com.challenge;

import javax.persistence.*;
import javax.validation.*;
import java.time.*;
import java.util.List;
import java.util.Calendar;
  
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SUBMISSION", schema="public")
public class Submission{
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int user_id;

	
	@NotNull
	@NotBlank
	private int challenge_id;

	
	@NotNull
	@NotBlank
	private float score;

	
	@NotNull
	@NotBlank
	private Calendar crated_at;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "user_id")
	private User  users;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "challenge_id")
	private Challenge  challenges;

}