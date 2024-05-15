package com.example.QuizApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.QuizApp.other.Constants;

public class QuizOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_option);

        CardView cvMobile = findViewById(R.id.cvMath);
        CardView cvOperational = findViewById(R.id.cvOperational);
        CardView cvSecurity = findViewById(R.id.cvSecurity);

        findViewById(R.id.imageViewQuizOption).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, OperationalOrSecurityQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.MobileDevelop));
                startActivity(intent);
            }
        });

        cvOperational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, OperationalOrSecurityQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.operational_Research));
                startActivity(intent);
            }
        });

        cvSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuizOptionActivity.this, OperationalOrSecurityQuizActivity.class);
                intent.putExtra(Constants.SUBJECT,getString(R.string.information_Security));
                startActivity(intent);
            }
        });

    }
}