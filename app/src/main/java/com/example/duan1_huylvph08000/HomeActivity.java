package com.example.duan1_huylvph08000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("English Learning");
    }
    public void Voca(View view){
        intent = new Intent(HomeActivity.this, ListSubjectWordActivity.class);
        startActivity(intent);
    }
    public void dictonary(View view){
        intent = new Intent(HomeActivity.this, DictonaryActivity.class);
        startActivity(intent);
    }
    public void introduction(View view){
        intent = new Intent(HomeActivity.this, IntroductionActivity.class);
        startActivity(intent);
    }
}
