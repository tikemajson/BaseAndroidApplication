package com.fatcat.baseapplication.service.test;

import android.app.Application;

import androidx.room.Room;

import com.fatcat.baseapplication.database.entity.account.AccountDatabase;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * Created by: Michal Kowalski
 * Creation date: 07.09.2023
 */

@Module
@InstallIn(SingletonComponent.class)
public abstract class TestServiceModule {

    // https://stackoverflow.com/questions/46618763/dagger2-how-to-use-provides-and-binds-in-same-module
    @Binds
    public abstract TestService bindTestService(TestServiceImpl testServiceImpl);

    @Provides
    public AccountDatabase provideAccountDatabase(Application application) {
         Room.databaseBuilder(application.getApplicationContext(), AccountDatabase.class, "account-database").allowMainThreadQueries().build();
    }

}
