package com.ryabtsev.controller;

import com.ryabtsev.dao.impl.ArticleDAOimpl;
import com.ryabtsev.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class NewsController {

    private final ArticleDAOimpl articleDAOimpl;

    public NewsController(ArticleDAOimpl articleDAOimpl) {
        this.articleDAOimpl = articleDAOimpl;
    }

    /*public NewsController(ArticleDAO articleDAOimpl) {
        this.articleDAOimpl = articleDAOimpl;
    }*/

    @GetMapping()
    public String showNews(Model model) {
        model.addAttribute("articles", articleDAOimpl.findAll());
        System.out.println("TEST before return");
        return "index";
    }

    @GetMapping("/login")
    public String auth() {
        return "login";
    }

    @PostMapping("/add")
    public String addNews(@ModelAttribute("Artivle") Article article) {

        return null;

    }
}
