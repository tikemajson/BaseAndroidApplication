package com.fatcat.baseapplication.database.entity.account;

import androidx.room.Dao;
import androidx.room.Query;

import com.fatcat.baseapplication.database.entity.AbstractDao;

import java.util.List;

/**
 * Michal Kowalski
 * 20.09.2023
 */
@Dao
public interface AccountDao extends AbstractDao<Account> {

    @Query("SELECT * FROM account")
    List<Account> getAllAccounts();

}
