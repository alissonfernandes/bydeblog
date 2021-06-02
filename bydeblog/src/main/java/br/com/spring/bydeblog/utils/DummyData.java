package br.com.spring.bydeblog.utils;

import br.com.spring.bydeblog.model.Post;
import br.com.spring.bydeblog.repository.BydeblogRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyData {
    
    @Autowired
    BydeblogRepository bydeblogRepository;
    
    //@PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();
        
        Post post1 = new Post();
        
        post1.setAuthor("Author name");
        post1.setDate(LocalDate.now());
        post1.setTitle("Title 1");
        post1.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad, obcaecati omnis? Commodi at saepe natus eius! Consectetur possimus laborum consequatur itaque qui recusandae nostrum atque iure quas, blanditiis exercitationem eveniet?");
        
        Post post2 = new Post();
        post2.setAuthor("Author name");
        post2.setDate(LocalDate.now());
        post2.setTitle("Title 2");
        post2.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad, obcaecati omnis? Commodi at saepe natus eius! Consectetur possimus laborum consequatur itaque qui recusandae nostrum atque iure quas, blanditiis exercitationem eveniet?");
    
        postList.add(post1);
        postList.add(post2);
        
        for(Post post: postList){
            Post postSaved = bydeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
