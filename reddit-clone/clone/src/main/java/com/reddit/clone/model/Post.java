package com.reddit.clone.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Post {
   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long postId;
	
	@NotBlank(message="Post Name cannot be empty")
	private String postName;
	
	@Nullable
	private String url;
	
	@Nullable
	@Lob
	private String description;
	
	private Integer voteCount;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id",referencedColumnName="id")
	private Subreddit subreddit;
	
}

