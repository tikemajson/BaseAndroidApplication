package com.fatcat.baseapplication.database.entity;

import androidx.room.Dao;
import androidx.room.RoomDatabase;

import com.fatcat.baseapplication.database.entity.account.AccountDao;

/**
 * Created by Michal Kowalski
 * Creation date 29.09.2023
 */
public abstract class AbstractDatabase<D extends AbstractDao> extends RoomDatabase {

}
