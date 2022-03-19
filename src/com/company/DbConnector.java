package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnector {
    public DbConnector() {
    }

    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/bookstore";
        String username = "postgres";
        String password = "5566";

        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public Book saveBook(Book book) {
        return null;
    }

    public int saveGenre(Genre genre) {
        Connection conn = getConnection();
        try {
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate("INSERT INTO \"Genre\"(name) VALUES('" + genre.getName() + "')");
            conn.close();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return 0;
    }
    public List<Genre> getAllGenres(){
        Connection con = getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from \"Genre\"");

            List<Genre> genres = new ArrayList<>();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                Genre genre1 = new Genre();
                genre1.setId(id);
                genre1.setName(name);

                genres.add(genre1);
            }
            con.close();
            return genres;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        return  null;
        }

    public int saveDiscount(Discount discount){
        Connection conn = getConnection();



        try {
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate("insert into \"Discount\" (percent, start_date,  end_date) "+
                    "values (" + discount.getPercent() + "," + discount.getStart_date().toString() + "," + discount.getEnd_date().toString() + ")");
            conn.close();

            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
