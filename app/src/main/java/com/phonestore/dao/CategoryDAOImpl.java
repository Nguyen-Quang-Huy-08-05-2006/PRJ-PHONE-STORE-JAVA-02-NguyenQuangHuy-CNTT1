package com.phonestore.dao;

import com.phonestore.model.Category;
import com.phonestore.util.MyDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {

    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        String sql = "SELECT * FROM categories";

        try (Connection conn = MyDatabase.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Category c = new Category(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"));
                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void insert(Category category) {
        String sql = "INSERT INTO categories(name, description) VALUES (?, ?)";

        try (Connection conn = MyDatabase.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());

            ps.executeUpdate();
            System.out.println(" Thêm thành công");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Category category) {
        String sql = "UPDATE categories SET name=?, description=? WHERE id=?";

        try (Connection conn = MyDatabase.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, category.getName());
            ps.setString(2, category.getDescription());
            ps.setInt(3, category.getId());

            ps.executeUpdate();
            System.out.println(" Sửa thành công");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM categories WHERE id=?";

        try (Connection conn = MyDatabase.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println(" Xóa thành công");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}