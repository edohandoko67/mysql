package com.example.backup.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.backup.R;
import com.example.backup.login.Login;

public class HomeActivity extends AppCompatActivity {
    ImageView imgGetStarted, imgSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imgGetStarted = findViewById(R.id.imgStarted);
        imgSign = findViewById(R.id.imgSignIn);

        imgSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }
}