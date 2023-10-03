package com.fatcat.baseapplication.service.test;

import com.fatcat.baseapplication.database.entity.account.Account;

/**
 * Created by: Michal Kowalski
 * Creation date: 07.09.2023
 */

public interface TestService {
    String testMethod();

    Long getId();

    Long addAccount(Account account);
}
