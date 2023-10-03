package com.fatcat.baseapplication.activity.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.fatcat.baseapplication.R;
import com.fatcat.baseapplication.database.entity.account.Account;
import com.fatcat.baseapplication.database.entity.account.AccountDatabase;
import com.fatcat.baseapplication.service.test.TestService;

import java.util.List;

import javax.inject.Inject;
import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    TestService testService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AccountDatabase accountDataBase = Room.databaseBuilder(getApplicationContext(), AccountDatabase.class, "account-database").allowMainThreadQueries().build();

        Account account1 = new Account("kiepondo", "kiepondo@wp.pl");
        Account account2 = new Account("odbit", "odbit@wp.pl");

        accountDataBase.getDao().insert(account1);
        List<Account> list = accountDataBase.getDao().getAllAccounts();

        for (Account acc: list) {
            Log.d("acccounts", acc.getId() + " - " + acc.getName() + " - " + acc.getEmail());
        }
    }
}