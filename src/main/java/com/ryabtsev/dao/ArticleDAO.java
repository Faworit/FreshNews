package com.ryabtsev.dao;

import com.ryabtsev.entity.Article;
import com.ryabtsev.entity.User;

import java.util.List;

public interface ArticleDAO {
    Article findById(int id);
    void save(Article article);
    void delete(Article article);
    void update(Article article);
    List<Article> findAll();
}
