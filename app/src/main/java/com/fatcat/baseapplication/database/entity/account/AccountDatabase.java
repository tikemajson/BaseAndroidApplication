package com.fatcat.baseapplication.database.entity.account;

import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.fatcat.baseapplication.database.entity.AbstractDatabase;

import javax.inject.Inject;

/**
 * Created by: Michal Kowalski
 * Creation date: 20.09.2023
 */

@Database(entities = {Account.class}, version = 1)
public abstract class AccountDatabase extends AbstractDatabase<AccountDao> {
    public abstract AccountDao getDao();

}
