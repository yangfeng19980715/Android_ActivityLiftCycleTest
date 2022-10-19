package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class NormalActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log.d("NormalActivity", this.toString());
        Log.d("NormalActivity", "task id : " + getTaskId());
        setContentView(R.layout.normal_layout);

        Button button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(NormalActivity.this, NormalActivity.class);
                Intent intent = new Intent(NormalActivity.this, DialogActivity.class);
                startActivity(intent);

            }
        });


    }
}