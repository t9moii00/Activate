package com.example.activate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;

public class HakuValikko extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hakuvalikko);

        findViewById(R.id.button).setOnClickListener(this);
    }

    public void onClick(View view) {
        Button button;

        if (view instanceof Button) {
            button = (Button) view;
            if (button.getId() == R.id.button) {
                Intent intent = new Intent(this, HakutulosValikko.class);
                startActivity(intent);
            }
        }
    }
}
