package com.company;

import java.sql.Date;

public class Salary {
    private int id;
    private double sum;
    private Date start_date;
    private Date end_date;

    public Salary() {
    }

    public Salary(int id, double sum, Date start_date, Date end_date) {
        this.id = id;
        this.sum = sum;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
