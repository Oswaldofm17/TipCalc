package com.oswaldofm17.tipcalc.entity;

import com.oswaldofm17.tipcalc.db.TipsDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by oswaldofm on 10/23/16.
 */

@Table(database = TipsDatabase.class)

public class TipRecord {

    @PrimaryKey(autoincrement = true)
    int id;
    @Column
    private double bill;
    @Column
    private int tipPercentage;
    @Column
    private Date timestamp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getTip() {
        return bill * (tipPercentage/100d);
    }

    public String getDateFormated() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd, yyyy HH:mm");
        return simpleDateFormat.format(timestamp);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}