package ru.ruslan.demoon.controllers;

import org.springframework.ui.Model; //import ch.qos.logback.core.model.Model; - говно
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ruslan.demoon.models.Post;
import ru.ruslan.demoon.repo.PostRepository;


@Controller
public class BlogDemoonController {
// @Autowired необходим для создания переменной которая ссылается на репозиторий
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }
}
