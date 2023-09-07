package com.fatcat.baseapplication.service.test;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * Created by: Michal Kowalski
 * Creation date: 07.09.2023
 */

@Module
@InstallIn(SingletonComponent.class)
public abstract class TestServiceModule {

    @Binds
    public abstract TestService bindTestService(TestServiceImpl testServiceImpl);

}
