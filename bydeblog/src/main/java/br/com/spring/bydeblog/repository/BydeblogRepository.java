package br.com.spring.bydeblog.repository;

import br.com.spring.bydeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BydeblogRepository extends JpaRepository<Post, Long>{
    
}
