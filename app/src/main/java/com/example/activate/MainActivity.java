package com.example.activate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button10:
                intent = new Intent(this, HakuValikko.class);
                startActivity(intent);
                break;
            }
        }
    }


