package com.fatcat.baseapplication.service.test;

import com.fatcat.baseapplication.database.entity.account.Account;

import java.util.List;

/**
 * Michal Kowalski
 * 07.09.2023
 */
public interface TestService {
    String testMethod();

    Long getId();

    Long addAccount(Account account);

    List<Account> getAllAccounts();
}
