package com.fatcat.baseapplication.service.test;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * Michal Kowalski
 * 03.10.2023
 */

@Module
@InstallIn(SingletonComponent.class)
public abstract class TestServiceModuleA {

    @Binds
    public abstract TestService bindTestService(TestServiceImpl testServiceImpl);

}
