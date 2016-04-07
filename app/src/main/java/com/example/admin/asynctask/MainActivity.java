package com.example.admin.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    private ProgressBar mProgress;
    private FirstTask mFirstTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgress = (ProgressBar) findViewById(R.id.am_progress_1);
        mFirstTask = new FirstTask(mProgress);
    }

    public void doTask(View v) {
        mFirstTask.execute();
    }

    public void stopTask(View v){
        mFirstTask.cancel(true);
    }
}
