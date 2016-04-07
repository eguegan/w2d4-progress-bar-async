package com.example.admin.asynctask;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * Created by admin on 4/7/2016.
 */
public class FirstTask extends AsyncTask<Void, Integer, Void> {
    private ProgressBar mProgress;
    private static final String TAG = "TAG_";

    public FirstTask(ProgressBar eProgress){
        mProgress = eProgress;
    }
    @Override
    protected Void doInBackground(Void... params) {
        for(int i = 1; i <= 100; i++){
            publishProgress(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        Log.d(TAG, "onPostExecute: ");
        super.onPostExecute(aVoid);
    }

    @Override
    protected void onPreExecute() {
        Log.d(TAG, "onPreExecute: ");
        mProgress.setProgress(0);
        super.onPreExecute();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        Log.d(TAG, "onProgressUpdate: ");
        mProgress.setProgress(values[0]);
        super.onProgressUpdate(values);
    }
}
