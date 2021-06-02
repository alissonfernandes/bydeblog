package br.com.spring.bydeblog.service;

import br.com.spring.bydeblog.model.Post;
import java.util.List;

public interface BydeblogService {
    
    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
