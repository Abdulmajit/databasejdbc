package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        DbConnector dbConnector = new DbConnector();
//        Genre genre = new Genre();
//        genre.setName("adventure");
//        dbConnector.saveGenre(genre);
//
//        List<Genre> genreList = dbConnector.getAllGenres();
//        System.out.println(genreList.size());

        Discount discount = new Discount();
        discount.setPercent(15);
        discount.setStart_date(new Date());
        discount.setEnd_date(new Date());
        dbConnector.saveDiscount(discount);


    }

}
