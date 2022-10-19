package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DialogActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log.d("DialogActivity", this.toString());
        Log.d("DialogActivity", "task id : " + getTaskId());
        setContentView(R.layout.dialog_layout);

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(DialogActivity.this, NormalActivity.class);
                // Intent intent = new Intent(DialogActivity.this, MainActivity.class);
                // startActivity(intent);

                ActivityControllor.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());  // 杀死当前进程
            }
        });

    }
}