package com.example.assignment.model.order;

import java.time.LocalDate;

public class DateAndRevenue {
    private LocalDate date;
    private double revenue;

    public DateAndRevenue(LocalDate date, double revenue) {
        this.date = date;
        this.revenue = revenue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

}
