package com.fatcat.baseapplication.activity.main;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.fatcat.baseapplication.R;
import com.fatcat.baseapplication.database.entity.account.Account;
import com.fatcat.baseapplication.service.test.TestService;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * Michal Kowalski
 * 07.09.2023
 */
@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    TestService testService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Account account1 = new Account("kiepondo test", "kiepondotest@wp.pl");

        testService.addAccount(account1);
        List<Account> list = testService.getAllAccounts();

        for (Account acc: list) {
            Log.d("acccounts", acc.getId() + " - " + acc.getName() + " - " + acc.getEmail());
        }
    }
}