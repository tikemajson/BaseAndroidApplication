package com.fatcat.baseapplication.service.test;

import android.app.Application;

import androidx.room.Room;

import com.fatcat.baseapplication.database.entity.account.AccountDatabase;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

/**
 * Michal Kowalski
 * 07.09.2023
 */

@Module(includes = TestServiceModuleA.class)
@InstallIn(SingletonComponent.class)
public class TestServiceModule {

    @Provides
    public AccountDatabase provideAccountDatabase(Application application) {
        return Room.databaseBuilder(application.getApplicationContext(), AccountDatabase.class, "account-database").allowMainThreadQueries().build();
    }

}
