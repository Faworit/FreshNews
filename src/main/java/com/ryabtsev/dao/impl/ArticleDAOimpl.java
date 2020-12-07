package com.ryabtsev.dao.impl;

import com.ryabtsev.dao.ArticleDAO;
import com.ryabtsev.entity.Article;
import com.ryabtsev.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArticleDAOimpl implements ArticleDAO {
    @Override
    public Article findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Article.class, id);
    }

    @Override
    public void save(Article article) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(article);
        transaction.commit();
        session.close();

    }

    @Override
    public void delete(Article article) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(article);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Article article) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(article);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Article> findAll() {
        System.out.println("TEST in find all");
        List<Article> articles = (List<Article>) HibernateSessionFactoryUtil.getSessionFactory()
                .openSession().createQuery("from Article", Article.class).list();
        return articles;
    }
}
