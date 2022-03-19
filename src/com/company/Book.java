package com.company;

public class Book {
    private int id;
    private String name;
    private String author;
    private int genre_id;
    private int store_id;
    private int amount;
    private int price_id;

    public Book() {
    }

    public Book(int id, String name, String author, int genre_id, int store_id, int amount, int price_id) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre_id = genre_id;
        this.store_id = store_id;
        this.amount = amount;
        this.price_id = price_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice_id() {
        return price_id;
    }

    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }



}
