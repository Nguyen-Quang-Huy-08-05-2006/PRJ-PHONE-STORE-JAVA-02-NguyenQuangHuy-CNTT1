package com.phonestore.service;

import com.phonestore.dao.CategoryDAO;
import com.phonestore.dao.CategoryDAOImpl;
import com.phonestore.model.Category;

import java.util.List;

public class CategoryService {
    private CategoryDAO dao = new CategoryDAOImpl();

    public List<Category> getAll() {
        return dao.findAll();
    }

    public void add(Category c) {
        dao.insert(c);
    }

    public void edit(Category c) {
        dao.update(c);
    }

    public void remove(int id) {
        dao.delete(id);
    }
}