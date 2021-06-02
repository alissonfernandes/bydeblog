package br.com.spring.bydeblog.service.serviceImpl;

import br.com.spring.bydeblog.model.Post;
import br.com.spring.bydeblog.repository.BydeblogRepository;
import br.com.spring.bydeblog.service.BydeblogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BydeblogServiceImpl  implements BydeblogService{
    
    @Autowired
    BydeblogRepository bydeblogRepository;

    @Override
    public List<Post> findAll() {
        return bydeblogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return bydeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return bydeblogRepository.save(post);
    }
    
}
