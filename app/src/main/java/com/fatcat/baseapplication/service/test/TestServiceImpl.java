package com.fatcat.baseapplication.service.test;

import com.fatcat.baseapplication.database.entity.account.Account;
import com.fatcat.baseapplication.database.entity.account.AccountDatabase;

import java.util.List;

import javax.inject.Inject;

/**
 * Michal Kowalski
 * 07.09.2023
 */
public class TestServiceImpl implements TestService {

    @Inject
    AccountDatabase accountDatabase;

    @Inject
    TestServiceImpl() {
    }

    @Override
    public String testMethod() {
        return "TEST METHOD MESSAGE";
    }

    @Override
    public Long getId() {
       return 1L;
    }

    @Override
    public Long addAccount(Account account) {
        accountDatabase.getDao().insert(account);
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountDatabase.getDao().getAllAccounts();
    }
}
