package com.fatcat.baseapplication.database.entity.account;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;

import com.fatcat.baseapplication.database.entity.AbstractEntity;

/**
 * Created by: Michal Kowalski
 * Creation date: 12.09.2023
 */

@Entity
public class Account extends AbstractEntity {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "email")
    private String email;

    @Ignore
    public Account() {

    }

    public Account(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
