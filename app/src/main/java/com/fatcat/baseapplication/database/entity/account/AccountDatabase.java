package com.fatcat.baseapplication.database.entity.account;

import androidx.room.Database;

import com.fatcat.baseapplication.database.entity.AbstractDatabase;

/**
 * Michal Kowalski
 * 20.09.2023
 */

@Database(entities = {Account.class}, version = 1)
public abstract class AccountDatabase extends AbstractDatabase<AccountDao> {

    public abstract AccountDao getDao();

}
