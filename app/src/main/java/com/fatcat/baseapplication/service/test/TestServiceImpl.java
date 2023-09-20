package com.fatcat.baseapplication.service.test;

import javax.inject.Inject;

/**
 * Created by: Michal Kowalski
 * Creation date: 07.09.2023
 */

public class TestServiceImpl implements TestService {

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
}
