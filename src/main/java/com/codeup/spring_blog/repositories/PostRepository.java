package com.codeup.spring_blog.repositories;

import com.codeup.spring_blog.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
}
