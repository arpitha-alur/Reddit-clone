package com.reddit.clone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.clone.model.Post;
import com.reddit.clone.model.Subreddit;
import com.reddit.clone.model.User;

public interface PostRepository extends JpaRepository<Post, Long> 
{
	
   List<Post> findAllBySubreddit(Subreddit subreddit);
   
   List<Post> fndByUser(User user);
}
