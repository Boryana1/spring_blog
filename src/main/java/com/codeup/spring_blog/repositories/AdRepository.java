package com.codeup.spring_blog.repositories;

import com.codeup.spring_blog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
}
