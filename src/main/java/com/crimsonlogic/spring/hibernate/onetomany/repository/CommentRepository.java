package com.crimsonlogic.spring.hibernate.onetomany.repository;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crimsonlogic.spring.hibernate.onetomany.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
  List<Comment> findByTutorialId(Long postId);
  
  @Transactional
  void deleteByTutorialId(long tutorialId);
}
