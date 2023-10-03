package com.fatcat.baseapplication.database.entity;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import androidx.room.Upsert;

import java.util.List;

/**
 * Created by Michal Kowalski
 * Creation date 29.09.2023
 */
public interface AbstractDao<E extends AbstractEntity> {

    @Insert
    void insert(E... entity);

    @Update
    void update(E entity);

    @Delete
    void delete(E entity);

}
