package com.reddit.clone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.clone.model.Post;
import com.reddit.clone.model.User;
import com.reddit.clone.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
	
     Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post,User currentUser);
}
