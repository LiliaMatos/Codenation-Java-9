package com.challenge;

import javax.persistence.*;
import javax.validation.*;
import java.util.List;
import java.time.*;
import java.util.Calendar;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER", schema="public")
public class User{
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private int id;

	@Column
	@NotNull
	@NotBlank
	/*varchar(100)*/
	@Column(nullable = false, length = 100, unique = true)
	private String full_name;

	@Column
	@NotNull
	@NotBlank
	/*varchar(100)*/
	@Column(nullable = false, length = 100, unique = true)
	private String email;

	@Column
	@NotNull
	@NotBlank
	/*varchar(50)*/
	@Column(nullable = false, length = 50, unique = true)
	private String nickname;

	@Column
	@NotNull
	@NotBlank
	/*varchar(255)*/
	@Column(nullable = false, length = 255, unique = true)
	private String password;

	@Column(nullable =  false)
	@NotBlank
	@Temporal(TemporalType.DATE) 
	private Calendar crated_at;

	@OneToMany(mappedBy = "user") 
	private List<Submission>submissoes;


	@OneToMany(mappedBy = "user")
	private List<Candidate>candidates;
	   
}