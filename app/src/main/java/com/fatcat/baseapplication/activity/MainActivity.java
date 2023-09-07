package com.fatcat.baseapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fatcat.baseapplication.R;
import com.fatcat.baseapplication.service.test.TestService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.HiltAndroidApp;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    TestService testService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String testMessage = testService.testMethod();
        System.out.println("[DI TEST]: " + testMessage);
    }
}