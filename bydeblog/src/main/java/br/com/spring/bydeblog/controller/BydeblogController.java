package br.com.spring.bydeblog.controller;

import br.com.spring.bydeblog.model.Post;
import br.com.spring.bydeblog.service.BydeblogService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BydeblogController {
    
    @Autowired
    BydeblogService bydeblogService;
    
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView modelAndView = new ModelAndView("posts");
        List<Post> posts = bydeblogService.findAll();
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }
    
}
