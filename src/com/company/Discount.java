package com.company;

import java.util.Date;

public class Discount {
    private int id;
    private int percent;
    private Date start_date;
    private Date end_date;

    public Discount() {
    }

    public Discount(int id, int percent, Date start_date, Date end_date) {
        this.id = id;
        this.percent = percent;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
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
