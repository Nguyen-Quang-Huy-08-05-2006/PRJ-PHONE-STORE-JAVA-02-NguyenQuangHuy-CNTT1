package com.phonestore.dao;

import com.phonestore.model.Category;
import java.util.List;

public interface CategoryDAO {
    List<Category> findAll();

    void insert(Category category);

    void update(Category category);

    void delete(int id);
}