package com.reddit.clone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.clone.model.Comment;
import com.reddit.clone.model.Post;
import com.reddit.clone.model.User;

public interface CommentRepository extends JpaRepository<Comment, Long> 
{
   List<Comment> findByPost(Post post);
   
   List<Comment> findByUser(User user);
}
