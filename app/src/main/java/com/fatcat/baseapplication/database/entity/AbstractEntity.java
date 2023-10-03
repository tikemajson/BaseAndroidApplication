package com.fatcat.baseapplication.database.entity;

import androidx.room.PrimaryKey;

/**
 * Michal Kowalski
 * 12.09.2023
 */
public abstract class AbstractEntity {

    @PrimaryKey(autoGenerate = true)
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
