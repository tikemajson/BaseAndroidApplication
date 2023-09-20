package com.fatcat.baseapplication.database.entity.account;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/**
 * Created by: Michal Kowalski
 * Creation date: 20.09.2023
 */

@Dao
public interface AccountDao {

    @Insert
    void insertAll(Account... accounts);

    @Query("SELECT * FROM account")
    List<Account> getAllAccounts();

}
