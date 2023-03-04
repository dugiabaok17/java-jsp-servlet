package com.example.java_servlet.repositories.impl;

import com.example.java_servlet.config.HibernateUtil;
import com.example.java_servlet.model.Category;
import com.example.java_servlet.repositories.ICategoryRepositories;
import org.hibernate.Session;

import java.util.List;

public class CategoryRepositories implements ICategoryRepositories {
    @Override
    public List<Category> fillAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Category> list = session.createSQLQuery("From Category").list();
        return list;
    }
}
