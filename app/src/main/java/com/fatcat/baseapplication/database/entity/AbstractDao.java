package com.fatcat.baseapplication.database.entity;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

/**
 * Michal Kowalski
 * 29.09.2023
 */
public interface AbstractDao<E extends AbstractEntity> {

    @Insert
    void insert(E... entity);

    @Update
    void update(E entity);

    @Delete
    void delete(E entity);

}
