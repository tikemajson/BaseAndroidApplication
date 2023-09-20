package com.fatcat.baseapplication.database.entity.account;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by: Michal Kowalski
 * Creation date: 20.09.2023
 */

@Database(entities = {Account.class}, version = 1)
public abstract class AccountDatabase extends RoomDatabase {

    public abstract AccountDao accountDao();

}
