package com.phonestore.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/phone_store";
    private static final String USER = "root";
    private static final String PASSWORD = "123456"; // sửa theo máy m

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}